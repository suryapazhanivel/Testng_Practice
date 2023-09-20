package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

    WebDriver driver;

    @FindBy(name = "username")
    WebElement username;


    //    @FindBy
//    WebElement username;
    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement clicklogin;

    public Login_page(WebDriver d) {

        driver = d;
        PageFactory.initElements(d, this);
    }

    public void enterusername(String user) {
        username.sendKeys(user);

    }

    public void enterpassword(String pass) {
        password.sendKeys(pass);

    }

    public void clickloginbotton() {
        clicklogin.click();
    }
}