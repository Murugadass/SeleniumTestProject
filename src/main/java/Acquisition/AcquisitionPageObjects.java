package Acquisition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcquisitionPageObjects {

	// Subscribe button
	@FindBy(id = "cookiePolicyCloseSelector")
    public WebElement acceptCookiesButton;
	
	@FindBy(xpath = "//button[contains(text(),'Subscribe')]")
    public  WebElement subscribeButton;
	
	//Account creation
	@FindBy(xpath = "//div[@id='teamDropdown']/div")
    public WebElement teamSelectButton;
    @FindBy(xpath = "//*[@id='teamDropdown']/ul/li/a/span[text()='Aberdeen']")
    public WebElement teamSelect;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "confirmEmail")
    public WebElement confirmEmail;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "confirmPassword")
    public WebElement confirmPassword;
    @FindBy(id = "title")
    public WebElement title;
    @FindBy(id = "firstName")
    public WebElement firstName;
    @FindBy(id = "lastName")
    public WebElement lastName;
    @FindBy(id = "phone")
    public WebElement phone;
    @FindBy(id = "dateOfBirthDay")
    public WebElement dobDay;
    @FindBy(id = "dateOfBirthMonth")
    public WebElement dobMonth;
    @FindBy(id = "dateOfBirthYear")
    public WebElement dobYear;
    @FindBy(id = "accountCreationButton")
    public WebElement nextStepButton1;
    
    //Card Module
    @FindBy(id = "accountName")
    public WebElement accountName;
    @FindBy(id = "cardNumber")
    public WebElement cardNumber;
    @FindBy(id = "cardCCV")
    public WebElement cardCCV;
    @FindBy(id = "cardType")
    public WebElement cardType;
    @FindBy(id = "cardExpDateMonth")
    public WebElement cardExpDateMonth;
    @FindBy(id = "cardExpDateYear")
    public WebElement cardExpDateYear;
    
    //Billing Section
    @FindBy(xpath = "//label[@for='creditCard']")
    public WebElement creditCardLabel;
    @FindBy(xpath = "//label[@for='payPal']")
    public WebElement payPalLabel;
    @FindBy(xpath = "//label[@for='directDebit']")
    public WebElement directDebitLabel;
    @FindBy(id = "accountPopSubmit")
    public WebElement nextStepButton;
    
    //Billing Address
    @FindBy(id = "billingpostCodeAnywhere")
    public WebElement billingPostcodeFind;

    @FindBy(id = "#billingmanualAddressButton")
    public WebElement billingAddressManualButton;

    @FindBy(id = "billingpostcodeResults")
    public WebElement billingAddressSelect;

    @FindBy(id = "billing-manual-address")
    public WebElement billingEnterYourAddressNew;

    @FindBy(id = "billingmanualAddressButton")
    public WebElement billingEnterYourAddress;

    @FindBy(id = "billingmanualAddressLink")
    public WebElement billingEnterYourAddressLink;

    @FindBy(id = "billingaddress1")
    public WebElement billingAddressLine1;

    @FindBy(id = "billingaddress2")
    public WebElement billingAddressLine2;

    @FindBy(id = "billingcity")
    public WebElement billingCity;

    @FindBy(id = "billingcountry")
    public WebElement billingCountry;

    @FindBy(xpath = "//label[@for='deliveryRequired']")
    public WebElement homedeliveryrequired;

    @FindBy(id = "billingpostcode")
    public WebElement billingPostcode;
    
    //Postal Address
    @FindBy(id = "postalpostCodeAnywhere")
    public WebElement postalPostcodeFind;
    @FindBy(id = "postalfindAddressButton")
    public WebElement postalAddressFindButton;
    @FindBy(id = "#postalmanualAddressButton")
    public WebElement postalAddressManualButton;
    @FindBy(id = "postalpostcodeResults")
    public WebElement postalAddressSelect;
    @FindBy(id = "postal-manual-address")
    public WebElement postalEnterYourAddressNew;
    @FindBy(id = "postalmanualAddressButton")
    public WebElement postalEnterYourAddress;
    @FindBy(id = "postalmanualAddressLink")
    public WebElement postalEnterYourAddressLink;
    @FindBy(id = "postaladdress1")
    public WebElement postalAddressLine1;
    @FindBy(id = "postaladdress2")
    public WebElement postalAddressLine2;
    @FindBy(id = "postalcity")
    public WebElement postalCity;
    @FindBy(id = "postalcountry")
    public WebElement postalCountry;
    @FindBy(id = "postalpostcode")
    public WebElement postalPostcode;
    
    //Review order
    @FindBy(id = "offersFromNewsInt")
    public WebElement offersFromNews;
    @FindBy(css = "label[for='offersFromNewsInt']")
    public WebElement offersFromNewsLabel;
    @FindBy(id = "offersOther")
    public WebElement offersFromOthers;
    @FindBy(xpath = "//label[@for='tncCheck']")
    public WebElement tncbox;
    @FindBy(xpath = "//label[@for='tncCheck']")
    public WebElement timestermsAndConditionsLabel;
    @FindBy(id = "termsAndConditions")
    public WebElement dttermsAndConditionsLabel;

    //@FindBy(id = "over18YearsOld")
    @FindBy(xpath = "//label[@for='over18YearsOld']")
    public WebElement TimesMeteredtermsAndConditionsLabel;

    @FindBy(xpath = "//*[@id='perksTermsAndCodition' or @id='classicTermsAndCodition']")
    public WebElement termsAndConditionsLabel;

    @FindBy(css="#termsAndConditions>label")
    public WebElement termsAndCondtionsSunIE;
    
    WebDriver driver;
    public AcquisitionPageObjects(WebDriver driver) {
        this.driver = driver;
    }
    
    
    
}
