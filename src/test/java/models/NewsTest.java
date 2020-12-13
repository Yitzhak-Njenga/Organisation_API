package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewsTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    public News setUpDeptNews(){
        return new News("Yitzhak","Daily News",3);
    }


    @Test
    public void News_newsInstanceOfNews_true() {
        assertTrue(setUpDeptNews() instanceof News);
    }

    @Test
    public void getContent_newsInstantiatesWithContent_true() {
        assertEquals("Daily News",setUpDeptNews().getCotent());
    }

    @Test
    public void getWrittenBy_newsInstantiatesWithWrittenBy_true() {
        assertEquals("Yitzhak",setUpDeptNews().getWriitenBy());
    }

    @Test
    public void setContent_true() {
        News testNews = setUpDeptNews();
        testNews.setCotent("These are my news");
        assertNotEquals("Daily News",testNews.getCotent());
    }

    @Test
    public void setWrittenBy_true() {
        News testNews = setUpDeptNews();
        testNews.setWriitenBy("Njenga");
        assertNotEquals("Yitzhak",testNews.getWriitenBy());
    }
}
