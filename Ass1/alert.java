package Ass1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {
    public static void main(String[] args) {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	driver.get("www.bing.com");
    	driver.findElement(By.id("sb_form_q")).sendKeys("People");
    	
}
}