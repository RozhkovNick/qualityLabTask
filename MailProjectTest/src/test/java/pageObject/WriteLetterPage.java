package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WriteLetterPage {
    WebDriver driver;
    private By buttonWriteLetter = By.cssSelector("[class=compose-button__wrapper]");
    private By addressString = By.cssSelector("[class=container--zU301]");
    private By letterString = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[3]/div[4]/div/div/div[2]/div[1]/div[1]");
    private By sendButton = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[1]/div[1]/div/button");

    public WriteLetterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void joinToLetter() {
        driver.findElement(buttonWriteLetter).click();
    }

    public void writeAddress(String address) {
        driver.findElement(addressString).sendKeys(address);
    }

    public void writeLetter(String letter) {
        driver.findElement(letterString).click();
        driver.findElement(letterString).sendKeys(letter);
    }

    public void clickSendButton() {
        driver.findElement(sendButton).click();
    }

    public void writeLetter(String address, String letter) {
        joinToLetter();
        writeAddress(address);
        writeLetter(letter);
        clickSendButton();
    }
}
