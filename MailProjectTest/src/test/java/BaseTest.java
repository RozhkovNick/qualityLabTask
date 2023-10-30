import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseTest {
    WebDriver driver = new ChromeDriver(options());

    public ChromeOptions options() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        return options;
    }

    @BeforeMethod(description = "Вход на сайт")
    public void beforeTest() {
        driver.manage().window().maximize();
        driver.get("https://mail.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest(description = "Закрываем браузер")
    public void afterTest() {
        driver.quit();
    }
}
