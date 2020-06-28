package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    By search = By.xpath ("//input[@type ='search']");


    public void search(){
        driver.findElement(search).sendKeys("arg");
    }
}
