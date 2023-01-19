package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newdropdown {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.drive", "D:\\Selenium\\ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		Select sc=new Select(driver.findElement(By.xpath("//select[@id='fruits']")));
		//sc.selectByVisibleText("Apple");
		
		List<WebElement>all=sc.getOptions();
		for(int i=0;i<=5;i++) {
			if(i==all.size()) {
				Thread.sleep(2000);
				sc.selectByIndex(i);
			}
		}
		
		
		//sc.selectByIndex("0");
		// TODO Auto-generated method stub

	}

}
