package swag;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Newproject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive", "D:\\Selenium\\ChromeDriver");
		WebDriver driver = new ChromeDriver();
		Properties prop=new Properties();
		
	driver.get("https://www.saucedemo.com/");	
	//driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
	Wait wait=new Waits();
	
	//wait.until(ExpectedConditions.visibilityOfAllElements(By.id(null)));
	
	
	//wait.until(ExpectedConditions.)
	
	
	//WebDriverWaits wait = new WebDriverWait(driver,30);

	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce"+Keys.ENTER);
	//driver.findElement(null)
	}

}
