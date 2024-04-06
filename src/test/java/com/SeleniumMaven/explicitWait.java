package com.SeleniumMaven;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitWait {
	public static void main(String args[]) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		   
		driver.manage().window().maximize();
		driver.get("https://testproject.io/");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.linkText("Login")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windowHandle:windowHandles) {
			if(!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username+")));
				driver.findElement(By.id("username")).sendKeys("HYR Tutorials");
				
			}
		}
		
		 
		
	}


}
