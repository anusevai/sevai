package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive", "D:\\Selenium\\ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		driver.findElement(By.xpath("//button[.='✕')]")).click();
		
		
		driver.findElement(By.xpath("//img[contains(@alt,'Top Mirrorless Camera')]")).click();
		
		
		
		
		//driver.findElement(By.id("nav-link-accountList")).click();
		//driver.findElement(By.id("ap_email")).sendKeys("9688228605"+Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("tharun16"+Keys.ENTER);
		
		//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("mobiles" + Keys.ENTER);
	
		driver.findElement(By.id("//*[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		
		Thread.sleep(3000);
		
	     driver.findElement(By.xpath("//img[contains(@alt,'SONY Alpha Full Frame')]")).click();

	}

}
