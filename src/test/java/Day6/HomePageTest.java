package Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)
public class HomePageTest {

    WebDriver driver;
    @BeforeMethod
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test  //Success Test
    public void CloseBrowser() {
        driver.close();
        Reporter.log("Driver Closed After Testing");
    }

    @Test  //Success Test
    public void ValidateBrowser() {
        Reporter.log("Validate browser");
    }

    @Test //Failed Test
    public void OpenBrowser() {

        driver.get("https://demo.guru99.com/test/guru99home/");
        String expectedTitle = "Demo Guru99 page";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
    }
    private int i = 1;

    @Test(successPercentage = 60, invocationCount = 3) //Failing Within Success
    public void AccountTest() {
        if(i < 2)
            Assert.assertEquals(1 , 0);
        i++;
    }

    @Test  // Skip Test
    public void SkipTest() {
        throw new SkipException("Skipping The Test Method ");
    }

}
