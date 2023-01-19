package seleniumnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive", "D:\\Selenium\\ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Actions ac = new Actions(driver);
		ac.contextClick((WebElement) By.xpath("//p[contains(text(),'Drop here')]"));
		ac.perform();
		

	}

}
