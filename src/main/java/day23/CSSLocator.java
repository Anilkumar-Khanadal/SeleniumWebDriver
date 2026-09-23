package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize(); // maximize the window
		
		// tag id  -- tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts"); // or
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		//tag class   -- tag.classname
	 	// driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts"); // or
		// driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
	
	    // tag attribute -- tag[attribute='value']
		 //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shhirts");
		 //driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shhirts");
		
		// tag class attribute -- tag.classname[attribute="value"] - to defferentiat the web elements
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");
        driver.findElement(By.cssSelector("button[type='button'][class='btn btn-primary search-btn rounded']"));
	}

}
