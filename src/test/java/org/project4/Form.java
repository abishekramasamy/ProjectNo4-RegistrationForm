package org.project4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Form {
	
	WebDriver driver;
	
	@BeforeClass
	private void tc01() {
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	@Test
	private void tc02() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Abcdef");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("ghijk");
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("  44,no 215, M H Plaza, 2nd Flr, Mamulpet FAKE ADDRESS");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mewisi9272@notedns.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876537689");
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
		WebElement skills = driver.findElement(By.id("Skills"));
		Select select1=new Select(skills);
		select1.selectByValue("Java");
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
		country.click();
		driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[6]")).click();
		WebElement year = driver.findElement(By.id("yearbox"));
		Select select3=new Select(year);
		select3.selectByValue("2002");
		WebElement month = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		Select select4=new Select(month);
		select4.selectByValue("March");
		WebElement day = driver.findElement(By.id("daybox"));
		Select select5=new Select(day);
		select5.selectByValue("5");
		driver.findElement(By.id("firstpassword")).sendKeys("12342@abc");
		driver.findElement(By.id("secondpassword")).sendKeys("12342@abc");
		driver.findElement(By.xpath("//button[@id=\"submitbtn\"]")).click();
	}
	@AfterClass
	private void tc03() {
//		driver.quit();

	}
}
