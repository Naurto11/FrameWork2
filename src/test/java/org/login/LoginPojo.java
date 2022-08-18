package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	
	
	public LoginPojo() {

		PageFactory.initElements(driver, this);
		
	
	}
	
	@FindBy(id="username")
	
	private WebElement txtuser;
	
	@FindBy(name="password")
	
	private WebElement txtpass;
	
	@FindBy(className="login_button")
	
	private WebElement lognbtn;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getLognbtn() {
		return lognbtn;
	}

}
