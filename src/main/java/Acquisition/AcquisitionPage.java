package Acquisition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AcquisitionPage {
	
	public static AcquisitionPageObjects accountCreation;
	public AcquisitionPage(WebDriver driver) {
	        //   super(driver);
	        accountCreation = PageFactory.initElements(driver, AcquisitionPageObjects.class);
	        
	    }
	
	public static void acceptCookies() {
		
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if (accountCreation.acceptCookiesButton.isDisplayed() == true) {
        	accountCreation.acceptCookiesButton.click();
        } else {
            System.out.println("Cookies Button Not displayed");
        }
    }
	
	public static void ClickSubscribe(){
		
		if (accountCreation.subscribeButton.isDisplayed() == true) {
        	accountCreation.subscribeButton.click();
        } else {
            System.out.println("Subscribe Button Not displayed");
        }
				
	}
	
public static void ContinueToPayment(){
		
		if (accountCreation.nextStepButton1.isDisplayed() == true) {
        	accountCreation.nextStepButton1.click();
        } else {
            System.out.println("Account creation Button Not displayed");
        }
				
	}
	
	}


