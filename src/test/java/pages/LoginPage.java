package pages;

import Utils.TestBase;
import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriver.Driver;


public class LoginPage extends TestBase {

    // URL
    public static String url = BaseURL;

    // LOCATORS
    @FindBy(id = "EmailId")
    public WebElement usernameField;
    @FindBy(id = "Password")
    public WebElement passwordField;
    @FindBy(id = "btnSubmit")
    public WebElement continueButton;

    // METHODS
    public void openPage(){
        Driver.getWebdriver().get(url);
    }

    public void volunteerLogin(){
        usernameField.sendKeys(volunteerUser);
        continueButton.click();
        waitForElement(passwordField, defaultTimeOut);
        passwordField.sendKeys(volunteerPassword);
        continueButton.click();
    }

//    public void reviewerLogin(){
//        usernameField.sendKeys(reviewerUsername);
//        passwordField.sendKeys(reviewerPassword);
//        loginButton.click();
//        waitForElement(profileLink, 5);
//    }
//
//    public void adminLogin(){
//        usernameField.sendKeys(adminUsername);
//        passwordField.sendKeys(adminPassword);
//        loginButton.click();
//        waitForElement(profileLink, 5);
//    }
}
