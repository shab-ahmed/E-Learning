package pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DonatePage {
	
	@FindBy(xpath= "") private WebElement Login;

	@FindBy(xpath= "") private WebElement OneTime;
	
	@FindBy(xpath= "") private WebElement Recurring;
	@FindBy(xpath= "") private WebElement OftenDonation;

	// these elements are common for both OneTime and Recurring type donations.
	@FindBy(xpath= "") private List<WebElement> DonationAmount;
	@FindBy(xpath= "") private WebElement EnterAmount;
	@FindBy(xpath= "") private WebElement Dedicate;
	@FindBy(xpath= "") private WebElement FirstName;
	@FindBy(xpath= "") private WebElement LastName;
	@FindBy(xpath= "") private WebElement Email;
	@FindBy(xpath= "") private WebElement PhoneNo;
	@FindBy(xpath= "") private WebElement HideName;
	@FindBy(xpath= "") private WebElement CreditCard;
	@FindBy(xpath= "") private WebElement BankTransfer;
	@FindBy(xpath= "") private WebElement YesCheckbox;
	
	@FindBy(xpath= "") private WebElement BackToTop;







	

	
	
	


	



}
