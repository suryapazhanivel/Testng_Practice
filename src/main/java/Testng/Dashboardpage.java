package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardpage {

    WebDriver driver;

    @FindBy(xpath = "//p[normalize-space()='(1) Pending Self Review']")
    WebElement pending_self_review;

    @FindBy(xpath = "//button[normalize-space()='View']")
    WebElement my_review;

    public Dashboardpage(WebDriver d) {
        driver = d;

        PageFactory.initElements(d, this);
    }

    public void clickbotton() {

        pending_self_review.click();

    }

    public void clickviewbotton() {

        my_review.click();
    }
}
