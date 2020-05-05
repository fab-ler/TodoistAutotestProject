package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    String URL = "https://todoist.com/users/showLogin";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPage openPage() {
        driver.get(URL);
        isPageOpened();
        isPageOpened();
        return this;
    }

    @Override
    public LoginPage isPageOpened() {
        return this;
    }

    @Step("Login with an existing account")
    public LoginPage loginWithExistingAccount(String login, String password) {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(login);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//button[@class='submit_btn ist_button ist_button_red sel_login']")).click();
        return this;
    }

}
