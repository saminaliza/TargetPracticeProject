package signinTest;

import common.CommonAPI;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ErrorMessages;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import accountMenu.AccountPage;

import java.security.PublicKey;

public class TestAccountPage extends CommonAPI {

    @Test
    public void testUserCreateAccount() throws InterruptedException {
        AccountPage si = PageFactory.initElements(driver, AccountPage.class);
        si.userCanCreateAccount("myautotestmail2020@gmail.com", "John",
                "Doe", "4049887886", "Abcd!234");
        String expect = "Target Login";
        String actual = driver.getTitle();
        Assert.assertEquals(expect,actual);

    }
    @Test
    public void testUserCanSignIntoAccount() throws InterruptedException {
        AccountPage acc = PageFactory.initElements(driver, AccountPage.class);
        acc.userCanSignIntoAccount("myautotestmail2020@gmail.com", "Abcd!234");
        String expected = "Target Login";
        Assert.assertEquals(expected,driver.getTitle());
    }


}
