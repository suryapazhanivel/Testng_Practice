package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.String.format;

public class Pimpage {

    private static final String stautus_dropdown = "//*[@role='option']/span[normalize-space()='%s']";
    WebDriver driver;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")
    WebElement click_pim;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement employee_name;

    @FindBy(xpath = "(//input)[3]")
    WebElement employee_id;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[" +
            "1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement employee_status;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/d" +
            "iv[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement include;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/" +
            "div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement superviser_name;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]" +
            "/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement job_title;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/d" +
            "iv[7]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement sub_unit;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement search;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement reset;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement add;


    public Pimpage(WebDriver d) {

        driver = d;

        PageFactory.initElements(d, this);

    }

    public void click_pim_botton() {

        click_pim.click();
    }

    public void Enter_employee_name(String empname) {

        employee_name.sendKeys(empname);
    }

    public void enter_employee_id(String emp_id) {

        employee_id.sendKeys(emp_id);
    }

    public void Select_employee_stautus(String status) {

        employee_status.click();

        driver.findElement(By.xpath(format(stautus_dropdown, status))).click();
    }

    public void select_include(String s_include) {

        include.click();

        driver.findElement(By.xpath(format(stautus_dropdown, s_include))).click();
    }

    public void enter_supervisor_name(String S_name) {

        superviser_name.sendKeys(S_name);
    }

    public void Select_jobtitle(String s_title) {

        job_title.click();

        driver.findElement(By.xpath(format(stautus_dropdown, s_title))).click();
    }

    public void select_sub_unit(String s_sub_unit) {

        sub_unit.click();

        driver.findElement(By.xpath(format(stautus_dropdown, s_sub_unit))).click();

    }

    public void select_search() {

        search.click();
    }
}
