package com.vms.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.autoconfigure.web.servlet.WebDriverScope;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumVMSInsertRunner {

	WebDriver driver;

	@BeforeClass
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	// To Open Google.com in a Chrome browser
	@Test
	public void loadGoolgePage() {

		driver.navigate().to("http://localhost:4200/");

	}

	@Test
	public void testVehicleInsertFormSubmission() {

		WebElement vehicleIdField = driver.findElement(By.name("vehicleId"));
		vehicleIdField.sendKeys("106");

		WebElement vehicleTypeField = driver.findElement(By.name("vehicleType"));
		vehicleTypeField.sendKeys("TwoWheeler");

		WebElement vehicleNameField = driver.findElement(By.name("vehicleName"));
		vehicleNameField.sendKeys("PulsarBike");

		WebElement vehicleNumberField = driver.findElement(By.name("vehicleNumber"));
		vehicleNumberField.sendKeys("TN 31 SA 0001");

		WebElement ownerNameField = driver.findElement(By.name("ownerName"));
		ownerNameField.sendKeys("Sara");

		// Submit the form for Insert operation
		WebElement insertButton = driver.findElement(By.name("insertButton"));
		insertButton.click();

	}

//	@AfterTest
//	public void close() {
//		driver.quit();
//	}

	public static void main(String[] args) {

		SeleniumVMSInsertRunner obj = new SeleniumVMSInsertRunner();
		obj.loadGoolgePage();
		obj.testVehicleInsertFormSubmission();

	}

}
