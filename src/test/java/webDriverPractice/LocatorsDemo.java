package webDriverPractice;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		
		boolean logodisplaystatus =driver.findElement(By.id("navbar-collapse-header")).isDisplayed();
		System.out.println(logodisplaystatus);
		
		//List<WebElement> headerlinks=driver.findElements(By.className("nav navbar-nav"));
		List<WebElement> headerlinks=driver.findElements(By.xpath("//ul[@class='nav navbar-nav']"));
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total no of images "+images.size());
		System.out.println("Total header links " +headerlinks.size());
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total no of images "+links.size());
		
		//Thread.sleep(5000);
		driver.findElement(By.linkText("Login")).click();
	}

}
