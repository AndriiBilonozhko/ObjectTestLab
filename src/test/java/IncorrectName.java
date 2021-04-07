import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class IncorrectName extends BaseTest {


    @Test
    public void incorrectName() {
        MainPage mainPage = new MainPage();

        String actualText =
                mainPage.clickMyAccountButton()
                        .clickRegisterButton()
                        .setFirstName("")
                        .setSecondName("Bilonozhko")
                        .setEmail("chel999111@gmai.com")
                        .setTelephone("1234567")
                        .setPassword("admin")
                        .setConfirm("admin")
                        .clickAgreePrivatePolicyButton()
                        .clickContinueButtonStayThis()
                        .getTextFromDangerMessage();


        Assert.assertEquals(actualText, "First Name must be between 1 and 32 characters!");


    }
}
