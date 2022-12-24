package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserExample {

    public WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void setup(String browser){

        if(browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        driver.get("https://demoqa.com/");

    }

    @Test
    public void login(){
        driver.findElement(By.xpath("//img[@alt=\"Selenium Online Training\"]")).click();
    }


    @AfterClass
    public void tearDown(){
      driver.quit();
    }


}
