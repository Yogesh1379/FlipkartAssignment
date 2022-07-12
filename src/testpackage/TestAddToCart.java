package testpackage;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomeListener;
import generic.WebDriverCommonLib;
import pagepackage.HomePage;
@Listeners(CustomeListener.class)


public class TestAddToCart extends BaseTest {
	
@Test
		public void sort() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.getCancelLoginPopup().click();
		
		WebDriverCommonLib wdc = new WebDriverCommonLib();
		String expectedTitle = wdc.getTheTitleOfTheWebPage();
		wdc.verifyThePageTitle(expectedTitle, "Home Page");
		hp.getSearchTextBox().sendKeys("Shoes");
	
		hp.getSearchButton().click();
		Thread.sleep(2000);
		hp.getPriceLowToHigh().click();
	
		hp.getSecondProduct().click();
		String parentHandle = driver.getWindowHandle();
		Set<String> allhandles =driver.getWindowHandles();

		for(String wh : allhandles)
		{
			if(!parentHandle.equals(wh))
		{
				driver.switchTo().window(wh);
			}
			else
			{

			}
		}
		hp.getAddtoCart().click();
		
		driver.switchTo().window(parentHandle);
		
		hp.getThirdProduct().clear();
		String parentHandle1 = driver.getWindowHandle();
		Set<String> allhandles1 =driver.getWindowHandles();

		for(String wh1 : allhandles1)
		{
			if(!parentHandle1.equals(wh1))
		{
				driver.switchTo().window(wh1);
			}
			else
			{

			}
		}
		hp.getAddtoCart().click();
		
		
		
	}


}
