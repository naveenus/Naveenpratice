package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Clock {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://maniacs.info/clock-angles/angle-between-hour-and-minute-hand-at-2-30.html");
		Thread.sleep(5000);
		WebElement selectTimeobj = driver.findElement(By.xpath("//select[@id='hours']"));
		Select SelectFromDropdown = new Select(selectTimeobj);
		SelectFromDropdown.selectByVisibleText("7");
		WebElement selectTimeobj2 = driver.findElement(By.xpath("//select[@id='minutes']"));
		Select SelectFromDropdown2 = new Select(selectTimeobj2);
		SelectFromDropdown2.selectByVisibleText("50");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		

	}

}
