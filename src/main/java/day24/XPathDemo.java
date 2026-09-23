package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//xpath with single attributes
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-shirts");
		
		//xpath with multiple attributes
		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-shirts");
		
		//xpath with 'and' 'or' operator
		driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("T-shirts");
		driver.findElement(By.xpath("//input[@placeholder='Search' or @name='search']")).sendKeys("T-shirts");
		
		//xpath with inner text - text()  (No attributes)
		driver.findElement(By.xpath("//a[text()='Desktops']")).click();
		
		boolean displayStatus= driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(displayStatus);
		
		String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(value);

		//xpath with contains()
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Sea')]")).sendKeys("Tshirts");
		
        //xpath with start-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Sea)]")).sendKeys("TShirts");
		
        //chained xpath
		boolean status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(status);
	}
}
