package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginForm {
    public WebDriver driver;

    private By UserNameFieldLocator = By.id("login_form[username]");
    private By PasswordFieldLocator = By.id("login-modal-password-input");
    private By LoginButtonLocator = By.xpath("//form[@id='login-modal-form']//button[@type='submit']");


    public LoginForm(WebDriver driver) {
        this.driver = driver;
    }

    public void fillUserName(String username) {
        driver.findElement(UserNameFieldLocator).sendKeys(username);
    }

    public void fillPassword(String password) {
        driver.findElement(PasswordFieldLocator).sendKeys(password);
    }

    public void clickLogInButton() {
        driver.findElement(LoginButtonLocator).click();
    }
}
