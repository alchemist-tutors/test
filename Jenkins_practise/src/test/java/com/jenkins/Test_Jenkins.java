package com.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Jenkins {
	
	static WebDriver driver ;

	public static void main(String[] args) {
		
		System.setProperty( "webdriver.chrome.driver" , "C:\\Users\\alche\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe") ;
		
		driver = new ChromeDriver();
		
		driver.get("https://chat.openai.com/");
		

	}

}
