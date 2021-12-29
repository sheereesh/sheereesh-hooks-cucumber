package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.CommonMethods;

public class SeleniumPage {
	CommonMethods obj_CommonMethods= new CommonMethods();

	public  SeleniumPage(WebDriver wd) {
		PageFactory.initElements(wd,this);

	}

	@FindBy(xpath = "//input[@type='text' and @name='text']")
	WebElement sendTextOn_FormElements;
	public void sendTextOnIt(String text) {
		obj_CommonMethods.sendDataOnTextBox(sendTextOn_FormElements, text);
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	
	
	@FindBy(xpath = "//textarea[@name='textarea']")
	WebElement sendTextOn_FormELements2;
	public void sendTextOnIt2(String text) {
		
		obj_CommonMethods.sendDataOnTextBox(sendTextOn_FormELements2,text);
	
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement clickOnSubmit;
	

	public void clickOnSubmit() {
		obj_CommonMethods.clickOnIt(clickOnSubmit);
	}
}
