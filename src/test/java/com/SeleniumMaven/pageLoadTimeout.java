package com.SeleniumMaven;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageLoadTimeout {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);    
		driver.manage().window().maximize();
		
		Instant startTime =  Instant.now();
		System.out.println(startTime.toString());
		
		driver.get("https://www.hyrtutorials.com/");
		
		Instant endTime = Instant.now();
		System.out.println(endTime.toString());
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("pageLoad time : "+duration.toMillis()+" millisecs");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
