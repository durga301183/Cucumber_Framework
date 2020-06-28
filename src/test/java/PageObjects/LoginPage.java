package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    //constructor to initiate the driver and page objects

    public LoginPage(WebDriver driver) {
              this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    WebElement txtEmail;

    @FindBy(id = "Password")
    WebElement txtPassword;

    @FindBy(xpath = "//input[@value = 'Log in']")
    WebElement btnLogin;

    @FindBy(linkText = "Logout")
    WebElement lnkLogout;

    public void validateLogin(String uname, String pwd) {
        txtEmail.clear();
        txtEmail.sendKeys(uname);
        txtPassword.sendKeys(pwd);

    }
        public void clickLogin ()
        {
            btnLogin.click();
        }

       public void clickLogout(){
        lnkLogout.click();
       }




    }


