package com.vms.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.autoconfigure.web.servlet.WebDriverScope;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumVMSDeleteRunner {
	
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
    public void testVehicleDeleteFormSubmission() {
  
        WebElement vehicleIdField = driver.findElement(By.name("vehicleId"));
        vehicleIdField.sendKeys("106");

        
     // Submit the form for Delete operation
        WebElement insertButton = driver.findElement(By.name("deleteButton"));
        insertButton.click();
        
       }
    
//	@AfterTest
//	public void close() {
//		driver.quit();
//	}


	public static void main(String[] args) {
		
		SeleniumVMSDeleteRunner obj = new SeleniumVMSDeleteRunner();
		obj.loadGoolgePage();
		obj.testVehicleDeleteFormSubmission();
		
		

	}

}
