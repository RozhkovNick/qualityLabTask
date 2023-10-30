package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthorizationPage {
    WebDriver driver;
    private By buttonJoin = By.cssSelector(".ph-login.svelte-1ke9xx5");
    private By stringUserName = By.xpath("//div[2]/div[1]/div/div/div/div/div/div[1]/div/input");
    private By buttonJoinPassword = By.xpath("//div[3]/div/div/div[1]/button");
    private By inputPassword = By.cssSelector("[name=password]");
    private By buttonAuthorization = By.cssSelector("[data-test-id=submit-button]");

    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickJoinButton() {
        driver.findElement(buttonJoin).click();
    }

    private void inputLogin(String login) {
        WebElement frame = driver.findElement(By.xpath("/html/body/div[4]/div/iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(stringUserName).sendKeys(login);
        driver.findElement(buttonJoinPassword).click();
    }

    private void inputPassword(String password) {
        driver.findElement(inputPassword).sendKeys(password);
        driver.findElement(buttonAuthorization).click();
    }

    public void attemptLogin(String login, String password) {
        clickJoinButton();
        inputLogin(login);
        inputPassword(password);
    }
}
