package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class BackgroundColorPage {
	WebDriver driver;
	public BackgroundColorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionSky()']")WebElement SET_SKYBLUE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']")WebElement SKYBLUE_BODY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionWhite()']")WebElement SET_WHITE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: white;']")WebElement WHITE_BODY_ELEMENT;
	
	//Methods to interact with elements
	public void clickSkyBlue() {
		SET_SKYBLUE_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getColorBody() {
		String expectedColor= "background-color: skyblue;";
		String actualBackgroundColor = SKYBLUE_BODY_ELEMENT.getCssValue("background-color");
		String hexBackColor = Color.fromString(actualBackgroundColor).asHex();
		return hexBackColor;
	}
	
	public void clickWhite() {
		SET_WHITE_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getWhiteColorBody() {
		String expectedColor= "background-color: white;";
		String actualBackgroundColor = WHITE_BODY_ELEMENT.getCssValue("background-color");
		String hexColor = Color.fromString(actualBackgroundColor).asHex();
		return hexColor;
	}
	
	
}
