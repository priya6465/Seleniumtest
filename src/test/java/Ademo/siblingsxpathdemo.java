package Ademo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class siblingsxpathdemo {
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	}

	@Test
	public void webtableslection() throws InterruptedException{
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	     
		 driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	     
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	     
		 driver.findElement(By.id("btnLogin")).click(); 
		 
		 driver.manage().window().maximize();
		 		 
				 
	     driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		
		
   driver.findElement(By.xpath("//a[contains(text(),'Danie')]/parent::td//preceding-sibling::td//input[@id='ohrmList_chkSelectRecord_11']")).click();
	   
   driver.findElement(By.xpath("//a[contains(text(),'fiona.grace')]/parent::td//preceding-sibling::td//input[@id='ohrmList_chkSelectRecord_6']")).click();
		 
     Thread.sleep(2000);
	}
		 
     @AfterMethod
     public void teardown(){
	     driver.quit();
		
		

	}

}
