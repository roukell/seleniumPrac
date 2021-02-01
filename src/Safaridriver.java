import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safaridriver {

	public static void main(String[] args) {
		// testing on Safari now
		System.setProperty("webdriver.safari.driver", "//usr//bin//safaridriver");
		WebDriver driver = new SafariDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
