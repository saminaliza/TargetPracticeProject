package accountMenu;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.accessibility.AccessibleStateSet;

public class AccountPage extends CommonAPI {
    @FindBy(css = "a[href='#accountMenu']")
    WebElement signIn;
    @FindBy(linkText = "Create account")
    WebElement createAccount;
    @FindBy(id= "username")
    WebElement signUpEmail;
    @FindBy(id = "firstname")
    WebElement signUpFirstName;
    @FindBy(id = "lastname")
    WebElement signUpLastName;
    @FindBy(id = "phone")
    WebElement signUpPhone;
    @FindBy(id = "password")
    WebElement signUpPassword;
    @FindBy(id = "createAccount")
    WebElement createAccountBtn;
    @FindBy(css = "div[class='sc-kgoBCf hHPMst']")
    WebElement keepMeSignedCheckBox;
    @FindBy(linkText = "Sign in")
    WebElement signin;
    @FindBy(css = "button[id='login']")
    WebElement signInBtn;


    public void userCanCreateAccount(String email, String firstName, String lastName,
                                     String phone, String password ) throws InterruptedException {
        signIn.click();
        createAccount.click();
        signUpEmail.sendKeys(email);
        signUpFirstName.sendKeys(firstName);
        signUpLastName.sendKeys(lastName);
        signUpPhone.sendKeys(phone);
        signUpPassword.sendKeys(password);
        keepMeSignedCheckBox.click();
        createAccountBtn.click();
        Thread.sleep(5000);
    }

    public void userCanSignIntoAccount(String mail, String password) throws InterruptedException {
        signIn.click();
        signin.click();
        signUpEmail.sendKeys(mail);
        signUpPassword.sendKeys(password);
        signInBtn.click();
        Thread.sleep(5000);


    }

}
