package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class OutlineDataTableSteps {
	
	WebDriver driver;
	
	@Given("^I am on the zoo site$")
	public void i_am_on_the_zoo_site() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://thetestroom.com/webapp/");
		Thread.sleep(500);
	}
	
	@When("^I click on ([^\"]*)$")
	public void i_click_on_about_link(String Link) throws Throwable {
		driver.findElement(By.id(Link)).click();
	}
	
	@Then("^I check I am on ([^\"]*)$")
	public void i_check_I_am_on_About(String Title) throws Throwable {
	   Assert.assertTrue(driver.getTitle().contains(Title));
	}
	
	@And("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
		driver.close();
	}
}
