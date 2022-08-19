package step_Definition;

import org.testng.Assert;

import base.Mainclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePage;
import pagefactory.JobPlacementPage;
import pagefactory.Submissionformpage;

public class ServiceForJobplacementFunctionality extends Mainclass {
                HomePage hp=new HomePage();
               JobPlacementPage jpp = new JobPlacementPage();
               Submissionformpage sb= new Submissionformpage();
     
          @Given("Guest user is in homepage")
           public void guest_user_is_in_homepage() {
        	  Assert.assertEquals(hp.CaptureHomepagetitle(),prop.getProperty("expectedHomePageTitle"));
}

          @When("Guest user clicks over on service icon")
          public void guest_user_clicks_over_on_service_icon() {
          Assert.assertTrue(hp.Servicetxtisvisible());
}
        	     


          @Then("job placement icon should be visible to Guest users in services drop down")
        public void job_placement_icon_should_be_visible_to_guest_users_in_services_drop_down() {
        	 
}

           @When("Guest user clicks on Job Placement")
                public void guest_user_clicks_on_job_placement() {
        	   
}

            @Then("Job Placement page should be open")
                public void job_placement_page_should_be_open() {
           	Assert.assertEquals(jpp.captureJobplacementPageTitle(), prop.getProperty("expectedjobplacementpageTitle"));
}

                @When("Guest user click the Apply Now button")
                  public void guest_user_click_the_apply_now_button() {
                	Assert.assertTrue(jpp.ApplyNowtxtlinkisclickable());
}

                @Then("Guest user should be directed towards submission form page")
                  public void guest_user_should_be_directed_towards_submission_form_page() {
                	 Assert.assertEquals(sb.capturesubmissionPageTitle(), prop.getProperty("expectedSubmissionPageTitle")); 
}

               @And("All the contact information fields should be visible to Guest users")
                  public void all_the_contact_information_fields_should_be_visible_to_guest_users() {
            	     Assert.assertTrue(sb.Agreementtxtisvisible());
            	     Assert.assertTrue(sb.cellphonefeildtxtisvisible());
            	     Assert.assertTrue(sb.Emailfieldtxtisvisible());
            	     Assert.assertTrue(sb.lastnamefieldtxtisvisible());
            	     Assert.assertTrue(sb.firsnamefieldtxtisvisible());
            	     Assert.assertTrue(sb.messagefieldtxtisvisible());
            	     Assert.assertTrue(sb.statetfieldtxtisvisible());
            	     Assert.assertTrue(sb.submitbuttnisclickable());
            	     Assert.assertTrue(sb.checkboxsarevisivle());
            	     Assert.assertTrue(sb.countrydropdownisvisivle());
}
 
     
}  