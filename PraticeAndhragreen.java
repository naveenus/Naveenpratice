package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraticeAndhragreen {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--diable-notifications");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://andhragreens.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@formcontrolname='userId'])[1]")).sendKeys("8099998304");
		driver.findElement(By.id("login-password-input")).sendKeys("usnaveen");
		driver.findElement(By.xpath("//span[contains(text(),'LOGIN')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("mat-input-0")).sendKeys("fruits");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-icon[contains(text(),'search')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Pomegranate')]")).click();
	}
}