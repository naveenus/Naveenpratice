package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testuserautomation.github.io/DropDown/");
		Thread.sleep(5000);
		// inspect over the Drop Down menu
		WebElement selectCitiesObj = driver.findElement(By.xpath("//body/select[1]"));
		Select selectFromDropDownObj = new Select(selectCitiesObj);

		// select by index , index will start from 0 for first value
		selectFromDropDownObj.selectByIndex(2);

		// select by value, value to be found in HTML DOM
		selectFromDropDownObj.selectByValue("Texas");

		// select by Text given in the dropDownList
		selectFromDropDownObj.selectByVisibleText("CA");

	}
}