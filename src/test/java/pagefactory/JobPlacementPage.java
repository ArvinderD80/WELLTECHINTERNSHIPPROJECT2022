package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Mainclass;

public class JobPlacementPage extends Mainclass {
	
	@FindBy(xpath="//div[@data-elementor-id=\"4059\"]/section[5]/div[4]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/span[1]/span[contains(text(),'Apply Now'")
	WebElement ApplyNowtxt;
	
	
	public JobPlacementPage() {
    	 PageFactory.initElements(driver, this);
      }
    	 
    	 
public void clickingApplyNowtxtlink(){
 	              ApplyNowtxt.click();
 }	 
    	 
 public boolean ApplyNowtxtlinkisclickable(){
	    return     ApplyNowtxt.isSelected();
}     
    
 public String captureJobplacementPageTitle() {
                     return driver.getTitle();
}   	  
}
