package Oops.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DiscountGenerated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sahil\\workspace\\ECommerceProjectOnSelenium\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		//URL of the Required Site
		d.get("http://live.techpanda.org/");
		//linkedtext of MOBILE in Menu
		WebElement Mobile=d.findElement(By.linkText("MOBILE"));
		Mobile.click();
		//Xpath of Add to Cart Button
		WebElement Add_To_Cart=d.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button/span/span"));
		Add_To_Cart.click();
		//Coupon Code TextBox Handling
		d.findElement(By.id("coupon_code")).sendKeys("GURU50");
		//Xpath of APPLY Button
		d.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[2]/form/div/div/div/div/button")).click();
	}

}
