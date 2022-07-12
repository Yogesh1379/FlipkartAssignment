package testpackage;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.CustomeListener;
import generic.WebDriverCommonLib;
import pagepackage.HomePage;
@Listeners(CustomeListener.class)


public class TestSortFunctionality extends BaseTest {
	
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
		WebElement pageNumber = hp.getSecondPage();
		
		wdc.scrollTillPerticularWebELement(pageNumber);
		pageNumber.click();
	}

}
