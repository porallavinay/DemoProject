package com.SeleniumMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTextBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement userNameText = driver.findElement(By.id("login_field"));
		if(userNameText.isDisplayed()) {
			if(userNameText.isEnabled()) {
				userNameText.sendKeys("Vinay");
				String enteredText = userNameText.getAttribute("value");
				System.out.println(enteredText);
				userNameText.sendKeys(" Poral");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}else {
				System.err.println("user name textbox is not enabled");
			}
		}else {
			System.err.println("userName textbox is not displayed");
		

	}
		driver.close();
}
}


