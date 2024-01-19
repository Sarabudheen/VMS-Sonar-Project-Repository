package com.vms.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.autoconfigure.web.servlet.WebDriverScope;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumVMSViewAllRunner {
	
	WebDriver driver;
	
	@BeforeClass
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	

	//To Open Google.com in a Chrome browser
	@Test
	public void loadGoolgePage(){
		
		
		driver.navigate().to("http://localhost:4200/");
		
	}
	
    @Test
    public void testVehicleViewAllPage() {
  
        
        
     // Checking ViewAll Vehicle Page
        WebElement viewAllPage = driver.findElement(By.className("mdc-tab__text-label"));
        viewAllPage.click();
        
       }

	public static void main(String[] args) {
		
		SeleniumVMSViewAllRunner obj = new SeleniumVMSViewAllRunner();
		obj.loadGoolgePage();
		obj.testVehicleViewAllPage();
		
		

	}

}
