package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
public static void main(String[] args) throws InterruptedException  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("field-keywords")).sendKeys("footwear");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
}
}
