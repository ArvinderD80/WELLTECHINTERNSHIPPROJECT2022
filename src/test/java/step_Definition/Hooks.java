package step_Definition;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.Mainclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Mainclass {
	//pre requisite //Global Hooks
		@Before
		public void loadbrowser() {
			initialization();
		}
		//	post requisite
		@After(order=1)
		public void closebrowser () {
			teardown();
		}
		@After(order=2)
		public void screeshotaftereveryscenario () throws IOException{
			Date currentdate= new Date();
			String screenshotfilename = currentdate.toString().replace(" ", "_").replace(":", "-");
			System.out.println(screenshotfilename);
			File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotfile, new File("C:\\Users\\Arinder\\eclipse-workspace\\WellTechInternshipProjectBDDPOM\\screenshots"+screenshotfilename+".png"
			));
		}
}
