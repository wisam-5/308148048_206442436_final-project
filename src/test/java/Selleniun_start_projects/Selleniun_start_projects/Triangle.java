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
	
	@Test
	public void scaleneTriangleTest() {
	    browser.findElement(By.id("side1")).sendKeys("4");
	    browser.findElement(By.id("side2")).sendKeys("5");
	    browser.findElement(By.id("side3")).sendKeys("6");
	    browser.findElement(By.id("identify-triangle-action")).click();
	    
	    String expected = "Scalene";
	    String result = browser.findElement(By.className("answer")).getText();
	    assertEquals(expected, result);
	}
	
	@Test
	public void invalidTriangleTest() {
	    browser.findElement(By.id("side1")).sendKeys("4");
	    browser.findElement(By.id("side2")).sendKeys("5");
	    browser.findElement(By.id("side3")).sendKeys("9");
	    browser.findElement(By.id("identify-triangle-action")).click();
	    
	    String expected = "Error: Not a Triangle";
	    String result = browser.findElement(By.className("answer")).getText();
	    assertEquals(expected, result);
	}
	
	
	@Test
	public void invalidTriangleTest2() {
	    browser.findElement(By.id("side1")).sendKeys("-2");
	    browser.findElement(By.id("side2")).sendKeys("-3");
	    browser.findElement(By.id("side3")).sendKeys("-2");
	    browser.findElement(By.id("identify-triangle-action")).click();
	    
	    String expected = "Error: Not a Triangle";
	    String result = browser.findElement(By.className("answer")).getText();
	    assertEquals(expected, result);
	}
	
	@Test
	public void invalidTriangleTest3() {
	    browser.findElement(By.id("side1")).sendKeys("1");
	    browser.findElement(By.id("side2")).sendKeys("1");
	    browser.findElement(By.id("side3")).sendKeys("0");
	    browser.findElement(By.id("identify-triangle-action")).click();
	    
	    String expected = "Error: Not a Triangle";
	    String result = browser.findElement(By.className("answer")).getText();
	    assertEquals(expected, result);
	}
	
	@Test
	public void scaleneTriangleTest2() {
	    browser.findElement(By.id("side1")).sendKeys("10");
	    browser.findElement(By.id("side2")).sendKeys("13");
	    browser.findElement(By.id("side3")).sendKeys("21");
	    browser.findElement(By.id("identify-triangle-action")).click();
	    
	    String expected = "Scalene";
	    String result = browser.findElement(By.className("answer")).getText();
	    assertEquals(expected, result);
	}
	
	@Test
	public void isoscelesTriangleTest2() {
	    browser.findElement(By.id("side1")).sendKeys("6");
	    browser.findElement(By.id("side2")).sendKeys("4");
	    browser.findElement(By.id("side3")).sendKeys("4");
	    browser.findElement(By.id("identify-triangle-action")).click();
	    
	    String expected = "Isosceles";
	    String result = browser.findElement(By.className("answer")).getText();
	    assertEquals(expected, result);
	}
	
	@Test
	public void isoscelesTriangleTest3() {
	    browser.findElement(By.id("side1")).sendKeys("7");
	    browser.findElement(By.id("side2")).sendKeys("5");
	    browser.findElement(By.id("side3")).sendKeys("7");
	    browser.findElement(By.id("identify-triangle-action")).click();
	    
	    String expected = "Isosceles";
	    String result = browser.findElement(By.className("answer")).getText();
	    assertEquals(expected, result);
	}
	
	@Test
	public void invalidTriangleTest4() {
	    browser.findElement(By.id("side1")).sendKeys("0");
	    browser.findElement(By.id("side2")).sendKeys("0");
	    browser.findElement(By.id("side3")).sendKeys("0");
	    browser.findElement(By.id("identify-triangle-action")).click();
	    
	    String expected = "Error: Not a Triangle";
	    String result = browser.findElement(By.className("answer")).getText();
	    assertEquals(expected, result);
	}
	
	
	
	  
	
}
