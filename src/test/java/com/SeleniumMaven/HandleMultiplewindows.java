package com.SeleniumMaven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class HandleMultiplewindows {
	public static void main(String args[]) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.hyrtutorials.com/p/window-handles-practice.html");
		
		//single window 
		/*	String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parentWindow Handle :"+parentWindowHandle+driver.getCurrentUrl());
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if(!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("Vinay");
				Thread.sleep(3000);
				driver.close();
				Thread.sleep(3000);
				
			}
			
			
			//System.out.println(windowHandle+driver.getTitle());
		}
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("name")).sendKeys("Vinay poralla here");
		
		Thread.sleep(3000);
		driver.quit();
		*/
		//single tab 
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parentWindow Handle :"+parentWindowHandle+driver.getCurrentUrl());
		driver.findElement(By.id("newTabBtn")).click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if(!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				System.out.println(driver.findElement(By.id("output")).getText());
				driver.findElement(By.id("alertBox")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				System.out.println(driver.findElement(By.id("output")).getText());
				Thread.sleep(3000);
				driver.close();
				Thread.sleep(3000);
				
			}
			
			
		}
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("name")).sendKeys("Vinay poralla here");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
