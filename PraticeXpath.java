package elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraticeXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://money.rediff.com/gainers/bse/daily/groupa";
		driver.get(url);
		//self
		String text = driver.findElement(By.xpath("//a[contains(text(),'India Tourism De')]/self::a")).getText();
		System.out.println(text); //India Tourism De
		//parant 
		text = driver.findElement(By.xpath("//a[contains(text(),'India Tourism De')]/parent::td")).getText();
		System.out.println(text); //India Tourism De
		//child
		List <WebElement> child = driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/child::td"));
		System.out.println("Number of child elements " + child.size());
		//ancestor
		driver.findElement(By.xpath(""))
	}
	

}
