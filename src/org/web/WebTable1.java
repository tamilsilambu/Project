package org.web;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.asx.com.au/markets/trade-our-cash-market/directory");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	List<WebElement> columnsize = driver.findElements(By.xpath("//table[@class='table']//thead//th"));
	System.out.println("column size:"+columnsize.size());
	int columnindex=0;
	for (int i = 0; i < columnsize.size(); i++) {
		System.out.println(columnsize.get(i).getText());
		if (columnsize.get(i).equals("Company Name")) {
			columnindex=i;
			break;
		}
	}
	System.out.println("column index:"+columnindex);
	List<WebElement> trows = driver.findElements(By.xpath("//table[@class='table']//thead//tbody/tr"));
	System.out.println("total rows:"+trows.size());
	
	for (int i = 1; i < trows.size(); i++) {
		WebElement w = driver.findElement(By.xpath("//table[@class='table']//thead//tbody/tr["+i+"]/td["+columnindex+"]"));
		if (w.getText().equalsIgnoreCase("4DMEDICAL LIMITED")) {
System.out.println(w.getText());	
break;
		}
	}
	
	
}
}
