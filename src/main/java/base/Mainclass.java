package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Mainclass {
	 public static  WebDriver driver;
	 public static  Properties prop;
	    
    public Mainclass() {   
    try {
		prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Arinder\\eclipse-workspace\\WellTechInternshipProjectBDDPOM\\src\\main\\java\\properties\\config.properties");
		prop.load(fis);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block 
		e.printStackTrace();
	}
	}
	public static void initialization() {
	  

		String Browser = prop.getProperty("Browser");
		
		if (Browser.equalsIgnoreCase("chrome")) {
		System.setProperty(prop.getProperty("chromekey"),prop.getProperty("chromepath"));
        driver = new ChromeDriver();
 
		}
		 
		else if (Browser.equalsIgnoreCase("gecko")) {
    		System.setProperty(prop.getProperty("firefoxkey"),prop.getProperty("firefoxpath"));
            driver =new FirefoxDriver();
        }
		else if (Browser.equalsIgnoreCase("edge")) {
    		System.setProperty(prop.getProperty("edgekey"),prop.getProperty("edgepath"));
            driver =new EdgeDriver();
        }
		else if (Browser.equalsIgnoreCase("ie")) {
    		System.setProperty(prop.getProperty("iekey"),prop.getProperty("iepath"));
            driver =new InternetExplorerDriver();
        }
		
        else {
        	System.err.println("drivers are not found");
        }
	       driver.manage().window().maximize();
	        String pageload= prop.getProperty("Pageloadtimeout");
	        int Pageloadint=Integer.valueOf(pageload);
	        driver.manage().timeouts().pageLoadTimeout(Pageloadint,TimeUnit.SECONDS);
	        String implicitwaittimeout= prop.getProperty("implicitwaittimeout");
	        int implicitwaitint=Integer.valueOf(implicitwaittimeout);
	        driver.manage().timeouts().implicitlyWait(implicitwaitint, TimeUnit.SECONDS);
		    driver.get(prop.getProperty("UrlTrasfotech"));
		    driver.manage().deleteAllCookies();
		   }
    public void teardown() {
	        driver.close();
}
}
