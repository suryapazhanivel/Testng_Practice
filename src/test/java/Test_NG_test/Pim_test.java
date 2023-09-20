package Test_NG_test;

import Testng.Login_page;
import Testng.Pimpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Pim_test {
    @Test(priority = 4)
    public void pim() {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        Login_page lopage = new Login_page(driver);


        lopage.enterusername("Admin");
        lopage.enterpassword("admin123");
        lopage.clickloginbotton();

        if (driver.getPageSource().contains("OrangeHRM")) {
            System.out.println("your registration is sucess");
        } else {

            System.out.println("your rigistration is fail");
        }


        Pimpage PIM = new Pimpage(driver);

        PIM.click_pim_botton();

        PIM.Enter_employee_name("Aaliyah  Haq");

        PIM.enter_employee_id("0038");

        PIM.Select_employee_stautus("Full-Time Permanent");

        PIM.select_include("Current Employees Only");

        PIM.enter_supervisor_name("Odis  Adalwin");

        PIM.Select_jobtitle("QA Lead");

        PIM.select_sub_unit("Quality Assurance");

        PIM.select_search();

    }
}