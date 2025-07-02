package com.practisejenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseJenkins {

	WebDriver driver;

	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		System.out.println("Setup is done");

	}
	
	@Test
	public void Test1() {

		driver.get("https://www.google.com/");

		System.out.println("Test 1 started");

	}

	
	@Test
	public void Test2() {

		driver.get("https://www.amazon.in/");

		System.out.println("Test 2 started");

	}


	
}
