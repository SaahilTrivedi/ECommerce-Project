package Oops.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyTiItle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sahil\\workspace\\ECommerceProjectOnSelenium\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://live.techpanda.org/index.php/");
		//String ExpTitle="Home page";
		String ActualTitle=d.getTitle();
		System.out.println("Title"+ActualTitle);
		WebElement Mobile=d.findElement(By.linkText("MOBILE"));
		Mobile.click();
		WebElement DropDown=d.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));
		Select s=new Select(DropDown);
		s.selectByIndex(1);
	}

}
