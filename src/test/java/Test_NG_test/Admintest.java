package Test_NG_test;

import Testng.Adminpage;
import Testng.Login_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestRunner;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;

public class Admintest {

    @Test(priority = 2)
    public void adminpage() {


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


        Adminpage admin_page = new Adminpage(driver);

        admin_page.Adminclickbotton();

        admin_page.enter_system_username("Aaliyah.Haq");

        admin_page.Select_user_role("ESS");

        admin_page.Enter_empolee_name("Aaliyah Haq");

        admin_page.click_select("Enabled");

        admin_page.click_search_botton();

        driver.quit();
    }
}