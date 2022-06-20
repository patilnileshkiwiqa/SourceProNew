
package com.sourcepro.Materials.ItemMasterBasicDetailEntry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sourcepro.init.AbstractPage;
import com.sourcepro.init.Common;

public class ItemMasterBasicDetailEntryVerification extends AbstractPage {

	public ItemMasterBasicDetailEntryVerification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean verifyTableLoad() {

		Common.pause(5);
		String xpath = "//i[@class='icon-pencil']";
		Common.presenceOfElement(By.xpath(xpath), driver);
		return !driver.findElements(By.xpath(xpath)).isEmpty();

	}
	
	public boolean verifyFileUpLoaded(String value) {

		String xpath = "//tbody//strong[text()='"+value+"']";
		Common.presenceOfElement(By.xpath(xpath), driver);
		return !driver.findElements(By.xpath(xpath)).isEmpty();

	}
	
	
	public boolean verifyItemCreated(String value) {

		String xpath = "//div[contains(text(),'"+value.toUpperCase()+"')]";
		Common.presenceOfElement(By.xpath(xpath), driver);
		Common.pause(4);
		return !driver.findElements(By.xpath(xpath)).isEmpty();


	}

	public boolean verifyPONummber(String value) {
		String xpath = "//div[text()='"+value+"']";
		Common.presenceOfElement(By.xpath(xpath), driver);
		return !driver.findElements(By.xpath(xpath)).isEmpty();
	}

}
