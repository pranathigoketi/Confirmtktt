package Pageobjects;

import Basetest.Baseclass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PNRstatus extends Baseclass1 {

    public WebDriver driver;

    public PNRstatus(WebDriver driver) {
        this.driver = driver;
    }
    By pnr = By.xpath("//input[@id=\"pnr-text\"]");
    public void setPnr(){
        driver.findElement(pnr).sendKeys("4329861238");
    }

    By search = By.xpath("//button[@type='submit']");
    public void setSearch(){
        driver.findElement(search).click();
    }
}
