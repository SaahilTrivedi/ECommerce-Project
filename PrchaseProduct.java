package Oops.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrchaseProduct {

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
		d.findElement(By.linkText("ACCOUNT")).click();
		//Link of WishList in Account Menu fter adding product to wishlist
		d.findElement(By.linkText("My Wishlist (1 item)")).click();
		//Xpath of Add to Cart
		d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/form[1]/div/table/tbody/tr/td[5]/div/button/span/span")).click();
		//Xpath of Proceed to Checkout
		d.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[1]/ul/li/button/span/span")).click();
		//Xpath of Continue Button under billing Information
		d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[1]/div[2]/form/div/div/button")).click();
		//Xpath of Continue Button in Shipping Method
		d.findElement(By.xpath("xpath=//div[@id='shipping-method-buttons-container']/button")).click();

		//Xpath of RadioButton in Payment Method
		d.findElement(By.xpath("//*[@id='shipping-method-buttons-container']/button")).isSelected();
		//Xpath of Continue Button Payment Method
		d.findElement(By.xpath("//*[@id='p_method_checkmo']")).click();
		//Xpath of Place Order in Order Review
		d.findElement(By.xpath("//*[@id='payment-buttons-container']/button")).click();
		d.findElement(By.xpath("//*[@id='review-buttons-container']/button")).click();
		/*d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[3]/div[2]/form/div[3]/button/span/span")).click();
		d.findElement(By.xpath("//*[@id='billing:use_for_shipping_yes']")).click();
		d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[1]/div[2]/form/div/div/button/span/span")).click();
		d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[3]/div[2]/form/div[3]/button")).click();
		d.findElement(By.xpath("//*[@id='p_method_checkmo']")).click();
		d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[4]/div[2]/div[2]/button")).click();
		d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[5]/div[2]/div/div[2]/div/button/span/span")).click();*/
	}

}
