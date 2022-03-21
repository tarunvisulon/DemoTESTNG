package TestNG.DataProvider;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

import TestNG.TestNG.DataSupplier;
import TestNG.TestNG.ExcelSupplier;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider extends DataSupplier
{   
	@Test(dataProvider = "getExcelData" , dataProviderClass = ExcelSupplier.class)
	public void Vflogin(String username,String pass)
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://timberlanddev.visulon.com/");
		driver.findElement(By.id("txtUserName")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("LinkButton1")).click();
		
		Assert.assertTrue(driver.findElement(By.id("btnTop_Assortment")).isDisplayed());
		
		driver.quit();
		
		
		
	}
	
	
	
	/*
	 * @DataProvider(name="logindata") public Object[][] TestLogindata() {
	 * Object[][] data= new Object[2][2];
	 * 
	 * data[0][0]="tarun_VF"; data[0][1]="admin@123";
	 * 
	 * data[1][0]="tarunVF"; data[1][1]="admin@1234";
	 * 
	 * return data ; }
	 */
	

}
