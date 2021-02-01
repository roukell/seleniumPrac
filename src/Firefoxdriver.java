import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdriver {

	public static void main(String[] args) {	
		// testing on firefox now
		// gecko driver 
        System.setProperty("webdriver.gecko.driver", "//Users//yi-linglo//Documents//webDrivers//geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.aesop.com/au/r/aesop-range?gclid=CjwKCAiApNSABhAlEiwANuR9YEDckKXnIQipOwv2MgNrqcqjLR54K5jEAN5lYIRgW5vqH1LdPDeJ3BoCfi0QAvD_BwE&gclsrc=aw.ds");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.className("FormText-input")).sendKeys("hello");
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/form/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/button")).click();
		
	}
}
