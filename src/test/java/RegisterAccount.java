import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;

public class RegisterAccount extends BaseTest {

    @Test
    public void RegisterAccount() {
        MainPage mainPage = new MainPage();

        String actualText =
                mainPage.clickMyAccountButton()
                        .clickRegisterButton()
                        .setFirstName("Andrii")
                        .setSecondName("Bilonozhko")
                        .setEmail("chel999111@gmai.com")
                        .setTelephone("1234567")
                        .setPassword("admin")
                        .setConfirm("admin")
                        .clickAgreePrivatePolicyButton()
                        .clickContinueButton()
                        .getTextFromMyAccountHeader();

        Assert.assertEquals(actualText, "Your Account Has Been Created!");

    }
}
