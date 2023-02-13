package week3.day3.assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		EdgeDriver browser=new EdgeDriver();
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		browser.get("http://leaftaps.com/opentaps/control/main");
		browser.manage().window().maximize();
		browser.findElement(By.id("username")).sendKeys("Demosalesmanager");
		browser.findElement(By.id("password")).sendKeys("crmsfa");
		browser.findElement(By.className("decorativeSubmit")).click();
		browser.findElement(By.linkText("CRM/SFA")).click();
		browser.findElement(By.linkText("Contacts")).click();
		browser.findElement(By.linkText("Create Contact")).click();
		browser.findElement(By.id("firstNameField")).sendKeys("Sri");
		browser.findElement(By.id("lastNameField")).sendKeys("Priya");
		browser.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("S");
		browser.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("P");
		browser.findElement(By.id("createContactForm_departmentName")).sendKeys("Software Tester");
		browser.findElement(By.id("createContactForm_description")).sendKeys("Create a new Contact");
		browser.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sripriya@gmail.com ");
		WebElement element=browser.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state=new Select(element);
		state.selectByVisibleText("New York");
		browser.findElement(By.className("smallSubmit")).click();
		browser.findElement(By.linkText("Edit")).click();
		browser.findElement(By.id("updateContactForm_description")).clear();
		browser.findElement(By.id("updateContactForm_importantNote")).sendKeys("New Contact");
		browser.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("Title : "+ browser.getTitle());
		
	}
}
