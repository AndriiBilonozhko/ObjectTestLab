package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccountPage extends BasePage {


    @FindBy(xpath = "//input[@id ='input-firstname']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id ='input-lastname']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@id ='input-email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id ='input-telephone']")
    private WebElement telephoneInput;

    @FindBy(xpath = "//input[@id ='input-password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id ='input-confirm']")
    private WebElement confirmInput;

    @FindBy(xpath = "//input[contains(@type,'checkbox')]")
    private WebElement agreePrivatPolicyButton;

    @FindBy(xpath = "//input[contains(@type,'submit')]")
    private WebElement continueButton;

    @FindBy(xpath = "//div[@class ='text-danger']")
    private WebElement textDanger;


    public RegisterAccountPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public RegisterAccountPage setFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
        return this;
    }

    public RegisterAccountPage setSecondName(String lastName) {
        lastNameInput.sendKeys(lastName);
        return this;


    }

    public RegisterAccountPage setEmail(String eMail) {
        emailInput.sendKeys(eMail);
        return this;
    }
    public RegisterAccountPage setTelephone(String telephone) {
        telephoneInput.sendKeys(telephone);
        return this;
    }
    public RegisterAccountPage setPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public RegisterAccountPage setConfirm(String confirm) {
        confirmInput.sendKeys(confirm);
        return this;
    }

    public RegisterAccountPage clickAgreePrivatePolicyButton() {
       agreePrivatPolicyButton.click();
        return this;
    }
    public SuccesfullyAccountPage clickContinueButton() {
        continueButton.click();
        return new SuccesfullyAccountPage();
    }
    public String getTextFromDangerMessage() {
        return textDanger.getText();
    }

    public RegisterAccountPage clickContinueButtonStayThis() {
        continueButton.click();
        return this;
    }

}
