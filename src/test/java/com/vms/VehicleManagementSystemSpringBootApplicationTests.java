package com.vms;

import static org.testng.Assert.assertEquals;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vms.bean.Vehicle;
import com.vms.controller.VMSController;

@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest
class VehicleManagementSystemSpringBootApplicationTests {

	@Autowired
	VMSController controller;

	String actualResult;
	String expectedResult;
	List<Vehicle> vehicleList1 = new ArrayList<Vehicle>();
	List<Vehicle> vehicleList2 = new ArrayList<Vehicle>();

	@Test
	@Order(1)
	void contextLoads() {
		

	}

	@Test
	@Order(2)
	 void testPerformInsert() {
		String expectedResult = "Vehicle Details Inserted";
		//Vehicle vehicle1 = null;
		Vehicle vehicle1 = new Vehicle(107, "TwoWheeler", "KTMBike", "TN 31 SA 0601", "Sarabudheen");
		actualResult = controller.performInsert(vehicle1);
		assertEquals(expectedResult, actualResult);
	}

	@Test
	@Order(3)
	 void testPerformUpdate() {
		String expectedResult = "Vehicle Details Updated";
		//Vehicle vehicle2 = null;
		Vehicle vehicle2 = new Vehicle(108, "FourWheeler", "InovaCar", "TN 31 RA 2002", "Sara");
		actualResult = controller.performUpdate(vehicle2);
		assertEquals(expectedResult, actualResult);
	}

	@Test
	@Order(4)
	 void testPerformDelete() {
		String expectedResult = "Vehicle Details Deleted";
		//actualResult = null;
		actualResult = controller.performDelete(107);
		assertEquals(expectedResult, actualResult);
	}

	@Test
	@Order(5)
	 void testGetAllVehicles() {
		vehicleList1 = controller.getAllVehicles();
		Vehicle vehicle3 = new Vehicle(101, "Twowheeler", "YemahaBike", "TN 31 AB 0601", "Senthil");
		Vehicle vehicle4 = new Vehicle(102, "FourWheeler", "AadiCar", "TN31AS 3131", "Sara");
		vehicleList2.add(vehicle3);
		vehicleList2.add(vehicle4);
		vehicleList1.equals(vehicleList2);
	}

}
