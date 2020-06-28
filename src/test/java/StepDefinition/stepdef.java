package StepDefinition;

import BaseClass.BaseTest;
import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepdef extends  BaseTest {
   public  WebDriver driver;

    @Given("User is on Greencart Landing page")
    public void userIsOnGreencartLandingPage() {
     BaseTest.openDriver();

        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\G S Sastry\\Selenium drivers\\chromedriver\\chromedriver.exe ");
      //  WebDriverManager.chromedriver().setup();
      //  driver = new ChromeDriver();
       // driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @When("User searched for <vegetable> vegetable")
    public void userSearchedForVegetableVegetable() throws InterruptedException {
        HomePage hp = new HomePage(driver);
        hp.search();

        //driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys("str");
        Thread.sleep(3000);

    }
    @And("added items to cart")
    public void addedItemsToCart() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='increment']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
        Thread.sleep(2000);

    }

    @And("User proceeded to checkout page for purchase")
    public void userProceededToCheckoutPageForPurchase() {
        driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();



    }

    @Then("verify selected <vegetable> items are displayed in checkout page")
    public void verifySelectedVegetableItemsAreDisplayedInCheckoutPage() {

        String act_result = driver.findElement(By.xpath("//p[@class='product-name']")).getText();
        Assert.assertEquals("Brinjal - 1 Kg", act_result);

    }



}

