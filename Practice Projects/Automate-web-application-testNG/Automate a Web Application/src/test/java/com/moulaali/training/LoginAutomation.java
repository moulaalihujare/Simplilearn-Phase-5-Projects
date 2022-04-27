package com.moulaali.training;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\moula\\OneDrive\\Desktop\\Phase 5\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		WebElement mail = driver.findElement(By.id("ap_email"));
		mail.sendKeys("abc@gmail.com");
		mail.submit();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("xy1245");
		driver.findElement(By.id("signInSubmit")).click();
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iPhone 13");
		searchbox.submit();
		driver.findElement(By.linkText("Apple iPhone 13 (512GB) - Starlight")).click();
		driver.findElement(By.id("nav-cart-count-container")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='submit.add-to-cart']")).click();
		driver.findElement(By.id("nav-cart-count-container")).click();

	}

}
