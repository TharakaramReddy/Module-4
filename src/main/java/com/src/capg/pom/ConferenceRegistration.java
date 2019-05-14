package com.src.capg.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ConferenceRegistration {
	
	static WebDriver driver;
	public ConferenceRegistration(WebDriver driver) {
		this.driver=driver;
	}
	
	By firstName=By.name("txtFN");
	By lastName=By.name("txtLN");
	By email=By.name("Email");
	By contactNo=By.name("Phone");
	By noOfPeople=By.name("size");
	By buildingName=By.name("Address");
	By areaName=By.name("Address2");
	By city=By.name("city");
	By state=By.name("state");
	By conferenceAccess=By.name("memberStatus");
	
	public void giveFirstName() {
		System.out.println(driver.getTitle());
		driver.findElement(firstName).sendKeys("Tharak");
	}
	
	public void giveLastName() {
		driver.findElement(lastName).sendKeys("Nalla");
	}
	
	public void giveEmail() {
		driver.findElement(email).sendKeys("ram@mail.com");
	}
	
	public void givingInvalidContact() {
		driver.findElement(contactNo).sendKeys("7098798");
	}
	public void givingContact() {
		driver.findElement(contactNo).clear();
		driver.findElement(contactNo).sendKeys("7098798765");
	}
	
	public void giveNoOfPeople() {
		//driver.findElement(noOfPeople).sendKeys("");
		Select drpCountry = new Select(driver.findElement(noOfPeople));
		drpCountry.selectByVisibleText("4");
	}
	
	public void giveBuildingName() {
		driver.findElement(buildingName).sendKeys("Tharak Residency");
	}
	
	public void giveAreaName() {
		driver.findElement(areaName).sendKeys("Shankerpally");
	}
	
	public void giveCity() {
		Select drpCountry = new Select(driver.findElement(city));
		drpCountry.selectByVisibleText("Hyderabad");
	}
	
	public void giveState() {
		Select drpCountry = new Select(driver.findElement(state));
		drpCountry.selectByVisibleText("Telangana");
	}
	
	public void giveCconferenceAccess() {
		WebElement radio1 = driver.findElement(conferenceAccess);
		radio1.click();
	}
	
	public void clickNext() throws InterruptedException {
		driver.findElement(By.linkText("Next")).click();
		Thread.sleep(2500);
		driver.switchTo().alert().accept();
	}
}
