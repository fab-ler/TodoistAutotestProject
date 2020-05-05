package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithExistingAccount() {
        loginPage
                .openPage()
                .loginWithExistingAccount("Aqa3", "pswrdAQA3");

    }
}
