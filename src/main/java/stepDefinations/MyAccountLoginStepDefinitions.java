package stepDefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MyAccountLoginStepDefinitions {

	public WebDriver driver = null;

	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "F://SeleniumRelatedFiles//chromedriver79.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("^Enter the URL \"([^\"]*)\"$")
	public void enter_the_URL(String url) throws Throwable {
		driver.get(url);
	}

	@And("^Click on My Account Menu$")
	public void click_on_My_Account_Menu() throws Throwable {

		driver.findElement(By.linkText("My Account")).click();
	}

	/*
	 * @And("^Enter registered username and password$") public void
	 * enter_registered_username_and_password() throws Throwable {
	 * driver.findElement(By.id("username")).sendKeys("pavanoltraining");
	 * driver.findElement(By.id("password")).sendKeys("Test@selenium123"); }
	 */

	/*
	 * @When("^Enter registered username \"([^\"]*)\" and password \"([^\"]*)\"$"
	 * ) public void enter_registered_username_and_password(String user, String
	 * pass) throws Throwable { // Write code here that turns the phrase above
	 * into concrete actions
	 * driver.findElement(By.id("username")).sendKeys(user);
	 * driver.findElement(By.id("password")).sendKeys(pass);
	 * }
	 */
	
	/*
	@When("^Enter registered username and password$")
	public void enter_registered_username_and_password(DataTable credentials) throws Throwable {

		List < List<String>> data=credentials.raw();

		 driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
		 driver.findElement(By.id("password")).sendKeys(data.get(0).get(0));
	    
	}
	*/
	
	
	@When("^Enter registered username and password$")
	public void enter_registered_username_and_password(DataTable credentials) throws Throwable {

		List < Map<String, String>> data=credentials.asMaps(String.class, String.class);

		 driver.findElement(By.id("username")).sendKeys(data.get(0).get("username"));
		 driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
	    
	}
	
	
	
	@And("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.name("login")).click();
	}

	@Then("^User must successfully login to the web page$")
	public void user_must_successfully_login_to_the_web_page() throws Throwable {
		String capText = driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]/strong")).getText();
		Assert.assertEquals(true, capText.contains("pavanoltraining"));
		driver.close();
	}

	@Then("^Verify login$")
	public void Verify_login() throws Throwable {

		String LoginSuccessCheckMessage = null;
		String LoginNotSuccessMessage = null;

		try {
			LoginSuccessCheckMessage = driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]/strong"))
					.getText();

			if (LoginSuccessCheckMessage.contains("pavanoltraining")) {
				Assert.assertTrue("Valid input - Home Page", true);
			}

		} catch (Exception e) {
			LoginNotSuccessMessage = driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/ul/li/strong"))
					.getText();
			if (LoginNotSuccessMessage.contains("ERROR")) {
				Assert.assertTrue("Invalid input - Error Page", true);
			} else {
				Assert.assertTrue("Unknwon Page", false);
			}
		}

	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.close();
	}
}
