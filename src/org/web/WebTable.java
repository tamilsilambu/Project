package org.web;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] args) {
	System.setProperty("wbdriver.chrome.driver", "C:\\Users\\tamilarasan\\eclipse-workspace\\New\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement table = driver.findElement(By.id("customers"));	
String text = table.getText();
System.out.println(text);
List<WebElement> allrow = driver.findElements(By.tagName("tr"));
	
WebElement datas = allrow.get(3);
String data = datas.getText();
System.out.println(data);
	List<WebElement> rowdata = driver.findElements(By.tagName("td"));
	WebElement data1 = rowdata.get(3);
	String d = data1.getText();
	System.out.println(d);
	
}

}
