import org.testng.annotations.Test;
import pageObject.AuthorizationPage;
import pageObject.WriteLetterPage;

public class MailTest extends BaseTest {
    AuthorizationPage authorizationPage = new AuthorizationPage(driver);
    WriteLetterPage writeLetterPage = new WriteLetterPage(driver);

    @Test(priority = 1)
    public void authorizationTest() {
        authorizationPage.attemptLogin("testmail.9191", "54321_Tes");
    }

    @Test(priority = 2)
    public void writeLetterTest() {
        writeLetterPage.writeLetter("testmail.9191@mail.ru", "Привет, Николай");
    }
}
