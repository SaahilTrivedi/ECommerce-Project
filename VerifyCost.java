package Oops.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sahil\\workspace\\ECommerceProjectOnSelenium\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://live.techpanda.org/index.php/");
		WebElement Mobile=d.findElement(By.linkText("MOBILE"));
		Mobile.click();
		String ListCost=d.findElement(By.xpath("//*[@id='product-price-1']/span")).getText();
		d.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button/span")).click();
		String DetailsCost=d.findElement(By.xpath("//*[@id='shopping-cart-table']/tbody/tr/td[3]/span")).getText();
		if(ListCost.equals(DetailsCost))
		{
			System.out.println("Costs are Equal");
		}
		else
		{
			System.out.println("Costs are Not Equal");
		}
	}

}
