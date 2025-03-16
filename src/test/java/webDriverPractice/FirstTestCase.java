package webDriverPractice;

import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		driver.get("https://www.opencart.com/");
		
		String actTitle=driver.getTitle();
		if(actTitle.equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test Passes");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.close();

	}

}
