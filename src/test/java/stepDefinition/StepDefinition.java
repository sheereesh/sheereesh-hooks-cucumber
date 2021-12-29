package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.SeleniumPage;
import util.InvokeBrowser;

public class StepDefinition {
	private static  WebDriver   wd;
	@Given("user is in {string} page")
	public void user_is_in_page(String expTitle) {
	    InvokeBrowser obj_InvokeBrowser=new InvokeBrowser();
	  wd=obj_InvokeBrowser.getDriver();
	    Assert.assertEquals(wd.getTitle(), expTitle);
	}

	@When("user click on Selenium Example Page link")
	public void user_click_on_selenium_example_page_link() {
	    HomePage obj_HomePage=new HomePage(wd);
	   obj_HomePage.clickOnTheLink(); 
	}

	@Then("system should display {string} page")
	public void system_should_display_page(String expTitle) {
	    Assert.assertEquals(wd.getTitle(), expTitle);
	}

	@When("user enters {string} on Form Elements")
	public void user_enters_on_form_elements(String names1) {
	  SeleniumPage obj_SeleniumPage=new SeleniumPage(wd);
	obj_SeleniumPage.sendTextOnIt(names1);
	}
	@When("user enters {string} on text box")
	public void user_enters_on_text_box(String names2) {
		SeleniumPage obj_SeleniumPage=new SeleniumPage(wd);
		obj_SeleniumPage.sendTextOnIt2(names2);
	}

	@Then("user click on  Submit button")
	public void user_click_on_submit_button() {
	    SeleniumPage obj_SeleniumPage=new SeleniumPage(wd);
	    obj_SeleniumPage.clickOnSubmit();
	}


	 

}
