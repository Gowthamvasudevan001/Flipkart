package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipexe extends Base{

	@BeforeClass
	public static void lau() {
		launchBrowser();
	}
	
	@AfterClass
	public static void clo() {
		close();
	}
	
	@BeforeMethod
	public void start() {
		startTime();
	}
	
	@AfterMethod
	public void end() {
		endTime();
	}
	
	@Test
	public void tc() throws InterruptedException {
		
		FlipPojo a = new FlipPojo();
		
		launchurl("https://www.amazon.in/");
		
		fill(a.getContentent(), "iphone");
		
		getattri(a.getContentent());
		
		click(a.getSearch());
		
		fill(a.getMini(), "50000");
		
		fill(a.getMax(), "100000");
		
		click(a.getSubmit());
		
		all();
		
}
}