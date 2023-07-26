package Extentreports;

import Basetest.Baseclass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;

public class ExtentReport extends Baseclass {

    //public static void main(String args[]){

    ExtentReports ExtentReport;

    ExtentTest test;



    public ExtentReport(WebDriver driver) {
        super();
    }


    public void initiate() {

        ExtentReports ExtentReport = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\PranathiGoketi-Kairo\\Documents\\Confirmtktt\\report.html");
        ExtentReport.attachReporter(spark);


        ExtentTest test1 = ExtentReport.createTest("Login To The Browser");
        test1.log(Status.INFO, "Launching Of Booking Page");
        test1.log(Status.PASS, "Test passed");

        test = ExtentReport.createTest("Enter From");
        test.log(Status.INFO, "Enter the From city");
        test.log(Status.PASS, "Test passed");

        test = ExtentReport.createTest("Enter");
        test.log(Status.INFO, "Enter the city");
        test.log(Status.PASS, "Test passed");

        test = ExtentReport.createTest("Select city");
        test.log(Status.INFO, "Select the city");
        test.log(Status.PASS, " Test passed");

        test = ExtentReport.createTest("Enter To");
        test.log(Status.INFO, "Enter the To city");
        test.log(Status.PASS, "Test passed");

        test = ExtentReport.createTest("Enter1");
        test.log(Status.INFO, "Enter the city");
        test.log(Status.PASS, "Test passed");

        test = ExtentReport.createTest("Set the City");
        test.log(Status.INFO, "Set city");
        test.log(Status.PASS, "Test passed");

        test = ExtentReport.createTest("Calendar");
        test.log(Status.INFO, "Click on the calendar");
        test.log(Status.PASS, "Test passed");

        test = ExtentReport.createTest("Select Date");
        test.log(Status.INFO, "Set the date of journey");
        test.log(Status.PASS, "Test passed");

        test = ExtentReport.createTest("Search");
        test.log(Status.INFO, "Click on search button");
        test.log(Status.PASS, "Test passed");

        test = ExtentReport.createTest("Quota filter");
        test.log(Status.INFO, "select the quota");
        test.log(Status.PASS, "Test passed");

        test = ExtentReport.createTest("Origin filter");
        test.log(Status.INFO, "Select the origin station");
        test.log(Status.PASS, "Test passed");

        test = ExtentReport.createTest("Destination filter");
        test.log(Status.INFO, "Select the Destination filter");
        test.log(Status.PASS, "Test passed");

        test = ExtentReport.createTest("Arrival time quota");
        test.log(Status.INFO, "Select the arrival time");
        test.log(Status.PASS, "Test passed");

        test = ExtentReport.createTest("Select Coach");
        test.log(Status.INFO, "Click on Coach");
        test.log(Status.PASS, "Test passed");


        ExtentReport.flush();


    }

    private void Extentreports(WebDriver driver) {
        this.ExtentReport(driver);
    }

    private void ExtentReport(WebDriver driver) {
    }


}





