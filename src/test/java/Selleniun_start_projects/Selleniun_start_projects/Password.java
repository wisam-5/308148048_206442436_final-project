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

public class Password {
	static WebDriver browser;

	@Before
	public void setup() {

		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String url = "https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html";
		browser.get(url);

	}
	@Test
	public void t1() {
		browser.findElement(By.name("characters")).sendKeys("wisamha");
		browser.findElement(By.name("validate")).click();
		
		String expected = "Valid Value";
		String Result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, Result);
	}
	
	@Test
	public void invalidInputTest() {
	    browser.findElement(By.name("characters")).sendKeys("Abc$123");
	    browser.findElement(By.name("validate")).click();
	    
	    String expected = "Invalid Value";
	    String result = browser.findElement(By.name("validation_message")).getAttribute("value");
	    assertEquals(expected, result);
	}
	
	@Test
	public void emptyInputTest() {
	    browser.findElement(By.name("characters")).sendKeys("");
	    browser.findElement(By.name("validate")).click();
	    
	    String expected = "Invalid Value";
	    String result = browser.findElement(By.name("validation_message")).getAttribute("value");
	    assertEquals(expected, result);
	}
	
	@Test
	public void validInputTest2() {
	    browser.findElement(By.name("characters")).sendKeys("Abc123*");
	    browser.findElement(By.name("validate")).click();
	    
	    String expected = "Valid Value";
	    String result = browser.findElement(By.name("validation_message")).getAttribute("value");
	    assertEquals(expected, result);
	}
	
	@Test
	public void validInputTest3() {
	    browser.findElement(By.name("characters")).sendKeys("a*34^*7");
	    browser.findElement(By.name("validate")).click();
	    
	    String expected = "Valid Value";
	    String result = browser.findElement(By.name("validation_message")).getAttribute("value");
	    assertEquals(expected, result);
	}
	
	@Test
	public void invalidInputTest2() {
	    browser.findElement(By.name("characters")).sendKeys("abc34");
	    browser.findElement(By.name("validate")).click();
	    
	    String expected = "Invalid Value";
	    String result = browser.findElement(By.name("validation_message")).getAttribute("value");
	    assertEquals(expected, result);
	}
	
	@Test
	public void invalidInputTest3() {
	    browser.findElement(By.name("characters")).sendKeys("abc&567");
	    browser.findElement(By.name("validate")).click();
	    
	    String expected = "Invalid Value";
	    String result = browser.findElement(By.name("validation_message")).getAttribute("value");
	    assertEquals(expected, result);
	}
	
	@Test
	public void t8() {
		browser.findElement(By.name("characters")).sendKeys("WISAM");
		browser.findElement(By.name("validate")).click();
		
		String expected = "Invalid Value";
		String Result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, Result);
	}
	
	@Test
	public void t9() {
		browser.findElement(By.name("characters")).sendKeys("JOJOJOJO");
		browser.findElement(By.name("validate")).click();
		
		String expected = "Valid Value";
		String Result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, Result);
	}
	
	@Test
	public void t10() {
		browser.findElement(By.name("characters")).sendKeys("1234567");
		browser.findElement(By.name("validate")).click();
		
		String expected = "Valid Value";
		String Result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, Result);
	}
	
	@Test
	public void t11() {
		browser.findElement(By.name("characters")).sendKeys("asv123456");
		browser.findElement(By.name("validate")).click();
		
		String expected = "Invalid Value";
		String Result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, Result);
	}
	
	
	@Test
	public void t12() {
		browser.findElement(By.name("characters")).sendKeys("joasfsASAD532");
		browser.findElement(By.name("validate")).click();
		
		String expected = "Invalid Value";
		String Result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, Result);
	}
	
	@Test
	public void t13() {
		browser.findElement(By.name("characters")).sendKeys("*******");
		browser.findElement(By.name("validate")).click();
		
		String expected = "Valid Value";
		String Result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, Result);
	}
	
	@Test
	public void t14() {
		browser.findElement(By.name("characters")).sendKeys("Ab1*^+5");
		browser.findElement(By.name("validate")).click();
		
		String expected = "Invalid Value";
		String Result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, Result);
	}
	
	@Test
	public void t15() {
		browser.findElement(By.name("characters")).sendKeys("שכעגכיח");
		browser.findElement(By.name("validate")).click();
		
		String expected = "Invalid Value";
		String Result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, Result);
	}
	
	@Test
	public void t16() {
		browser.findElement(By.name("characters")).sendKeys("w 1W3 *");
		browser.findElement(By.name("validate")).click();
		
		String expected = "Invalid Value";
		String Result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, Result);
	}
	
	@Test
	public void t17() {
		browser.findElement(By.name("characters")).sendKeys("&&&&&&&");
		browser.findElement(By.name("validate")).click();
		
		String expected = "Invalid Value";
		String Result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, Result);
	}
	
	
	
	
	
	
	


}

