package Teststeps;

import Basetest.Baseclass;
import Pageobjects.Bookingpage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Bookingsteps extends Baseclass {

 //WebDriver driver;


    @Test(priority = 1)
    public void setFrom1() throws InterruptedException {
        Bookingpage page = new Bookingpage(driver);
        page.setFrom();
        Thread.sleep(3000);

    }

    @Test(priority = 2)
    public void setEnter1() throws InterruptedException {
        Bookingpage page = new Bookingpage(driver);
        page.setEnter();
        Thread.sleep(3000);
    }

    @Test(priority = 3)
    public void setSelect1() throws InterruptedException {
        Bookingpage page = new Bookingpage(driver);
        page.setSelect();
        Thread.sleep(3000);
    }

    @Test(priority = 4)
    public void setTo1() throws InterruptedException {
        Bookingpage page = new Bookingpage(driver);
        page.setTo();
        Thread.sleep(3000);
    }

    @Test(priority = 5)
    public void setClick1() throws InterruptedException {
        Bookingpage page = new Bookingpage(driver);
        page.setClick();
        Thread.sleep(3000);
    }


    @Test(priority = 6)
    public void setCity() throws InterruptedException {
        Bookingpage page = new Bookingpage(driver);
        page.setCity();
        Thread.sleep(3000);
    }

    @Test(priority = 7)
    public void setDate() throws InterruptedException {
        Bookingpage page = new Bookingpage(driver);
        page.setDate();
        Thread.sleep(3000);
    }

    @Test(priority = 8)
    public void SDate1() throws InterruptedException {
        Bookingpage page = new Bookingpage(driver);
        page.SDate1();
        Thread.sleep(3000);
    }

    @Test(priority = 9)
    public void setSearch() throws InterruptedException {
        Bookingpage page = new Bookingpage(driver);
        page.search();
        Thread.sleep(3000);
    }

    @Test(priority = 10)
    public void setQuota() throws InterruptedException {
        Bookingpage page = new Bookingpage(driver);
        page.setQuota();
        Thread.sleep(3000);
    }

    @Test(priority = 11)
    public void setOrigin1() throws InterruptedException {
        Bookingpage page = new Bookingpage(driver);
        page.setOrigin();
        Thread.sleep(3000);
    }

    @Test(priority = 12)
    public void setDestination() throws InterruptedException {
        Bookingpage page = new Bookingpage(driver);
        page.setDestination();
        Thread.sleep(3000);
    }

    @Test(priority = 13)
    public void setArrival1() throws InterruptedException {
        Bookingpage page = new Bookingpage(driver);
        page.setArrival();
        Thread.sleep(3000);
    }

//    @Test(priority = 14)
//    public void setDeparture1() throws InterruptedException {
//        Bookingpage page = new Bookingpage(driver);
//        page.setDeparture();
//        Thread.sleep(3000);
//    }

    @Test(priority = 14)
    public void setCoach1() throws InterruptedException {
        Bookingpage page = new Bookingpage(driver);
        page.setCoach();
        Thread.sleep(3000);

        reports.initiate();
    }

}
