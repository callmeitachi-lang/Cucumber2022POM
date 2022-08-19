package stepdefinations;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterPage {
	WebDriver driver;
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	@Given("I Navigate to register page")
	public void i_navigate_to_register_page() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	}

	@When("I enter the below details")
	public void i_enter_the_below_details(DataTable dataTable) {
	   
		Map<String,String> datavalue=dataTable.asMap(String.class,String.class);
		
	driver.findElement(By.id("input-firstname")).sendKeys(datavalue.get("firstname"));
	driver.findElement(By.id("input-lastname")).sendKeys(datavalue.get("lastname"));
	driver.findElement(By.id("input-email")).sendKeys(datavalue.get("email"));
	driver.findElement(By.id("input-telephone")).sendKeys(datavalue.get("telephone"));
	driver.findElement(By.id("input-password")).sendKeys(datavalue.get("password"));
	driver.findElement(By.id("input-confirm")).sendKeys(datavalue.get("password"));

		
	}

	@When("I select the privacy policy option")
	public void i_select_the_privacy_policy_option() {
	    driver.findElement(By.name("agree")).click();
	}

	@When("I click on Continue button")
	public void i_click_on_continue_button() {
	   driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("user should be successfully registered")
	public void user_should_be_successfully_registered() {
	    //Assert.assertEquals(false, null);
	}

}
