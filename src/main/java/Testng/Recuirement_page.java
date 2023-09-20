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

public class Recuirement_page {


    private static final String droupdown = "//*[@role='option']/span[normalize-space()='%s']";
    WebDriver driver;
    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    WebElement recruitment;


    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/di" +
            "v[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement job_title;

    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > d" +
            "iv:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) " +
            "> div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1" +
            ") > div:nth-child(1) > div:nth-child(2) > i:nth-child(1)")
    WebElement vacancy;

    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > " +
            "div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) >" +
            " div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) >" +
            " div:nth-child(1) > div:nth-child(2) > i:nth-child(1)")
    WebElement hiring_man;

    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-" +
            "child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-c" +
            "hild(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > d" +
            "iv:nth-child(1) > div:nth-child(2) > i:nth-child(1)")
    WebElement status;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement can_name;

    @FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
    WebElement keyword;

    @FindBy(xpath = "//input[@placeholder='From']")
    WebElement date_of_application;

    @FindBy(xpath = "//input[@placeholder='To']")
    WebElement application_to_date;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/" +
            "form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement method_of_application;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement search;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement reset;


    public Recuirement_page(WebDriver d) {

        driver = d;

        PageFactory.initElements(d, this);
    }

    public void click_recruitment() {

        recruitment.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlContains("/recruitment/"));
    }

    public void select_job_title(String select_title) {

        job_title.click();

        driver.findElement(By.xpath(format(droupdown, select_title))).click();
    }

    public void select_vacancy(String sec_vacancy) {

        vacancy.click();

        driver.findElement(By.xpath(format(droupdown, sec_vacancy))).click();

    }

    public void select_hiring_manager(String sec_h_m) {

        hiring_man.click();

        driver.findElement(By.xpath(format(droupdown, sec_h_m))).click();

    }

    public void select_status(String sec_stautus) {

        status.click();

        driver.findElement(By.xpath(format(droupdown, sec_stautus))).click();
    }

    public void enter_canditate_name(String canditate_name) {

        can_name.sendKeys(canditate_name);
    }

    public void enter_keyword(String ent_key) {

        keyword.sendKeys(ent_key);

    }

    public void select_date_of_application(String setdate) {

        date_of_application.sendKeys(setdate);
    }

    public void select_application_to_date(String to_date) {

        application_to_date.sendKeys(to_date);
    }

    public void select_method_of_application(String met_application) {

        method_of_application.click();

        driver.findElement(By.xpath(format(droupdown, met_application))).click();
    }

    public void clicksearch() {

        search.click();
    }

    public void clickreset() {

        reset.click();
    }

}
