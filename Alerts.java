package elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
		// Simple Alert: popup gives information or warning on the screen only accept(ok)
//		driver.findElement(By.id("alertBox")).click();
//		Thread.sleep(3000);
//		Alert simpleAlert = driver.switchTo().alert();
//		System.out.println(simpleAlert.getText());
//		Thread.sleep(3000);
//		simpleAlert.accept();
//		Thread.sleep(3000);
//		driver.quit();
//		// confirmation Alert: popup gives information or warning on the screen accept(ok) or dismiss(cancal) 
//		driver.findElement(By.id("confirmBox")).click();
//		Thread.sleep(3000);
//		Alert confirmationAlert = driver.switchTo().alert();
//		System.out.println(confirmationAlert.getText());
//		Thread.sleep(3000);
//		//confirmationAlert.accept();
//		confirmationAlert.dismiss();
//		System.out.println(driver.findElement(By.id("output")).getText());
//		Thread.sleep(3000);
//		driver.quit();
		// Prompt Alert: asking some input form the user using sendkey 
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(3000);
		Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		Thread.sleep(3000);
		promptAlert.sendKeys("Naveen");
		promptAlert.accept();
		// confirmationAlert.dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
		driver.quit();
	}

}
