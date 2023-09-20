package Test_NG_test;

import Testng.Dashboardpage;
import Testng.Login_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dashboard_test {
    @Test(priority = 3)
    public void dashboard() {


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


        Dashboardpage dashpage = new Dashboardpage(driver);

        dashpage.clickbotton();

        // dashpage.clickviewbotton();

        driver.quit();
    }
}