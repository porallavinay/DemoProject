package com.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAlers {
	public static void main(String args[]) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
		
		
/*		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
		
		
		//confrim box
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
		driver.findElement(By.id("confirmBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
		
		driver.findElement(By.id("confirmBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
		driver.quit();
		*/
		System.out.println(driver.findElement(By.id("output")).getText());
		
		driver.findElement(By.id("promptBox")).click();
	
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Poralla vinay");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.close();
	}

}
