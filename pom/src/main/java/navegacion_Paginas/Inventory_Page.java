package navegacion_Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import comunClasses.Clase_Base;

public class Inventory_Page 
{
	public Inventory_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this); 
	}
	
	//Identificamos los elementos con los que vamos a trabajar
	// add cart
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addCartBackpack;
	//Burger button
	@FindBy(id="react-burger-menu-btn")
	private WebElement btnBurgerMenu;
	//Boton Logout
	@FindBy(id="logout_sidebar_link")
	private WebElement btnLogout;
	
	
	//Creamos el metodo de Login
	
	public void addCart () 
	{
		Clase_Base.click(addCartBackpack);
	}
	
	public void logout () 
	{	
		Clase_Base.click(btnBurgerMenu);
		Clase_Base.click(btnLogout);
	}
}
