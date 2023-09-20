package Test_NG_test;

import Testng.Login_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Loginpage_test {
    @Test(priority = 1)
    public void userlogintest() {


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

        driver.quit();


    }
}
