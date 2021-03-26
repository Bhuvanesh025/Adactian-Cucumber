package org.data;



import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	
	 public static WebDriver driver;
	 public static String x = "";
	 
	public static  WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 return driver;
	}
	
	public static void launchUrl(String URL) {
		driver.get(URL);
	}
	
	public  void launchCurrentUrl(String data) {
		String s =data;
		System.out.println(s);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(data, currentUrl);
		
	}
	
	
	
	public static  void maxWindow() {
		driver.manage().window().maximize();
	}
	
	public static void fill(WebElement element,String text) {
	element.sendKeys(text);	
	}
	
	public static void btnClick(WebElement element) {
		element.click();
	}
	
	public  void jsfill(WebElement element,String text) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setattribute('value','"+text+"')",element);

	}
	
	public  void jsClick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", element);
		
	}
	
	public void selectText(WebElement element,String text) {
		new Select(element).selectByVisibleText(text);
		
	}
	
	public void selectIndex(WebElement element,int index) {
		new Select(element).selectByIndex(index);

	}
	
	public List<String> getOpt(WebElement element) {
		Select s = new Select(element);
		List<String> s1 = new ArrayList<String>();
		List<WebElement> l = s.getOptions();
        for (WebElement element1 : l) {
	    s1.add(element1.getText());
	
}	
        return s1;
	}
	
	public static void waitMethod() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public static String textMethod(WebElement element) {
JavascriptExecutor js =(JavascriptExecutor)driver;
	Object e = js.executeScript("return arguments[0].getAttribute('value')", element);	
		
	 String x =(String)e;
	
		
//String x = element.getAttribute("value");
		
	
return x;
		
	}
	
	public static void errorInDate(WebElement element) {
		String t = element.getText();
System.out.println(t);
	}
	
	public static void locerror(WebElement element) {
		String t = element.getText();
		
		System.out.println(t);

	}
	
	public static void firstNameError(WebElement element) {
		
        String t = element.getText();
		Assert.assertEquals("Verifying first name","Please Enter your First Name", t);
	}
public static void LastNameError(WebElement element) {
		
        String t = element.getText();
		Assert.assertEquals("Verifying first name","Please Enter you Last Name", t);
	}
public static void addressError(WebElement element) {
	
    String t = element.getText();
	Assert.assertEquals("Verifying first name","Please Enter your Address", t);
}	
public static void cardnoError(WebElement element) {
	
    String t = element.getText();
	Assert.assertEquals("Verifying first name","Please Enter your 16 Digit Credit Card Number", t);
}	
public static void cardTypeError(WebElement element) {
	
    String t = element.getText();
	Assert.assertEquals("Verifying first name","Please Select your Credit Card Type", t);
}	
public static void cardMonthError(WebElement element) {
	
    String t = element.getText();
	Assert.assertEquals("Verifying first name","Please Select your Credit Card Expiry Month", t);
}	
public static void cvvNumberError(WebElement element) {
	
    String t = element.getText();
	Assert.assertEquals("Verifying first name","Please Enter your Credit Card CVV Number", t);
}	

public static void searchorderId(WebElement element) {
	element.sendKeys(x);

}



	

}
