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
           Assert.assertEquals(hp.CaptureHomepageURL(),prop.getProperty("expectedHomePageURL"));
}

          @When("Guest user clicks over on service icon")
          public void guest_user_clicks_over_on_service_icon() {
          Assert.assertTrue(hp.Servicetxtisvisible());
          Assert.assertTrue(hp.Servicetxtisclickable());
}
        	     


          @Then("job placement icon should be visible to Guest users in services drop down")
        public void job_placement_icon_should_be_visible_to_guest_users_in_services_drop_down() {
        	// Assert.assertTrue(hp.JobPlacementtxtisvisible());
        	 Assert.assertTrue(hp.JobPlacementtxtisclickable());
}

           @When("Guest user clicks on Job Placement")
                public void guest_user_clicks_on_job_placement() {
        		Assert.assertTrue(hp.JobPlacementtxtisclickable());
}

            @Then("Job Placement page should be open")
                public void job_placement_page_should_be_open() {
           	Assert.assertEquals(jpp.captureJobplacementPageURL(), prop.getProperty("expectedjobplacementpageURL"));
}

                @When("Guest user click the Apply Now button")
                  public void guest_user_click_the_apply_now_button() {
                	Assert.assertTrue(jpp.ApplyNowtxtlinkisclickable());
                }
                	
               


                @Then("Guest user should be directed towards submission form page")
                  public void guest_user_should_be_directed_towards_submission_form_page() {
                	 Assert.assertEquals(sb.capturesubmissionPageTitle(), prop.getProperty("expectedSubmissionPageTitle")); 
                	 Assert.assertEquals(sb.capturesubmissionPageUrl(), prop.getProperty("expectedSubmissionPageURL")); 
                }
                

