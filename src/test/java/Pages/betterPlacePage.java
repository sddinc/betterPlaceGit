package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class betterPlacePage  {
    public betterPlacePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button)[4]")
    public WebElement btnCookies;

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement txtBoxAmount;

    @FindBy(xpath = "(//label[@class='payment-method-radio cursor-pointer  flex generic-custom-radio-field'])[5]")
    public WebElement wireTransfer;

    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement txtName;
    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    public WebElement txtSurname;
    @FindBy(xpath = "(//input[@class='form-control'])[4]")
    public WebElement txtEmail;
    @FindBy(css = ".mb-6 #message")
    public WebElement txtMessageOptional;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement showAmount;
    @FindBy(xpath = "(//span[@class='generic-custom-radio'])[10]")
    public WebElement showUser;

    @FindBy(xpath = "(//span[@class='generic-custom-radio'])[11]")
    public WebElement receiveReceiptForm;
    @FindBy(xpath = "//select[@name='country_alpha2']")
    public WebElement receiveReceiptCountry;
    @FindBy(css = ".my-12 #zip")
    public WebElement receiveReceiptZip;
    @FindBy(css = ".my-12 #city")
    public WebElement receiveReceiptCity;
    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement receiveReceiptAutoSuggestion;
    @FindBy(xpath = "(//span[@class='generic-custom-radio'])[12]")
    public WebElement receiveReceiptConfirm;
    @FindBy(xpath = "(//button[@type='submit'])")
    public WebElement receiveReceiptSubmit;
@FindBy(xpath = "//a[text()='Weiter']")
    public WebElement btnWeiter;



}

