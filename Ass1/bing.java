package Ass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bing {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.bing.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("sb_form_q")).sendKeys("Java");
	driver.findElements(By.xpath("//li[contains(@class,'sa_sg')]"));
}
}
