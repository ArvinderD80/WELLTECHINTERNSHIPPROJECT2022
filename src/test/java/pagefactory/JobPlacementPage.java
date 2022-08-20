package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Mainclass;

public class JobPlacementPage extends Mainclass {
	Actions action = new Actions (driver) ;
	
	
	@FindBy(partialLinkText="ly")
	WebElement ApplyNowtxt;
	
	
	public JobPlacementPage() {
    	 PageFactory.initElements(driver, this);
      }
    	 
    	 
public void clickingApplyNowtxtlink(){
 	              ApplyNowtxt.click();
 }	 
    	 
 public boolean ApplyNowtxtlinkisclickable(){
	    return     ApplyNowtxt.isEnabled();
} 
 
   
 public String captureJobplacementPageURL() {
              return driver.getCurrentUrl();
}   	  
}
