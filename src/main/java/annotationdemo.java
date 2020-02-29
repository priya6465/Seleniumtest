

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotationdemo {
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
	System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
	}
	@Test
	public void googleTest(){
		String title= driver.getTitle();
		 System.out.println("title is + title");
	} 
	@Test
	public void ooglelogotest(){
		System.out.println("3test");
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	}
