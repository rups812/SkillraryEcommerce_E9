package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
	//Declaration
	//address of gears webelement
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	//address of skillrary demo app
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	//address of search text field
	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchtf;		
	//address of search icon
	@FindBy(xpath = "//input[@value='go']")
	private WebElement searchicon;
	//address of cookies
	@FindBy(xpath = "//a[@class='close_cookies']")
	private WebElement cookies;
	
	//initialization
	public SkillraryHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void gearsButton() {
		gearsbtn.click();
	}
	public void skillrarydemoappWebElement() {
		skillrarydemoapp.click();
	}
	public void searchTextfield(String data) {
		searchtf.sendKeys(data);
	}
	public void searchiconWebElement() {
		searchicon.click();
	}
	public void cookiesIcon() {
		cookies.click();
	}
}
