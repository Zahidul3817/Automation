package com.Basic_Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogIn_Test {

	public static void main(String[] args) {
		// How to open a browser in selenium?

		WebDriverManager.chromedriver().setup();
		// Webdriver is a interface
		// new is a Java key word
		// driver is a instance
		// ChromeDriver is a class
		// String driver;// String driver dosen't work
		WebDriver driver = new ChromeDriver(); // Java up casting
		// How many way can you open an url?
		// Ans: Two way I can open the URL
		// driver.get("URL");
		// driver.navigate().to("URL");
		// driver.get("https://magento.softwaretestingboard.com/");
		driver.navigate().to("https://magento.softwaretestingboard.com/");
		// Difference between driver.get vs driver.navigate?
		// Ans : driver.get open the "URL" directly.
		// On the other hand driver.navigate has some extra feature
		// example: A. forward
		// B. Backward
		// C. Refresh & many more
		// How to maximize the browser?
		// Ans: There are two way I can maximize the browser
		// 1. driver.manage().window().maximize();
		// 2. driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		// driver.manage().window().fullscreen();

		// How to identify the web elements ?

		driver.findElement(By.linkText("Sign In")).click();
		// driver.findElements(By.id("email"));

		// What is difference between findElement vs findElements
		// Ans: findElement find the specific element/ single element
		// On the other hand findElements find multiple elements

		driver.findElement(By.id("email")).sendKeys("tanvirpatwary16@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tester01");

		driver.findElement(By.id("send2")).click();
		
		// Home work : Automate 5 different web site log in?
		

		// How to close the browser?
		// Ans: There are two way I can close the browser
		// 1. driver.quit();
		// 2. driver.close();
		// driver.quit();
		// driver.close();

		// What is the difference between driver.quit() vs driver.close() ?
		// Ans: Driver.close() close the current instance ( only browser).
		// On the other hand- driver.quit() can close the instance & server ( browser
		// driver)
		// Another key point is IE browser only support driver.close().

	}

}
