package pages;

import java.util.List;
import common.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import StepDefinations.Steps;

public class homepage {

	public static WebElement getCookieBtn()
	{
		Steps.driver.switchTo().frame(Steps.driver.findElement(By.cssSelector("iframe[src*='https://cmp.dpgmedia.nl']")));

		return Steps.driver.findElement(By.xpath("//button[text()='Akkoord']"));
	}
	public static WebElement getloginasSubscriberBtn()
	{
		return Steps.driver.findElement(By.xpath("//a[text()='Log in als ABONNEE']"));
	}
	public static WebElement getUnameTxt()
	{
		return Steps.driver.findElement(By.xpath("//input[@id='username']"));
	}
	public static WebElement getPassTxt()
	{
		return Steps.driver.findElement(By.xpath("//input[@id='password']"));
	}
	public static WebElement getContinueBtn()
	{
		return Steps.driver.findElement(By.xpath("//button[text()='Ga verder']"));
	}
	public static WebElement getLoginBtn()
	{
		return Steps.driver.findElement(By.xpath("//button[text()='Log in']"));
	}
}
