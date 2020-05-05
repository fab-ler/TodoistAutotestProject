package tests;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utils.CapabilitiesGenerator;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    User user;
    //    public LoginSteps login;
    LoginPage loginPage;
    private WebDriver driver;

    @BeforeMethod(description = "set browser driver")
    public void setDriver() {
        driver = new ChromeDriver(CapabilitiesGenerator.getChromeOptions());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        user = new User("Aqa3", "pswrdAQA3");
        loginPage = new LoginPage(driver);
//        login = new LoginSteps(driver);
    }

    @AfterMethod(alwaysRun = true, description = "quit browser")
    public void closeDriver() {
        driver.quit();
    }
}
