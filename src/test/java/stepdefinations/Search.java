package stepdefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	static final Logger logger = (Logger) LogManager.getLogger(Search.class);

	@Given("I visit the website as a guest user")
	public void i_visit_the_website_as_a_guest_user() {
	 System.out.println("--->I visit the website as a guest user");  
	 logger.info("--->I visit the website as a guest user");
	}

	@When("I select the books option from the search icon")
	public void i_select_the_books_option_from_the_search_icon() {
	    System.out.println("--->I select the books option from the search icon");
		 logger.info("--->I select the books option from the search icon");

	}

	@When("I click on search icon option")
	public void i_click_on_search_icon_option() {
		 logger.info("I select the books option from the search icon");

	}

	@Then("I should see the page heading as Amazon Best Reads is getting displayed")
	public void i_should_see_the_page_heading_as_amazon_best_reads_is_getting_displayed() {
		 logger.info("--->I should see the page heading as Amazon Best Reads is getting displayed");

	}

	@But("I should not see the other category products")
	public void i_should_not_see_the_other_category_products() {
		 logger.info("--->I should not see the other category products");

	}
	
}
