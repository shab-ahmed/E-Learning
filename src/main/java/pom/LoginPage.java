package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath= "") private WebElement ContinueWithGoogle;
	@FindBy(xpath= "") private WebElement ContinueWithClever;
	@FindBy(xpath= "") private WebElement ContinueWithApple;

	
	@FindBy(xpath= "") private WebElement EnterEmail;
	@FindBy(xpath= "") private WebElement EnterPassword;
	@FindBy(xpath= "") private WebElement LogIn;
	@FindBy(xpath= "") private WebElement ForgotPassword;
	
	@FindBy(xpath= "") private WebElement CreateAnAccount;
	
	
	
	
	
}
