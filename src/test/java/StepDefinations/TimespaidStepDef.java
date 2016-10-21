package StepDefinations;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Acquisition.AcquisitionPage;
import Acquisition.AcquisitionPageObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static common.DriverSelection.getDriver;

import java.util.concurrent.TimeUnit;

public class TimespaidStepDef {

	public static WebDriver driver;
	
	
	private AcquisitionPage acquisitionPage;
	
	public static AcquisitionPageObjects accountCreation;
	
	
	public TimespaidStepDef() {
		
        TimespaidStepDef.driver = getDriver();   
        acquisitionPage = PageFactory.initElements(driver, AcquisitionPage.class);
        accountCreation = PageFactory.initElements(driver, AcquisitionPageObjects.class);
    }
	
	
	@Given("^I am on \"(.*?)\" web page with \"(.*?)\" promocode$")
	public  void i_am_on_web_page_with_promocode(String Brand, String Promo) throws Throwable {
		
	   System.out.println("Loading URL");	
	    String URL = "https://join.uat-thetimes.co.uk/";
	    String Fullurl = URL + "?pc=" + Promo;
	    System.out.println(Fullurl);
	    driver.get(Fullurl);
	    acquisitionPage.acceptCookies();
	    acquisitionPage.ClickSubscribe();
	}

	@When("^I fill personal details$")
	public void i_fill_personal_details() throws Throwable {
		
		System.out.println("i_fill_personal_details");	
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String s = RandomStringUtils.randomAlphabetic(8);
		String s1 = RandomStringUtils.randomAlphabetic(8);
		String s2 = RandomStringUtils.randomAlphabetic(8);
		
		try {
            if (accountCreation.title.isDisplayed()) {
                new Select(accountCreation.title).selectByVisibleText("Mr");
            }
            accountCreation.firstName.sendKeys(s);
            accountCreation.lastName.sendKeys(s1);

            if (accountCreation.email.isEnabled()) {
                accountCreation.email.sendKeys(s+s1+"@yopmail.com");
                accountCreation.confirmEmail.sendKeys(s+s1+"@yopmail.com");
            }
            accountCreation.password.sendKeys("Password123");
            accountCreation.confirmPassword.sendKeys("Password123");

            if (accountCreation.phone.isDisplayed()) {
                accountCreation.phone.sendKeys("07432645589");
            }
            if (accountCreation.dobDay.isDisplayed()) {
                new Select(accountCreation.dobDay).selectByVisibleText("20");
                new Select(accountCreation.dobMonth).selectByVisibleText("May");
                new Select(accountCreation.dobYear).selectByVisibleText("1980");
            }

            // accountCreation.nextStepButton.click();

        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println(e.printStackTrace());
            //   assert 1 == 2;
        }
	    
	}

	@When("^I submit personal details$")
	public void i_submit_personal_details() throws Throwable {
		
		System.out.println("i_submit_personal_details");	
	    
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		acquisitionPage.ContinueToPayment();
	}

	@When("^I choose \"(.*?)\" payment option$")
	public void i_choose_payment_option(String arg1) throws Throwable {
	    
	}

	@When("^I fill card details$")
	public void i_fill_card_details() throws Throwable {
	    
	}

	@When("^I fill billing address section$")
	public void i_fill_billing_address_section() throws Throwable {
	    
	}

	@When("^I choose home delivery option$")
	public void i_choose_home_delivery_option() throws Throwable {
	    
	}

	@When("^I submit payment details$")
	public void i_submit_payment_details() throws Throwable {
	    
	}

	@Then("^I should see review Order section$")
	public void i_should_see_review_Order_section() throws Throwable {
	    
	}

	@When("^I agree to \"(.*?)\" terms and condition$")
	public void i_agree_to_terms_and_condition(String arg1) throws Throwable {
	   
	}

	@When("^I click submit the review order form$")
	public void i_click_submit_the_review_order_form() throws Throwable {
	   
	}

	@Then("^I should see Times Thank You page$")
	public void i_should_see_Times_Thank_You_page() throws Throwable {
	   
	}

	@Then("^I take screenshot of the current state$")
	public void i_take_screenshot_of_the_current_state() throws Throwable {
	    
	}
}
