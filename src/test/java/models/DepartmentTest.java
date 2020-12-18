package models;

import models.Department;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotEquals;

public class DepartmentTest {


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    public Department setUpDept(){
        return new Department("Accounts","Deals with money",32);
    }

    @Test
    public void getEmpNumber_departmentInstantiatesWithEmpNumber_true() {
        assertEquals(32,setUpDept().getdept_empnumber());
    }

    @Test
    public void setDeptName_true() {
        Department testDept = setUpDept();
        testDept.setdept_deptname("HR");
        assertNotEquals("Accounts",testDept.getdept_deptname());
    }

    @Test
    public void setDescription_true() {
        Department testDept = setUpDept();
        testDept.setdept_description("Money");
        assertNotEquals("Deals with money",testDept.getdept_description());
    }

    @Test
    public void setEmpNumber_true() {
        Department testDept = setUpDept();
        testDept.setdept_empnumber(43);
        assertNotEquals(32,testDept.getdept_empnumber());
    }

}
