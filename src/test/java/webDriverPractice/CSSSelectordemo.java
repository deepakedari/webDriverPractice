package webDriverPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirt");
		driver.findElement(By.id("small-searchterms")).sendKeys("T-Shirt");
		
		boolean checkLogo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		if(checkLogo=true) {
		System.out.println("Logo is displayed "+checkLogo);
	}
		else
			System.out.println("Logo is Not displayed ");	

}
}

