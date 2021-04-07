package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccesfullyAccountPage extends BasePage {

    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement successfulCreateText;

    public SuccesfullyAccountPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public String getTextFromMyAccountHeader() {
        return successfulCreateText.getText();
    }
}


