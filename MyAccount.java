package Oops.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sahil\\workspace\\ECommerceProjectOnSelenium\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://live.techpanda.org/");
		d.findElement(By.linkText("ACCOUNT")).click();
		d.findElement(By.linkText("My Account")).click();
		//d.findElement(By.xpath("//*[@id='login-form']/div/div[1]/div[2]/a")).click();
		//d.findElement(By.name("firstname")).sendKeys("Himanshu");
		//d.findElement(By.name("middlename")).sendKeys("Ravi");
		//d.findElement(By.name("lastname")).sendKeys("Trivedi");
		//d.findElement(By.name("email")).sendKeys("himanshuoct12@gmail.com");
		//d.findElement(By.name("password")).sendKeys("Pass@2020");
		//d.findElement(By.name("confirmation")).sendKeys("Pass@2020");
		//d.findElement(By.name("is_subscribed")).click();
		d.findElement(By.id("email")).sendKeys("himanshuoct12@gmail.com");
		d.findElement(By.id("pass")).sendKeys("Pass@2020");
		d.findElement(By.xpath("//*[@id='send2']/span/span")).click();
	    d.findElement(By.xpath("//*[@id='nav']/ol/li[2]/a")).click();
	    d.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")).click();
	    d.findElement(By.name("save_and_share")).click();
	    d.findElement(By.name("emails")).sendKeys("himanshuoct12@gmail.com");
	    d.findElement(By.xpath("//*[@id='form-validate']/div[2]/button/span/span")).click();
	}

}
