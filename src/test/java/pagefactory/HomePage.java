package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.Mainclass;

public class HomePage extends Mainclass {
Actions action = new Actions (driver) ;

	@FindBy(xpath="//header/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	WebElement Servicetxt;
	
	@FindBy(xpath="//header/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
	WebElement JobPlacementtxt;
	
	
	
	public HomePage() {
    PageFactory.initElements(driver, this);
}

	
	
		
		

	
 public boolean Servicetxtisvisible(){
    return  Servicetxt.isDisplayed();
}

public boolean Servicetxtisclickable(){
    return  Servicetxt.isEnabled();
}
public void clickingServicetxt(){
action.moveToElement(Servicetxt).click().build().perform();
}

public void clickingJobPlacementtxt(){

action.moveToElement(JobPlacementtxt).click().build().perform();
}

public boolean JobPlacementtxtisvisible(){
	return JobPlacementtxt.isDisplayed();
	
}

public boolean JobPlacementtxtisclickable(){
    return    JobPlacementtxt.isEnabled();
} 


public String CaptureHomepageURL() {
         return driver.getCurrentUrl();
 }
	




	

}
