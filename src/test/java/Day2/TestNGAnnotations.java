package Day2;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @Test
    public void tesCase1(){
        System.out.println("First Test Case");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("This will execute after every method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("This will execute before the class");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("This will execute After the class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This will execute Before the Test");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("This will execute After the Test");
    }
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("This will execute Before the Test suit");
    }
    @AfterSuite
    public void AfterSuit(){
        System.out.println("This will execute After the Test suit");
    }

}
