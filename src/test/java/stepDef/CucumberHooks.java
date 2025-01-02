package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static java.sql.DriverManager.drivers;
import static java.sql.DriverManager.getDriver;

public class CucumberHooks extends test.java.BaseTest {

    @Before
    public void beforeTest(){
        getDriver();
    }

    @After
    public void afterTest(){
        driver.close();
    }



}
