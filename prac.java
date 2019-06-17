package This.KeyWord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac{
	public static WebDriver driver = null;
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "/Users/Muhammad/Desktop/Automation/jars/chromedriver");
	driver = new ChromeDriver();
	String url = "https://www.facebook.com/";
	driver.get(url);
	
	driver.findElement(By.id("email")).sendKeys("hdeyye@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("yuyu");
	driver.findElement(By.id("u_0_j")).sendKeys("hdeyye@gmail.com");

	
	
	
}
		

	}
	

	
	
	
	

	



 

	

 
