package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement userid = driver.findElement(By.xpath("//input[@id='email']"));
		userid.sendKeys("Test");
		Thread.sleep(2000);
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
		pwd.sendKeys("Testing");
		Thread.sleep(2000);
	}
}
