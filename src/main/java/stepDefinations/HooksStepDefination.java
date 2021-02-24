package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefination {

	@Before
	public void Setup() {
		System.out.println("Open the Browser");
		System.out.println("Enter application UrL");
	}

	@After
	public void tearDown() {
		System.out.println("Closing the Browser");
	}

	@Given("^User is on Add Customer Page$")
	public void user_is_on_Add_Customer_Page() throws Throwable {
		System.out.println("User is on Add Customer Page");
	}

	@When("^User Added all Details$")
	public void user_Added_all_Details() throws Throwable {
		System.out.println("User Added all Details");
	}

	@Then("^Customer is added$")
	public void customer_is_added() throws Throwable {
		System.out.println("Customer is added");
	}

	@Given("^User is on Edit Customer Page$")
	public void user_is_on_Edit_Customer_Page() throws Throwable {
		System.out.println("User is on Edit Customer Page");
	}

	@When("^User Edit contact details$")
	public void user_Edit_contact_details() throws Throwable {
		System.out.println("User Edit contact details");
	}

	@Then("^Contact Details updated$")
	public void contact_Details_updated() throws Throwable {
		System.out.println("Contact Details updated");
	}

	@Given("^User is on Delete Customer Page$")
	public void user_is_on_Delete_Customer_Page() throws Throwable {
		System.out.println("User is on Delete Customer Page");
	}

	@When("^User Delete Customer$")
	public void user_Delete_Customer() throws Throwable {
		System.out.println("User Delete Customer");
	}

	@Then("^Customer Deleted$")
	public void customer_Deleted() throws Throwable {
		System.out.println("Customer Deleted");
	}
}
