package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FavouritesPopUp {
    public WebDriver driver;

    By FavouritesPopUpLocator = By.cssSelector("div#myCasinoModal > .modal-dialog.modal-dialog-centered.modal-dialog-scrollable.modal-lg");

    public FavouritesPopUp(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickCloseButton() {
        WebElement FavouritesPopUp = driver.findElement(FavouritesPopUpLocator);
        WebElement FavouritesPopUpCloseButton = FavouritesPopUp.findElement(By.cssSelector("div > div > button"));
        FavouritesPopUpCloseButton.click();
    }
}
