package org.test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	
	public static Select s;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public static void close() {
		driver.quit();
	}
	
	public void startTime() {
		Date st = new Date();
		System.out.println(st);
	}
	
	public void endTime() {
		Date et = new Date();
		System.out.println(et);
	}

	
	public void launchurl(String url) {
		driver.get(url);
	}
	
	public void fill(WebElement element,String txt) {
		element.sendKeys(txt);
		
	}
	
	public static void all() {
		java.util.List<WebElement> iPhone = driver.findElements(By.xpath("//span[contains(text(),'iPhone')]"));
		System.out.println(iPhone.size());
		
		for (WebElement webElement : iPhone) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void getattri(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}
	
	public void gette(WebElement element) {
		String text = element.getText();
		System.out.println(text);	
	}
	
	
	
	
	public static Select setAmount(WebElement element,String text){
		s=new Select(element);
		s.selectByVisibleText(text);
		return s;
	}
}
