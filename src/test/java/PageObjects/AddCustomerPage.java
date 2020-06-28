package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

    public WebDriver driver;
   //constructor taking driver from actual test

    public AddCustomerPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "Email")
    WebElement txtEmail;

    @FindBy(id = "Password")
    WebElement txtPassword;

    @FindBy(xpath = "//input[@value = 'Log in']")
    WebElement btnLogin;

    @FindBy(xpath = "a[@href = '#']//span[contains(text(), 'Customers')]")
    WebElement customerlnk;

    @FindBy(xpath ="//span[@class= 'menu-item-title']")
    WebElement customerclk;

    @FindBy(xpath = "//a[@class = 'btn bg-blue']")
    WebElement addbtn;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement txtemail;

    @FindBy(xpath = "//input[@id = 'Password']")
    WebElement getTxtPassword;
//another way of finding the element
   By lstitemAdministrators = By.xpath("//li[contains(text(), 'Administrators']");
    By lstitemRegistered = By.xpath("//li[contains(text(), 'Registered']");
    By lstitemGuests = By.xpath("//li[contains(text(), 'Guests']");
    By lstitemVendors = By.xpath("//li[contains(text(), 'Vendors']");

    By drpmgrofvendor = By.xpath("//*[@id = 'VendorId']");
    By rdMaleGender = By.id("Gender_Male");
    By rdFeMaleGender = By.id("Gender_Female");

    By txtFirstName = By.xpath("//input[@id ='FirstName']");
    By txtLastName = By.xpath("//input[@id = 'LastName']");

    By txtDob = By.xpath( "//input[@id = 'DateOfBirth']");
    By txtCompanyName = By.xpath("//input[@id ='Company']");
    By txtAdminContent = By.xpath("//textarea[@id ='AdminComment']");
    By btnSave = By.xpath("//button[@name ='save']");



//Action Methods

public void clickoncustomermenu() {
    customerlnk.click();
}

public void clickoncustomermenuitem() {
    customerclk.click();

}

public void clickonadditem() {
    addbtn.click();

}
public void setEmail(String email){
    txtemail.sendKeys();


}

public void setPassword(String password){
    getTxtPassword.sendKeys(password);

}
}