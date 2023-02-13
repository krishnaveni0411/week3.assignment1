package week3.day3.assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class EditLead {
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
		browser.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Akash");
		browser.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("K");
		browser.findElement(By.xpath("//button[text()='Find Leads']")).click();
		browser.findElement(By.linkText("Akash")).click();
		System.out.println("Title is: "+ browser.getTitle());
		browser.findElement(By.linkText("Edit")).click();
		browser.findElement(By.id("updateLeadForm_companyName")).clear();
		browser.findElement(By.id("updateLeadForm_companyName")).sendKeys("ABC,PVT.LTD");
		browser.findElement(By.className("smallSubmit")).click();
		System.out.println("Title of the updated page is : " + browser.getTitle() );
		String text = browser.findElement(By.xpath("//span[text()='Company Name']")).getText();
		String text2 = browser.findElement(By.xpath("//span[text()='ABC,PVT.LTD (10653)']")).getText();
		System.out.println(text + " : " + text2);
		browser.close();
	}
}