//               @And("All the contact information fields should be visible to Guest users")
//                  public void all_the_contact_information_fields_should_be_visible_to_guest_users() {
//              	     Assert.assertTrue(sb.cellphonefeildtxtisvisible());
//            	     Assert.assertTrue(sb.Emailfieldtxtisvisible());
//            	     Assert.assertTrue(sb.lastnamefieldtxtisvisible());
// //           	 Assert.assertTrue(sb.firsnamefieldtxtisvisible());
//            	     Assert.assertTrue(sb.messagefieldtxtisvisible());
//            	     Assert.assertTrue(sb.statetfieldtxtisvisible());
//            	     Assert.assertTrue(sb.submitbuttnisclickable());
//            	     Assert.assertTrue(sb.checkboxsarevisivle());
//            	     Assert.assertTrue(sb.countrydropdownisvisivle());
//}
               @When("Guest user click on firstname textbox field")
               public void guest_user_click_on_firstname_textbox_field() {
                   Assert.assertTrue(sb.firsnamefieldtxtisclickable());
               }

               @And("Guest User left all the fields blank and click submit button")
               public void guest_user_left_all_the_fields_blank_and_click_submit_button() {
            	   Assert.assertTrue(sb.submitbuttnisclickable());
               }

               @Then("Guest user should not be registerd and see errors on all  mandatory fields")
               public void guest_user_should_not_be_registerd_and_see_errors_on_all_mandatory_fields() {
            	   Assert.assertEquals(sb.firstnameerrmsg(),prop.getProperty("First Name is required"));
            	   Assert.assertEquals(sb.firstnameerrmsg(),prop.getProperty("Last Name is required"));
            	   Assert.assertEquals(sb.firstnameerrmsg(),prop.getProperty("State is required"));
            	   Assert.assertEquals(sb.firstnameerrmsg(),prop.getProperty("Cell Phone is required"));
            	   Assert.assertEquals(sb.firstnameerrmsg(),prop.getProperty("Please choose at least one option"));
            	   Assert.assertEquals(sb.firstnameerrmsg(),prop.getProperty("Email is required"));
            
              }


               @Then("Guest user can be able to enter and see the first name")
               public void guest_user_can_be_able_to_enter_and_see_the_first_name() {
           	   Assert.assertTrue(sb.firsnamefieldtxtisvisible());
            	   Assert.assertTrue(sb.firsnamefieldtxtisclickable());
               }

               @When("Guest user  click  the last name field")
               public void guest_user_click_the_last_name_field() {
           	   Assert.assertTrue(sb.lasttxtnamefieldisclickable());
               }

               @Then("Guest user can be able to enter  the last  name")
               public void guest_user_can_be_able_to_enter_the_last_name() {
            	   Assert.assertTrue(sb.lastnamefieldtxtisvisible());
               }

               @When("Guest user click Email field")
               public void guest_user_click_email_field() {
            	   Assert.assertTrue(sb.Emailtextfieldisclickable());
               }

               @Then("Guest user can be able to enter  the email")
               public void guest_user_can_be_able_to_enter_the_email() {
            	   Assert.assertTrue(sb.Emailtextfieldisclickable());
               }

               @When("Guest user clicks the  drop down to select the country")
               public void guest_user_clicks_the_drop_down_to_select_the_country() {
            	   Assert.assertTrue(sb.unitesstatedropdowneleisclickable());
               }

               @Then("Guest user should see the country list")
               public void guest_user_should_see_the_country_list() {
            	   Assert.assertTrue(sb.countrydropdownisvisivle());
               }

               @When("Guest user select the country in cell phone field")
               public void guest_user_select_the_country_in_cell_phone_field() {
            	   Assert.assertTrue(sb.unitesstatedropdowneleisclickable());
               }

               @Then("Guest user can be able to select   the country")
               public void guest_user_can_be_able_to_select_the_country() {
            	   Assert.assertTrue(sb.unitesstatedropdowneleisclickable());
               }

               @Then("Guest user  should click and enter the cell phone in ten  digits .")
               public void guest_user_should_click_and_enter_the_cell_phone_in_ten_digits() {
           	   Assert.assertTrue(sb.cellphonetxtfeildisclickable());
               }

               @Then("Guest user should able to enter only ten  digits")
               public void guest_user_should_able_to_enter_only_ten_digits() {
            	   Assert.assertTrue(sb.cellphonetxtfeildisclickable());
               }

               @When("Guest user clicks on state field")
               public void guest_user_clicks_on_state_field() {
           	   Assert.assertTrue(sb.statetxtfieldisclickable());
               }

               @Then("Guest user can be able to enter  the state")
               public void guest_user_can_be_able_to_enter_the_state() {
           	   Assert.assertTrue(sb.statetxtfieldisclickable());
               }

               @When("Guest user writes the state")
               public void guest_user_writes_the_state() {
            	   Assert.assertTrue(sb.statetxtfieldisclickable());
               }

               @Then("guest user able to write and see the state name")
               public void guest_user_able_to_write_and_see_the_state_name() {
            	 
               }

               @And("Guest user should  check the check box")
               public void guest_user_should_check_the_check_box() {
            	   Assert.assertTrue(sb.statetxtfieldisclickable()); 
               }

               @Then("Guest user be able to check the check box")
               public void guest_user_be_able_to_check_the_check_box() {
            	   Assert.assertTrue(sb.checkboxefeildisclickable());
               }

               @When("Guest user clicks the message field")
               public void guest_user_clicks_the_message_field() {
             	Assert.assertTrue(sb.messagetxtfieldisclickable());  
               }

               @Then("Guest user can able to writes and see in the message field")
               public void guest_user_can_able_to_writes_and_see_in_the_message_field() {
                 Assert.assertTrue(sb.messagefieldtxtisvisible());  
               }

               @When("Guest user clicks the submit button")
               public void guest_user_clicks_the_submit_button() {
            	   Assert.assertTrue(sb.submitbuttnisclickable());
               }

               @Then("Guest user should arrive on the homepage https:\\/\\/transfotechacademy.com\\/")
               public void guest_user_should_arrive_on_the_homepage_https_transfotechacademy_com() {
            	   Assert.assertEquals(sb.capturesubmissionPageTitle(), prop.getProperty("Transfotech Academy is an innovative IT Training School located in the heart of Jamaica, NY"));
               }



     
}  