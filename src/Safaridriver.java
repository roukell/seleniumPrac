import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class Safaridriver {

	public static void main(String[] args) throws InterruptedException {
		// testing on Safari now
		System.setProperty("webdriver.safari.driver", "//usr//bin//safaridriver");
		WebDriver driver = new SafariDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		
		//dropdown with <select> tag (aka static dropdown)
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		
		// if static dropdown, we can select dropdown by index
		dropdown.selectByIndex(3);
		
		// we can select dropdown by visible text
		dropdown.selectByVisibleText("AED");
		
		// we can select dropdown by value attribute
		dropdown.selectByValue("INR");
	
		// to varify if a dropdown is selected correctly, to the following and get text
		String selectedDropdown = dropdown.getFirstSelectedOption().getText();
		System.out.println(selectedDropdown);
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000); // not a good practice, but leave it for now. 
		
		String passengerNum = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(passengerNum);
		
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		};
		
		String passengerNum1 = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(passengerNum1);
		
		driver.quit();
	}

}
