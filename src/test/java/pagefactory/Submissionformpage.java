package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Mainclass;

public class Submissionformpage extends Mainclass {  
	Actions action = new Actions (driver) ;
	
	@FindBy(id="first_name")
	WebElement firsttxtnamefield ;
	
	@FindBy(css="#last_name")
	WebElement lasttxtnamefield;
	
	@FindBy(xpath="//div[contains(text(),'First Name is required')]")
	WebElement firstnameerrmsg;
	
	@FindBy(xpath="//div[contains(text(),'Last Name is required')]")
	WebElement lastnameerrmsg;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement Emailtextfield;
	
	@FindBy(xpath="//div[contains(text(),'Email is required')]")
	WebElement Emailerrmsgfield;
	
	@FindBy(xpath="//input[@id='state']")
	WebElement statetxtfield;
	
	@FindBy(xpath=" //div[contains(text(),'State is required')]")
	WebElement stateerrmsg;
	
	@FindBy(xpath="//div[contains(text(),'Please choose at least one option')]")
	WebElement checkboxerrmsg;
	
	@FindBy(css=" #BJOvZQK6Tz4YgfzXTZZe")
	WebElement messagetxtfield;
	
	@FindBy(xpath="//div[contains(text(),'Invalid phone number')]")
	WebElement invalidcellphoneerrmsg;
	
	
	@FindBy(xpath="//body/div[@id='__nuxt']/div[1]/div[1]/section[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	WebElement countrydropdown;
	
	@FindBy(xpath="//html[1]/body[1]/div[1]/div[1]/div[1]/section[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement cellphonetxtfeild;
	
	@FindBy(xpath="//input[@id='Full-Stack QA Engineering_DV6VNzE2nVchvRncPic8_0_h2clucdd6ta']")
	WebElement checkboxefeild;
	
	@FindBy(xpath="//body/div[@id='__nuxt']/div[1]/div[1]/section[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]")
	WebElement unitesstatedropdownele;
	
	@FindBy(xpath="//html[1]/body[1]/div[1]/div[1]/div[1]/section[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/h1[contains(text(),'By registerin')]")
	WebElement Agreementtxt;
	
	@FindBy(xpath="//button[contains(text(),'Sub')]")
	WebElement submitbuttn;
	
	
	
	public Submissionformpage() {
    PageFactory.initElements(driver, this);
    
	}
  
    
  public String capturesubmissionPageTitle() {
      return driver.getTitle();
}
  public String capturesubmissionPageUrl() {
      return driver.getCurrentUrl();
}   
  public void clickingfirsttxtnamefield() {
	  firsttxtnamefield.click();
	  } 
  public boolean firsnamefieldtxtisvisible() {
	  return firsttxtnamefield.isDisplayed();
	  } 
  public boolean firsnamefieldtxtisclickable(){
	    return  firsttxtnamefield.isEnabled();
	}
 
 public String firstnameerrmsg() {
	return firsttxtnamefield.getText();
	  } 
  
  public void clickinglasttxtnamefield() {
	  lasttxtnamefield.click();
	  } 
  public boolean lastnamefieldtxtisvisible() {
	  return lasttxtnamefield.isDisplayed();
	  }
  public boolean lasttxtnamefieldisclickable(){
	    return  lasttxtnamefield.isEnabled();
	}
  
  public void clickingEmailtextfield() {
	  Emailtextfield.click();
	  } 
  public boolean Emailfieldtxtisvisible() {
	  return Emailtextfield.isDisplayed();
	  }
  public boolean Emailtextfieldisclickable() {
		 return  Emailtextfield.isEnabled();
}  
  
  public void clickingstatetxtfield() {
	  statetxtfield.click();
  } 
  public boolean statetfieldtxtisvisible(){
	 return statetxtfield.isDisplayed();
	}  
  public boolean statetxtfieldisclickable() {
		 return  statetxtfield.isEnabled();
  }    
	  
	   
  public void clickingmessagetxtfield() {
	  messagetxtfield.click();
 }
 public boolean messagefieldtxtisvisible(){
		 return messagetxtfield.isDisplayed();
		}   
 public boolean messagetxtfieldisclickable() {
	 return  messagetxtfield.isEnabled();
	  } 

  
  public void clickingcountrydropdown() {
	  countrydropdown.click();
	  } 
  public boolean countrydropdownisvisivle() {
		 return  countrydropdown.isDisplayed();
		  } 
  
  public void clickingunitesstatedropdownele() {
	  unitesstatedropdownele.click();
	  } 
  public boolean unitesstatedropdowneleisclickable() {
		 return  unitesstatedropdownele.isEnabled();
		  } 
  public void clickingcheckboxefeild() {
	  checkboxefeild.click();
	  }
  public boolean checkboxsarevisivle() {
		 return  checkboxefeild.isDisplayed();
		  } 
  public boolean checkboxefeildisclickable() {
		 return  checkboxefeild.isEnabled();
		  } 
  public void clickingcellphonetxtfeild() {
	  cellphonetxtfeild.click();
	  } 
  
  public boolean cellphonefeildtxtisvisible(){
		 return cellphonetxtfeild.isDisplayed();
		}
  public boolean cellphonetxtfeildisclickable() {
		 return  cellphonetxtfeild.isEnabled();
		  } 
  
  public boolean Agreementtxtisvisible() {
	  return Agreementtxt.isDisplayed();
	  } 
  public void clickingsubmitbuttn() {
	  submitbuttn.click();
	  } 
  public boolean submitbuttnisclickable() {
	 return  submitbuttn.isEnabled();
	  } 

}


  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	
	

