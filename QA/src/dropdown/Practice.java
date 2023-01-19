package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive", "D:\\Selenium\\ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		Select sc=new Select(driver.findElement(By.xpath("[@id=\'radio-btn-example\']/fieldset/legend")));
	
		sc.selectByVisibleText("benz");
		//driver.findElement(By.id("carselect"));
		//sc.selectByVisibleText("benz");
		// TODO Auto-generated method stub

	}

}
	q15xz zX      