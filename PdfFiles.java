package Oops.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PdfFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sahil\\workspace\\ECommerceProjectOnSelenium\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		//URL of the Required Site
		d.get("http://live.techpanda.org/");
		//Link of Account Button
		d.findElement(By.linkText("ACCOUNT")).click();
		//Link of My Account 
		d.findElement(By.linkText("My Account")).click();
		//Login Credentials
		d.findElement(By.id("email")).sendKeys("himanshuoct12@gmail.com");
		d.findElement(By.id("pass")).sendKeys("Pass@2020");
		//Xpath of Submit Button
		d.findElement(By.xpath("//*[@id='send2']/span/span")).click();
		//Link of Account Button after Login
		d.findElement(By.linkText("VIEW ORDER")).click();
		//Link of Account Button after Login
	    d.findElement(By.linkText("Print Order")).click();
	}

}
