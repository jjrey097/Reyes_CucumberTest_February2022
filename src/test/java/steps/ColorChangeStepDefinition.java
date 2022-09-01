package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.BackgroundColorPage;
import page.TestBase;

public class ColorChangeStepDefinition extends TestBase {
	BackgroundColorPage backgroundColorPage;
	
	@Before
	public void methodName() {
		 initDriver();
		 backgroundColorPage = PageFactory.initElements(driver, BackgroundColorPage.class);
	}
	
	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists()  {
	    driver.get("http://techfios.com/test/101/");
	}
	
	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() {
		driver.get("http://techfios.com/test/101/");
	}

	@When("^User clicks on the button$")
	public void user_clicks_on_the_button()  {
		backgroundColorPage.clickSkyBlue();
	}
	
	@When("^User clicks on button$")
	public void user_clicks_on_button()  {
		backgroundColorPage.clickWhite();
	}

	@Then("^The background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue()  {
	    Assert.assertEquals("#87ceeb", backgroundColorPage.getColorBody());
	}
	
	@Then("^The background color will change to white$")
	public void the_background_color_will_change_to_white() {
		Assert.assertEquals("#ffffff", backgroundColorPage.getWhiteColorBody());
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
