package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.String.format;

public class Adminpage {

    private static final String DROPDOWN_OPTIONS = "//div[@role='option']/span[normalize-space()='%s']";
    WebDriver driver;
    @FindBy(xpath = "//span[normalize-space()='Admin']")
    WebElement Adminclick;

    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-" +
            "field-bottom-space']//div//input[@class='oxd-" +
            "input oxd-input--active']")
    WebElement system_username;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/" +
            "div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]" +
            "/div[1]/div[1]/div[2]/i[1]")
    WebElement userrole;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement Employee_hint;

    @FindBy(xpath = "(//i)[13]")
    WebElement Stautus;

    @FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
    WebElement Search;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement Reset;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement Addbotton;

    public Adminpage(WebDriver d) {

        driver = d;

        PageFactory.initElements(d, this);

    }

    public void Adminclickbotton() {

        Adminclick.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlContains("/admin/"));
    }

    public void enter_system_username(String username) {

        system_username.sendKeys(username);
    }

    public void Select_user_role(String role) {

        userrole.click();
        driver.findElement(By.xpath(format(DROPDOWN_OPTIONS, role))).click();

    }

    public void Enter_empolee_name(String employee_name) {

        Employee_hint.sendKeys(employee_name);

    }

    public void click_select(String clicks) {

        Stautus.click();

        driver.findElement(By.xpath(format(DROPDOWN_OPTIONS, clicks))).click();
    }

    public void click_search_botton() {

        Search.click();
    }
}