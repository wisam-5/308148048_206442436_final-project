package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.System;

public class Triangle {
	
	static WebDriver browser;

	@Before
	public void setup() {

		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String url = "https://testpages.eviltester.com/styled/apps/triangle/triangle001.html";
		browser.get(url);
	}
	
	@Test
	public void equilateralTriangleTest() {
	   browser.findElement(By.id("side1")).sendKeys("2");
	   browser.findElement(By.id("side2")).sendKeys("2");
	   browser.findElement(By.id("side3")).sendKeys("2");
	   browser.findElement(By.id("identify-triangle-action")).click();
	   
	   String expected = "Equilateral";
	   String result = browser.findElement(By.className("answer")).getText();
	   assertEquals(expected, result);
	}
	
	@Test
	public void isoscelesTriangleTest() {
	    browser.findElement(By.id("side1")).sendKeys("5");
	    browser.findElement(By.id("side2")).sendKeys("5");
	    browser.findElement(By.id("side3")).sendKeys("3");
	    browser.findElement(By.id("identify-triangle-action")).click();
	    
	    String expected = "Isosceles";
	    String result = browser.findElement(By.className("answer")).getText();
	    assertEquals(expected, result);
	}
	  
	
}
