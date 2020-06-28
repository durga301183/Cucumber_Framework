package StepDefinition;

import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class MyStepdefs {
    //these variables are used across  all the methods
    public WebDriver driver;
    public LoginPage lp;

    @Given("User Launches chrome browser")
    public void userLaunchesChromeBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        lp = new LoginPage(driver);
    }

    @When("User opens URL {string}")
    public void userOpensURL(String url) {
        driver.get(url);
    }

    @And("User enters Email as {string} and Password as {string}")
    public void userEntersEmailAsAndPasswordAs(String Email, String password) throws InterruptedException {
        lp.validateLogin(Email, password);
        Thread.sleep(3000);

    }

    @And("click on login button")
    public void clickOnLoginButton() {
        lp.clickLogin();
    }

    @Then("Page title should be {string}")
    public void pageTitleShouldBe(String title) {

        if(driver.getPageSource().contains("Login was unsuccessful.")) {
            Assert.assertTrue(false, "invalid login");
            driver.close();
        }
        else{

            Assert.assertEquals(title, driver.getTitle());
        }

    }

    @When("user clicks on Logout link")
    public void userClicksOnLogoutLink() throws InterruptedException {

        lp.clickLogout();
        Thread.sleep(3000);
    }

    @And("close browser")
    public void closeBrowser()
    {
        driver.quit();
    }
}
