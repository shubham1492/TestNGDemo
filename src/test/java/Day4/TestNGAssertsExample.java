package Day4;

import Day6.TestNGListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)
public class TestNGAssertsExample {

    WebDriver driver;
    @BeforeMethod
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test(priority = 0)
    public void CloseBrowser() {
        driver.close();
        Reporter.log("Driver Closed After Testing");
    }

    @Test (priority = -1)
    public void OpenBrowser() {
        Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
        Reporter.log("Launching Google Chrome Driver version 81 for this test");

        driver.get("https://demoqa.com/");

        Reporter.log("The website used was DemoQA for this test", true);
        String expectedTitle = "ToolsQA Website";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle,"Title of the page do not matched");

        Reporter.log("rest of code");


    }





}
