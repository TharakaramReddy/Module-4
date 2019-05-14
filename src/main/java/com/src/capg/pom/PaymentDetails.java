package com.src.capg.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentDetails {
	WebDriver driver;

	public PaymentDetails(WebDriver driver) {
		this.driver = driver;
	}
	
	By cardHolderName=By.name("txtFN");
	By debitCardNo=By.name("debit");
	By cvvNumber=By.name("cvv");
	By cardExpiryMonth=By.name("month");
	By cardExpiryYear=By.name("year");
	
	public void giveCardHolderName() {
		driver.findElement(cardHolderName).sendKeys("Tharak");
	}
	
	public void giveDebitCardName() {
		driver.findElement(debitCardNo).sendKeys("9809876543");
	}
	
	public void giveCvvNumber() {
		driver.findElement(cvvNumber).sendKeys("438");
	}
	
	public void giveCardExpiryMonth() {
		driver.findElement(cardExpiryMonth).sendKeys("01");
	}
	
	public void giveCardExpiryYear() {
		driver.findElement(cardExpiryYear).sendKeys("2022");
	}
	
	public void clickNext() throws InterruptedException {
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
}
