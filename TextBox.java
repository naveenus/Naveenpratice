package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement userNameText = driver.findElement(By.id("login_field"));
		if (userNameText.isDisplayed()) {
			if (userNameText.isEnabled()) {
				userNameText.sendKeys("Naveen");
				String enteredText = userNameText.getAttribute("value");
				System.out.println(enteredText);
				Thread.sleep(3000);
				userNameText.clear();

			} else
				System.out.println("not enabled");
		} else
			System.out.println("not displayed");
	}

}
