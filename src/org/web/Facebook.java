package org.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamilarasan\\eclipse-workspace\\New\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement acc = driver.findElement(By.xpath("//a[text()='Create new account']"));
	acc.click();
	Thread.sleep(2000);
	WebElement daydrop = driver.findElement(By.id("day"));
	Select s= new Select(daydrop);
	s.selectByIndex(1);
	WebElement monthdrop = driver.findElement(By.id("month"));
	Select s1 = new Select(monthdrop);
	s1.selectByIndex(3);
	
	WebElement dropyear = driver.findElement(By.id("year"));
	Select s2= new Select(dropyear);
	s2.selectByValue("1991");
	
	
	
	
	
}
}


