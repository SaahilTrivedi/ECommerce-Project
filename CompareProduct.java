package Oops.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompareProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sahil\\workspace\\ECommerceProjectOnSelenium\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://live.techpanda.org/");
		//linktext of mobile Menu
		WebElement Mobile=d.findElement(By.linkText("MOBILE"));
		Mobile.click();
		//LinkText of Add To Compare of One Mobile
		WebElement Add_To_Compare=d.findElement(By.linkText("Add to Compare"));
		Add_To_Compare.click();
		//LinkText of Add To Compare of One Mobile
		WebElement Add_To_Compare1=d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a"));
		Add_To_Compare1.click();
		//linktext of compare button
	    d.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[3]/div[1]/div[2]/div/button")).click();
	}

}
