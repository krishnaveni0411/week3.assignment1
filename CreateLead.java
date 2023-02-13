package week3.day3.assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
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
		browser.findElement(By.partialLinkText("Create")).click();
		//browser.findElement(By.linkText("Create Lead")).click();
		browser.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		browser.findElement(By.id("createLeadForm_firstName")).sendKeys("Akash");
		browser.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		browser.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Akash");
		browser.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Tester");
		browser.findElement(By.id("createLeadForm_description")).sendKeys("Create a new Lead");
		browser.findElement(By.name("primaryPhoneNumber")).sendKeys("9865231470");
		browser.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("akash421@gmail.com");
		WebElement element=browser.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(element);
		state.selectByVisibleText("New York");
		browser.findElement(By.className("smallSubmit")).click();
String title=browser.getTitle();
System.out.println("The Title is : " +title);
	}
	
}
