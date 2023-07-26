package Teststeps;

import Basetest.Baseclass1;
import Pageobjects.PNRstatus;
import org.testng.annotations.Test;

public class PNRsteps extends Baseclass1 {

    @Test(priority = 1)
    public void setpnr() throws InterruptedException {
        PNRstatus page = new PNRstatus(driver);
        page.setPnr();
        Thread.sleep(3000);

    }

    @Test(priority = 2)
    public void search() throws InterruptedException {
        PNRstatus page = new PNRstatus(driver);
        page.setSearch();
        Thread.sleep(3000);

        reports.initiate1();

    }
}
