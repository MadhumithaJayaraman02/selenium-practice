package Shipment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CC1 {
	public static WebDriver driver;
	public static Select select;
	public static String pageTitle;
	public static String roadCharge, railCharge, airCharge;
	public static void main (String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait ok=new WebDriverWait(driver,(Duration.ofSeconds(2)));
		
		
		
		driver.get("https://webapps.tekstac.com/ShipmentCharge/Index");
		pageTitle= driver.getTitle();
		System.out.println(pageTitle);
		 
		 Select option = new Select(driver.findElement(By.xpath("//select[@name='origin_id']")));
		// List<WebElement> s = option.getOptions.();
         option.selectByIndex(0);
        Select dp = new Select(driver.findElement(By.xpath("//select[@name='destination_id']")));
         dp.selectByVisibleText("Cochin");
         driver.findElement(By.name("submit")).click();
         WebElement d =driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]"));
         roadCharge = d.getText();
	}

}
