package Navigation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {
	public static void main(String[] args) {
		
 WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
 driver.get("https://www.amazon.com");
// driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("amazon.com");
// driver.findElement(By.)


 driver.get("https://www.flipcart.com");
 driver.navigate().back();
 driver.navigate().forward();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.navigate().refresh();
	}
}
