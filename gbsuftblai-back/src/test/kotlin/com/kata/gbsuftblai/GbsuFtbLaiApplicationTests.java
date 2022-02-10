package com.kata.gbsuftblai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.kata.gbsuftblai.controllers.GbsuFtbLaiController;
import com.kata.gbsuftblai.services.GbsuFtbLaiService;

@SpringBootTest
public class GbsuFtbLaiApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Test
	void contextLoads() {
		assertTrue(context.getBean(GbsuFtbLaiController.class) != null);
		assertTrue(context.getBean(GbsuFtbLaiService.class) != null);
	}
	
	@Test
	void gbsuFtbLaiConvertorNoMatch() {
		GbsuFtbLaiService gbsuFtbLaiService = context.getBean(GbsuFtbLaiService.class);
		assertEquals("1", gbsuFtbLaiService.convertNumber(1));
	}
	
	@Test
	void gbsuFtbLaiConvertorDivisibleByThree() {
		GbsuFtbLaiService gbsuFtbLaiService = context.getBean(GbsuFtbLaiService.class);
		assertEquals("Gbsu", gbsuFtbLaiService.convertNumber(9));
	}
	
	@Test
	void gbsuFtbLaiConvertorDivisibleByFive() {
		GbsuFtbLaiService gbsuFtbLaiService = context.getBean(GbsuFtbLaiService.class);
		assertEquals("Ftb", gbsuFtbLaiService.convertNumber(10));
	}

	@Test
	void gbsuFtbLaiConvertorDivisibleByThreeAndContainsThree() {
		GbsuFtbLaiService gbsuFtbLaiService = context.getBean(GbsuFtbLaiService.class);
		assertEquals("GbsuGbsu", gbsuFtbLaiService.convertNumber(3));
	}
	
	@Test
	void gbsuFtbLaiConvertorDivisibleByFiveAndContainsFive() {
		GbsuFtbLaiService gbsuFtbLaiService = context.getBean(GbsuFtbLaiService.class);
		assertEquals("FtbFtb", gbsuFtbLaiService.convertNumber(5));
	}
	
	@Test
	void gbsuFtbLaiConvertorContainsSeven() {
		GbsuFtbLaiService gbsuFtbLaiService = context.getBean(GbsuFtbLaiService.class);
		assertEquals("Lai", gbsuFtbLaiService.convertNumber(7));
	}
	
	@Test
	void gbsuFtbLaiConvertorDivisibleByThreeAndContainsFive() {
		GbsuFtbLaiService gbsuFtbLaiService = context.getBean(GbsuFtbLaiService.class);
		assertEquals("GbsuFtb", gbsuFtbLaiService.convertNumber(51));
	}
	
	@Test
	void gbsuFtbLaiConvertorContainsFiveThenContainsThree() {
		GbsuFtbLaiService gbsuFtbLaiService = context.getBean(GbsuFtbLaiService.class);
		assertEquals("FtbGbsu", gbsuFtbLaiService.convertNumber(53));
	}
	
	@Test
	void gbsuFtbLaiConvertorDivisibleByThreeAndFiveAndContainsSevenAndFive() {
		GbsuFtbLaiService gbsuFtbLaiService = context.getBean(GbsuFtbLaiService.class);
		assertEquals("GbsuFtbLaiFtb", gbsuFtbLaiService.convertNumber(75));
	}

}
