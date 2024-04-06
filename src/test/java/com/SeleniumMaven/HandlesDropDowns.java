package com.SeleniumMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlesDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		WebElement courseElement =  driver.findElement(By.id("course"));
		Select courseNameDropdown = new Select(courseElement);
		List<WebElement> courseNameDropDownOptions =   courseNameDropdown.getOptions();
		for(WebElement option : courseNameDropDownOptions) {
			System.out.println(option.getText());
		}
		courseNameDropdown.selectByIndex(2); //dotnet
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		courseNameDropdown.selectByValue("java");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		courseNameDropdown.selectByVisibleText("Python");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String selectedText = courseNameDropdown.getFirstSelectedOption().getText();
		System.out.println("Selected Visible Text : "+selectedText);
		driver.close();
		*/
		//********************multiselection dropdown**********************
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		WebElement ideElement =  driver.findElement(By.id("ide"));
		Select ideDropdown = new Select(ideElement);
		List<WebElement> ideDropDownOptions =   ideDropdown.getOptions();
		for(WebElement option : ideDropDownOptions) {
			System.out.println(option.getText());
		}
		ideDropdown.selectByIndex(0); //Eclipse
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ideDropdown.selectByValue("ij");//Intellij Ide
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ideDropdown.selectByVisibleText("NetBeans");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ideDropdown.deselectByVisibleText("IntelliJ IDEA");
		List<WebElement> selectedOptions = ideDropdown.getAllSelectedOptions();
		for (WebElement selectedOption:selectedOptions) {
			System.out.println("Selected options : "+selectedOption.getText());
		
			
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		
	}

}
