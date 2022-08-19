
package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartLogin {

	WebDriver driver;

	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	@Given("I am into the loginPage")
	public void i_am_into_the_login_page() {

	}

	@When("I add the username as {string} and password as {string}")
	public void i_add_the_username_as_and_password_as(String string, String string2) {
		driver.findElement(By.id("input-email")).sendKeys(string);
		driver.findElement(By.id("input-password")).sendKeys(string2);

	}

	@When("Click on the login Button")
	public void click_on_the_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("the page title will be {string}")
	public void the_page_title_will_be(String string) {
		Assert.assertEquals("My Account", string);

	}

	@Then("Logout from the Page and Click back on Login")
	public void logout_from_the_page_and_click_back_on_login() {
		driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[13]")).click();

	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
