package Test_NG_test;

import Testng.Login_page;
import Testng.Recuirement_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Recuirement_test {

    @Test(priority = 5)
    public void recuirement() {


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
        Recuirement_page recuir_page = new Recuirement_page(driver);

        recuir_page.click_recruitment();

        recuir_page.select_job_title("Chief Financial Officer");

        recuir_page.select_vacancy("Junior Account Assistant");

        recuir_page.select_hiring_manager("Linda Anderson");

        recuir_page.select_status("Application Initiated");

        recuir_page.enter_canditate_name("suryapazhanivel");

        recuir_page.enter_keyword("surya_object_model");

        recuir_page.select_date_of_application("2023-09-14");

        recuir_page.select_application_to_date("2023-12-13");

        recuir_page.select_method_of_application("Manual");

        recuir_page.clicksearch();

        recuir_page.clickreset();


        driver.quit();

    }
}
