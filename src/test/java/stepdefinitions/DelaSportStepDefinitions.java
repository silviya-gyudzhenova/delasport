package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.BabibetHomePage;
import pages.FavouritesPopUp;
import pages.LoginForm;

import java.util.List;
import java.util.Map;

public class DelaSportStepDefinitions {

    public static WebDriver driver;

    @When("A user logs in with the following credentials:")
    public void aUserLogsInWithTheFollowingCredentials(DataTable dataTable) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "src/test/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https:/babibet.com.test-delasport.com");
        driver.manage().window().maximize();
        BabibetHomePage babibetHomePage = new BabibetHomePage(driver);
        babibetHomePage.clickLoginButton();
        LoginForm loginForm = new LoginForm(driver);
        List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
        loginForm.fillUserName(data.get(0).get("username"));
        loginForm.fillPassword(data.get(0).get("password"));
        loginForm.clickLogInButton();
    }

    @When("I close all the pop-ups")
    public void iCloseAllThePopUps() {
        FavouritesPopUp favouritesPopUp = new FavouritesPopUp(driver);
        favouritesPopUp.ClickCloseButton();
    }

    @Then("User balance is {string}")
    public void userBalanceIs(String balance) {
        BabibetHomePage babibetHomePage = new BabibetHomePage(driver);
        Assert.assertEquals("Balance from the screen is equal to " + balance + ".", balance, babibetHomePage.getUserBalance());
    }
}
