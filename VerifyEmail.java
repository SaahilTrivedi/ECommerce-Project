package Oops.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sahil\\workspace\\ECommerceProjectOnSelenium\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		//URL of the Required Site
		d.get("http://live.techpanda.org/index.php/backendlogin");
		//Login Credentials
		d.findElement(By.name("login[username]")).sendKeys("user01");
		d.findElement(By.name("login[password]")).sendKeys("guru99com");
		//Xpath of Login Button
		d.findElement(By.xpath("//*[@id='loginForm']/div/div[5]/input")).click();
		//Xpath of Close
		d.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/a")).click();
		//Xpath of Sales
		WebElement Sales=d.findElement(By.xpath("//*[@id='nav']/li[1]/a"));
		Sales.click();
		//Xpath of Orders
		WebElement Orders=d.findElement(By.xpath("//*[@id='nav']/li[1]/ul/li[1]/a"));
		Orders.click();
		//Create the Actions Class
		Actions act=new Actions(d);
		act.moveToElement(Sales).build().perform();
		Orders.click();
		//Xpath of Export Button
		d.findElement(By.id("id_7926c3a53bb81a01560c4fa23fd54695")).click();
	}

}
