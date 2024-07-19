package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FavouritesPopUp {
    public WebDriver driver;

    String FavouritesPopUpCloseButtonLocator = "//div[@id='myCasinoModal']//button[@class='close']";

    public FavouritesPopUp(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickCloseButton()
    {
        WebElement button = driver.findElement(By.xpath(FavouritesPopUpCloseButtonLocator));
        button.click();
    }
}