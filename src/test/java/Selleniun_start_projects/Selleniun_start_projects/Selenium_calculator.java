package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.System;


public class Selenium_calculator {

	static WebDriver browser;

	@Before
	public void setup() {

		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String url = "https://testpages.eviltester.com/styled/apps/calculator.html";
		browser.get(url);

	}

	@Test
	public void Tests1() {

		browser.findElement(By.id("button01")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button02")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "3";
		assertEquals(Expected, result);

	}
	
	@Test
	public void subtractionTest() {
	    browser.findElement(By.id("button05")).click();
	    browser.findElement(By.id("buttonminus")).click();
	    browser.findElement(By.id("button03")).click();
	    try {
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	    }
	    browser.findElement(By.id("buttonequals")).click();
	    String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	    assertEquals("2", result);
	}
	
	@Test
	public void multiplicationTest() {
	    browser.findElement(By.id("button05")).click();
	    browser.findElement(By.id("buttonmultiply")).click();
	    browser.findElement(By.id("button02")).click();
	    try {
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	    }
	    browser.findElement(By.id("buttonequals")).click();
	    String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	    assertEquals("10", result);
	}
	
	@Test
	public void divisionTest() {
	    browser.findElement(By.id("button06")).click();
	    browser.findElement(By.id("buttondivide")).click();
	    browser.findElement(By.id("button03")).click();
	    try {
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	    }
	    browser.findElement(By.id("buttonequals")).click();
	    String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	    assertEquals("2", result);
	}
	
	@Test
	public void divisionByZeroTest() {
	    browser.findElement(By.id("button01")).click();
	    browser.findElement(By.id("buttondivide")).click();
	    browser.findElement(By.id("button00")).click();
	    try {
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	    }
	    browser.findElement(By.id("buttonequals")).click();
	    String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	    assertEquals("Infinity", result); 
	}
	
	@Test
	public void decimalMultiplicationTest() {
	    browser.findElement(By.id("button01")).click();
	    browser.findElement(By.id("buttonplus")).click();
	    browser.findElement(By.id("button05")).click();
	    browser.findElement(By.id("buttonmultiply")).click();
	    browser.findElement(By.id("button02")).click();
	    try {
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	    }
	    browser.findElement(By.id("buttonequals")).click();
	    String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	    assertEquals("12", result);
	}
	
	@Test
	public void decimalResultTest() {
	    browser.findElement(By.id("button07")).click();
	    browser.findElement(By.id("buttondivide")).click();
	    browser.findElement(By.id("button02")).click();
	    try {
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	    }
	    browser.findElement(By.id("buttonequals")).click();
	    String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	    assertEquals("3.5", result);
	}
	
	@Test
	public void negativeResultTest() {
	    browser.findElement(By.id("button03")).click();
	    browser.findElement(By.id("buttonminus")).click();
	    browser.findElement(By.id("button05")).click();
	    try {
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	    }
	    browser.findElement(By.id("buttonequals")).click();
	    String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	    assertEquals("-2", result);
	}
	
	@Test
	public void positiveNumbersAdditionTest() {
	    browser.findElement(By.id("button08")).click();
	    browser.findElement(By.id("buttonplus")).click();
	    browser.findElement(By.id("button05")).click();
	    try {
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	    }
	    browser.findElement(By.id("buttonequals")).click();
	    String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	    assertEquals("13", result);
	}




}