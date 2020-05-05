//package steps;
//
//import io.qameta.allure.Step;
//import org.openqa.selenium.WebDriver;
//import pages.LoginPage;
//
//public class LoginSteps {
//    private LoginPage login;
//
//
//    public LoginSteps(WebDriver driver) {
//        login = new LoginPage(driver);
//    }
//
//    @Step("Login")
//    public LoginSteps loginPageOpened() {
//        login.openPage();
//        return this;
//    }
//
//    @Step("Send email and password")
//    public LoginSteps login(String email, String password) {
//        login.inputEmailAndPassword(email, password);
//        return this;
//    }
//}
