package Extentreports;

import Basetest.Baseclass1;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;

public class ExtentReport1 extends Baseclass1 {
    ExtentReports ExtentReport1;

    ExtentTest test;


    public ExtentReport1(WebDriver driver) {
        super();
    }


    public void initiate1() {

        ExtentReports ExtentReport1 = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\PranathiGoketi-Kairo\\Documents\\Confirmtktt\\report.html");
        ExtentReport1.attachReporter(spark);

        ExtentTest test1 = ExtentReport1.createTest("Login To The URL");
        test1.log(Status.INFO, "Launching Of PNR Page");
        test1.log(Status.PASS, "Test passed");

        test = ExtentReport1.createTest("Search button");
        test.log(Status.INFO, "Click on search button");
        test.log(Status.PASS, "Test passed");

        ExtentReport1.flush();
    }

}
