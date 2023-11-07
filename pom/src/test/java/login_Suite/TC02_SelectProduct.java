package login_Suite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import comunClasses.SetupDriver;
import comunClasses.Variables_Globales;
import navegacion_Paginas.Inventory_Page;
import navegacion_Paginas.Login_Page;

public class TC02_SelectProduct {

	WebDriver driver=SetupDriver.setupDriver(); 
	
	Login_Page login = new Login_Page(driver); 
	Inventory_Page inventory = new Inventory_Page(driver);
	
	@BeforeTest
	public void iniciarWebDriver() 
	{
		driver.get(Variables_Globales.HOME_PAGE);
		driver.manage().window().maximize();
		login.login(Variables_Globales.USER_ADMIN, Variables_Globales.PASSWORD_ADMIN); 
		
		driver.get(Variables_Globales.INVENTORY_PAGE);
	}
	
  @Test
  public void TC_02()
  { 
	 inventory.addCart();
	 inventory.logout();
  }

  @AfterTest
  public void closeDriver() 
  {
	  driver.quit();
  }
}
