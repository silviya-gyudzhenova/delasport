package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BabibetHomePage {
public WebDriver driver;

private By LogInButtonSelector = By.cssSelector(".header-login-button");
private By UserBalanceSelector = By.cssSelector("li:nth-of-type(1) > .user-balance-item-amount");

public BabibetHomePage(WebDriver driver) {
   this.driver=driver;
}

public void clickLoginButton() {
    driver.findElement(LogInButtonSelector).click();
}

public String getUserBalance() {
    return driver.findElement(UserBalanceSelector).getText();
}

}
