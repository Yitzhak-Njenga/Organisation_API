package models;

import models.Users;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    public Users setUpUser() {
        return new Users("Yitzhak","CEO","manager");
    }

    @Test
    public void Users_departmentInstanceOfDepartments_true() {
        assertTrue(setUpUser() instanceof Users);
    }


    @Test
    public void getName_userInstantiatesWithName_true() {
        assertEquals("Yitzhak", setUpUser().getname());
    }

    @Test
    public void getPosition_userInstantiatesWithUserposition_true() {
        assertEquals("Ceo", setUpUser().getPosition());
    }

    @Test
    public void getRoles_userInstantiatesWithUserRoles_true() {
        assertEquals("employ", setUpUser().getRoles());
    }

    @Test
    public void setName_true() {
        Users testUser = setUpUser();
        testUser.setname("Britney");
        assertNotEquals("Fancy", testUser.getname());
    }

    @Test
    public void setPosition_true() {
        Users testUser = setUpUser();
        testUser.setPosition("");
        assertNotEquals("Manager", testUser.getPosition());
    }

    @Test
    public void setEmpNumber_true() {
        Users testUser = setUpUser();
        testUser.setRoles("lead");
        assertNotEquals("govern", testUser.getRoles());
    }
}