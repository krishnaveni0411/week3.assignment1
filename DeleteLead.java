package week3.day3.assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {
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
		browser.findElement(By.xpath("//span[text()='Phone']")).click();
		browser.findElement(By.name("phoneNumber")).sendKeys("9865231470");
		browser.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = browser.findElement(By.linkText("10746")).getText();
		System.out.println(text);
		browser.findElement(By.linkText("Akash")).click();
		browser.findElement(By.linkText("Delete")).click();
		browser.findElement(By.linkText("Find Leads")).click();
		browser.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		browser.findElement(By.xpath("//button[text()='Find Leads']")).click();
		browser.findElement(By.linkText("Akash")).click();
		browser.close();
	}
}
