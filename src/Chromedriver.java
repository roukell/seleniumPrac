import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver {

	public static void main(String[] args) {
		// 1. create driver object for chrome browser
		// web driver is an interface
		// we will strictly implement methods of webdriver
		// className = ChromeDriver
		// syntax: X driver = new X();
		
		// invoke .exe file first
		// chrome is a 3rd party software, due to security issues, 
		// we need to start .exe file before driver object class
		System.setProperty("webdriver.chrome.driver", "//Users//yi-linglo//Documents//webDrivers//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// hit URL of current website
		driver.get("https://www.google.com/");
		
		// validate correct page title
		System.out.println(driver.getTitle());
		
		// validate correct URL to avoid hacked websites
		System.out.println(driver.getCurrentUrl());
		
		// to print page source 
//		System.out.println(driver.getPageSource());
		
		// to find an element
//		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("This is my first code");
//		driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")).sendKeys("Adele");
		
		// use customised xpath to find an element
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Adele");
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		String adele = driver.findElement(By.xpath("//h2[@data-local-attribute='d3bn']")).getText();
		System.out.println(adele);
		
		String occupation = driver.findElement(By.cssSelector("div.wwUB2c")).getText();
		System.out.println(occupation);
		
		
		// goto another page and then go back to previous page
//		driver.get("https://www.masa.tw/");
//		driver.navigate().back();
//		driver.navigate().forward();
		
		// close current browser
		driver.close();
		
		// close all browsers that are opened by Selenium, best to use to close child windows
//		driver.quit(); 
	}

}
