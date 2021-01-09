package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipPojo extends Base{

	public FlipPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement contentent;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement search;
	
	@FindBy(id="low-price")
	private WebElement mini;
	
	@FindBy(id="high-price")
	private WebElement max;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement submit;
	
	
	@FindBy(xpath="//span[text()='New Apple iPhone 11 (64GB) - Black']")
	private WebElement product;


	public WebElement getContentent() {
		return contentent;
	}


	public WebElement getSearch() {
		return search;
	}


	public WebElement getMini() {
		return mini;
	}


	public WebElement getMax() {
		return max;
	}


	public WebElement getSubmit() {
		return submit;
	}


	public WebElement getProduct() {
		return product;
	}

	
}
