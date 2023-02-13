package week3.day3.assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DuplicateLead {
	public static void main(String[] args) {
		EdgeDriver browser=new EdgeDriver();
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		browser.get("http://leaftaps.com/opentaps/control/main");
		browser.manage().window().maximize();
		browser.findElement(By.id("username")).sendKeys("Demosalesmanager");
		browser.findElement(By.id("password")).sendKeys("crmsfa");
		browser.findElement(By.className("decorativeSubmit")).click();
		browser.findElement(By.linkText("CRM/SFA")).click();
		browser.findElement(By.linkText("Leads")).click();
		browser.findElement(By.linkText("Find Leads")).click();
		browser.findElement(By.xpath("//span[text()='Email']")).click();
		browser.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("akash421@gmail.com");
		browser.findElement(By.xpath("//button[text()='Find Leads']")).click();
		browser.findElement(By.linkText("Akash")).click();
		System.out.println("Title is: "+ browser.getTitle());
		String text = browser.findElement(By.xpath("(//span[text()='Akash'])[1]")).getText();
		System.out.println("First name : "+ text);
		browser.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String text2 = browser.findElement(By.id("sectionHeaderTitle_leads")).getText();
	    System.out.println(text2);
	    browser.findElement(By.xpath("//input[@name='submitButton']")).click();
	    browser.close();
	}
}