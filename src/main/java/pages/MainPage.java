package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//a[text() ='Register']")
    private WebElement registerButton;

    public MainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public MainPage clickMyAccountButton() {
        myAccountButton.click();
        return this;

    }

    public RegisterAccountPage clickRegisterButton() {
        registerButton.click();
        return new RegisterAccountPage();
    }
}
