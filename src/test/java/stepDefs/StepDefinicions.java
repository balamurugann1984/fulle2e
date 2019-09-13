package stepDefs;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinicions {
	

		WebDriver driver;
		String url = "https://classic.crmpro.com/index.html";

		
		@Given("^I want to write a step with precondition$")
		public void i_want_to_write_a_step_with_precondition() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\inbg1\\Automation-Revamped\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver ();
			driver.get(url);

		}

		@Given("^some other precondition$")
		public void some_other_precondition() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		  driver.findElement(By.name("username")).sendKeys("balamurugann1984");
		  driver.findElement(By.name("password")).sendKeys("Ammu@123");
		}

		@When("^I complete action$")
		public void i_complete_action() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();

		}

		@When("^some other action$")
		public void some_other_action() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			String Title = driver.getTitle();
			System.out.println(Title);
			String Expected = "CRMPRO";
			System.out.println(Expected.equals(Title));
		}

		@When("^yet another action$")
		public void yet_another_action() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		
		}

	
		@Then("^I validate the outcomes$")
		public void i_validate_the_outcomes() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions

			
			
		}

		@Then("^check more outcomes$")
		public void check_more_outcomes() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions

		}
		

	}


