package hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hospital {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.practo.com/");
		driver.manage().window().maximize();
		WebElement city= driver.findElement(By.xpath("//input[@placeholder='Search location']"));
		city.click();
		city.clear();
		city.sendKeys("Bangalore");
		city.click();
		
		Thread.sleep(3000);
		
		
		WebElement cityList = driver.findElement(By.xpath("(//div[@data-qa-id='omni-suggestion-main'])[1]"));
		cityList.click();
		
		WebElement doctor = driver.findElement(By.xpath("//input[@placeholder='Search doctors, clinics, hospitals, etc.']"));
		doctor.sendKeys("General Physician");
		
		Thread.sleep(3000);
		WebElement doctorlist = driver.findElement(By.xpath("(//div[@data-qa-id='omni-suggestion-listing'])[1]"));
		doctorlist.click();
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("//div[@data-qa-id='doctor_gender_section']"));
		gender.click();
		Thread.sleep(3000);
		WebElement selectGender = driver.findElement(By.xpath("(//div[@role='button'])[1]//li[1]"));
		selectGender.click();
		Thread.sleep(3000);
		WebElement patientstory = driver.findElement(By.xpath("//div[@data-qa-id ='doctor_review_count_section']"));
		patientstory.click();
		Thread.sleep(3000);
		WebElement psClick = driver.findElement(By.xpath("(//div[@role='button'])[2]//li[1]"));
		psClick.click();
		Thread.sleep(3000);
		
		WebElement exp = driver.findElement(By.xpath("//div[@data-qa-id='years_of_experience_section']"));
		exp.click();
		Thread.sleep(3000);
		WebElement explist = driver.findElement(By.xpath("(//div[@role='button'])[3]//li[1]"));
		explist.click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement filter = driver.findElement(By.xpath("(//div[@role='button'])[4]"));
		js.executeScript("arguments[0].click()",filter);
		//filter.click();
		Thread.sleep(3000);
		WebElement fees = driver.findElement(By.xpath("(//div[@data-qa-id='Fees_radio'])[1]"));
//		fees.click();
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].click()",fees);
		WebElement availability = driver.findElement(By.xpath("(//div[@data-qa-id='Availability_radio'])[1]"));
		//availability.click();
		js.executeScript("arguments[0].click()",availability);
		Thread.sleep(3000);
		
		WebElement sort = driver.findElement(By.xpath("(//div[@role='button'])[5]"));
		sort.click();
		Thread.sleep(3000);
		WebElement sortby = driver.findElement(By.xpath("//li[@data-qa-id='doctor_review_count']"));
		sortby.click();
		
		
	     for(int i=2; i<7; i++) {
	    	 
	    	 WebElement doctordet = driver.findElement(By.xpath("(//div[@class='info-section'])["+i+"]"));
	    	 js.executeScript("arguments[0].scrollIntoView();",doctordet);
	    	 doctordet.click();
	    	 Set<String> windowid = driver.getWindowHandles();
	    	 List<String> ids = new ArrayList<String>(windowid);
	    	 String parent = ids.get(0);
	    	 String child = ids.get(1);
	    	 
	    	 driver.switchTo().window(child);
	    	 WebElement details= driver.findElement(By.xpath("//div[@class='pure-u-20-24']"));
	    	 System.out.println(details.getText());
	    	 System.out.println();
	    	 driver.switchTo().window(parent);
	    	 
	     }
	     driver.quit();
		}		
	}

		


