package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BabibetHomePage {
public WebDriver driver;

private By LogInButtonSelector = By.cssSelector(".header-login-button");

public BabibetHomePage(WebDriver driver) {
   this.driver=driver;
}

public void clickLoginButton() {
    driver.findElement(LogInButtonSelector).click();
}

}
