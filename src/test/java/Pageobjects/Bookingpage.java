package Pageobjects;

import Basetest.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bookingpage extends Baseclass {

   public  WebDriver driver;

    public Bookingpage(WebDriver driver) {
        this.driver = driver;
    }

    By from = By.xpath("//label[@for=\"source-station\"]");


    public void setFrom() {
        driver.findElement(from).click();
    }

    By enter = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]");

    public void setEnter() {
        driver.findElement(enter).sendKeys("pune");
    }


    By select = By.xpath("//a[@id='source-item-0']");

    public void setSelect() {
        driver.findElement(select).click();
    }

    By to = By.xpath("//label[@for=\"destination-station\"]");

    public void setTo(){
        driver.findElement(to).click();
    }

    By click = By.xpath("//input[@placeholder='Enter to']");

    public void setClick(){
        driver.findElement(click).sendKeys("HYD");
    }

//    By city = By.xpath("//a[@id='destination-item-0']");
    //mark[@class='rbt-highlight-text']
    By city = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/a[1]");


    public void setCity(){
        driver.findElement(city).click();
    }

    By Date = By.xpath("//input[@id=\"dateOfJourney\"]");

    public void setDate(){
        driver.findElement(Date).click();
    }

    By SDate = By.xpath("(//p[@class=\"MuiTypography-root MuiTypography-body2 MuiTypography-colorInherit\"])[37]");

    public void SDate1(){
        driver.findElement(SDate).click();
    }
    By Search = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/button");

    public void search(){
        driver.findElement(Search).click();
    }

    By quota = By.xpath("//input[@value=\"GN\"]");

    public void setQuota(){
        driver.findElement(quota).click();
    }

    By origin = By.xpath("//input[@value=\"PUNE\"]");

    public void setOrigin(){
        driver.findElement(origin).click();
    }

    By Destination = By.xpath("//input[@value=\"BMT\"]");

    public void setDestination(){
        driver.findElement(Destination).click();
    }

    By arrival = By.xpath("(//span[@class=\"normal\"])[2]");

    public void setArrival(){
        driver.findElement(arrival).click();
    }

//    By departure = By.xpath("(//span[@class=\"normal\"])[5]");
//
//    public void setDeparture(){
//        driver.findElement(departure).click();
//    }

    By coach = By.xpath("(//div[@class=\"main-content\"])[1]");

    public void setCoach(){
        driver.findElement(coach).click();
    }
}



