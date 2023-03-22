package Oops.web;

import java.nio.channels.NetworkChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyAddProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sahil\\workspace\\ECommerceProjectOnSelenium\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://live.techpanda.org/");
		//linkedtext of MOBILE in Menu
		WebElement Mobile=d.findElement(By.linkText("MOBILE"));
		Mobile.click();
		//xpath of Add to Cart Button
		WebElement Add_To_Cart=d.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button/span/span"));
		Add_To_Cart.click();
		d.findElement(By.xpath("//*[@id='shopping-cart-table']/tbody/tr/td[4]/input")).sendKeys("1000");
		//xpath of UPDATE Button
		d.findElement(By.xpath("//*[@id='shopping-cart-table']/tbody/tr/td[4]/button/span/span")).click();
		//xpath of EMPTY Cart
		d.findElement(By.xpath("//*[@id='empty_cart_button']/span/span")).click();
	}

}
