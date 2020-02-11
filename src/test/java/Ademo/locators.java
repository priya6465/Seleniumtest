package Ademo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();

				 driver.get("https://opensource-demo.orangehrmlive.com/"); 
				 
//				 driver.findElement(By.linkText("Forgot your password?")).click();
				 
//				 driver.findElement(By.partialLinkText("Forgot your")).click();
				 
			System.out.println(driver.findElements(By.tagName("img")).size());
				 
				 driver.quit();
	}

}
