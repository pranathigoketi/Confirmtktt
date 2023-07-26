package Basetest;

import Extentreports.ExtentReport;
import Extentreports.ExtentReport1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Baseclass1 {
    public static WebDriver driver;

    public static ExtentReport1 reports = new ExtentReport1(driver);

    @BeforeTest
    public void LaunchBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.confirmtkt.com/pnr-status");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));


    }

    @AfterTest
    public void testafter(){
        driver.quit();
    }
}
