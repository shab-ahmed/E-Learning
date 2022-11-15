package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Class1Page {

	@FindBy(xpath= "") private WebElement CountSmallNo;
	@FindBy(xpath= "") private WebElement Start;
	@FindBy(xpath= "") private WebElement LetsGo;
	//these questions keep changing. can't be accessed.
	@FindBy(xpath= "") private WebElement QuestSource1;
	@FindBy(xpath= "") private WebElement DestElement1;
	@FindBy(xpath= "") private WebElement Check;
	@FindBy(xpath= "") private WebElement TryAgain;
	
	@FindBy(xpath= "") private WebElement CompareSmallNo;
	@FindBy(xpath= "//h3[text()='Numbers from 10 to 20']") private WebElement Num10To20;
	@FindBy(xpath= "") private WebElement TeenNoStart;
	@FindBy(xpath= "") private WebElement Quiz1;
	
	


}
