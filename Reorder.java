package Oops.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reorder {

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
		d.findElement(By.linkText("REORDER")).click();
		
	    //Sending the values the the textbox inside the grid
	    d.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr[1]/td[4]/input")).sendKeys("23");
	    //Xpath of Update Button
	    d.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr[1]/td[4]/button")).click();
	    //Xpath of Proceed to Checkout
	    d.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[3]/div/ul/li[1]/button/span/span")).click();
	}

}
