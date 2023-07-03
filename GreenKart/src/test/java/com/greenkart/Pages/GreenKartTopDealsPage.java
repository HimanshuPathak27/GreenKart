package com.greenkart.Pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.greenkart.driverscript.TestBase;
import com.greenkart.repository.ObjectRepository;

public class GreenKartTopDealsPage extends TestBase{

	@FindBy(linkText = ObjectRepository.topDealsLink)
	@CacheLookup
	WebElement topDeals;
	
	@FindBy(xpath = ObjectRepository.pageSizeDropdownXpath)
	@CacheLookup
	WebElement pageSizeDropdown;

	public void validateTopDealsPage() {
		if(topDeals.isDisplayed()) {
			System.out.println("Top Deals Link is present on Green Cart Home Page");
			topDeals.click();
			System.out.println("Successfully Navigated to Top Deals page");
			System.out.println();
		}
		else {
			System.out.println("Top Deals Link is not present on Green Cart Home Page");
			System.out.println();
		}
	}
	
	public void switchingToTopDealsPage() {
		
		String parentWindowId = driver.getWindowHandle();
		String childWindowId = "";
		Set<String> windowId = driver.getWindowHandles();
		
		for (String id : windowId) {
		    if (!id.equals(parentWindowId)) {
		        childWindowId = id;
		        break;
		    }
		}
		
		driver.switchTo().window(childWindowId);
		System.out.println("Control switched to Top Deals page");
		System.out.println();
	}
	
	public void validateURL(String expURL) {
		String actURL = driver.getCurrentUrl();

		if(actURL.equals(expURL)) {
			System.out.println("Both Actual and Expected URL's are same");
			System.out.println("URL of Top Deals page is : " + actURL);
			System.out.println();
		}
		else {
			System.out.println("Both Actual and Expected URL's are not same");
			System.out.println("Expected URL of Top Deals page is : " + expURL);
			System.out.println("Actual URL of Top Deals page is : " + actURL);
			System.out.println();
		}
	}
	
	public void validateTopDealsPageTitle(String expTopDealsPageTitle) {
		String actTopDealsPageTitle = driver.getTitle();
		if(actTopDealsPageTitle.equals(expTopDealsPageTitle)) {
			System.out.println("Both Actual and Expected titles are same");
			System.out.println("Title of Top Deals page is : " + actTopDealsPageTitle);
			System.out.println();
		}
		else {
			System.out.println("Both Actual and Expected titles are not same");
			System.out.println("Expected Title of Top Deals page is : " + expTopDealsPageTitle);
			System.out.println("Actual Title of Top Deals page is : " + actTopDealsPageTitle);
			System.out.println();
		}
	}
	
	public void validateTopDealsDropdown() {
		if(pageSizeDropdown.isDisplayed()) {
			System.out.println("Page Size dropdown is present on Top Deals Page");
			select = new Select(pageSizeDropdown);
			select.selectByVisibleText("20");
			System.out.println("Successfully selected 20 as page size from dropdown");
		}
		else {
			System.out.println("Page Size dropdown is not present on Top Deals Page");
		}
	}
	
	
	
}
