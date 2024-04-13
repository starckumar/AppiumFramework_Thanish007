package Screens;

import base.Setup;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EMIScreen {
	
	//driver.findElement(By.xpath ("//android.widget.TextView[@content-desc=\"App\"]")).click();
	
	@FindBy(id = Setup.PACKAGE_ID + ":id/btnStart")
    public WebElement btnStart;
	@FindBy(id = Setup.PACKAGE_ID + ":id/etLoanAmount")
	public WebElement txtLoanAmount;
	@FindBy(id = Setup.PACKAGE_ID + ":id/etInterest")
	public WebElement txtInterest;
	@FindBy(id = Setup.PACKAGE_ID + ":id/etYears")
	public WebElement txtPeriod;
    @FindBy(id = Setup.PACKAGE_ID + ":id/etFee")
    public WebElement txtProcessingFee;
    @FindBy(id = Setup.PACKAGE_ID + ":id/btnCalculate")
    public WebElement btnCalculate;

    @FindBy(id = Setup.PACKAGE_ID + ":id/btnDetail")
    public WebElement btnDetail;
    @FindBy(id = Setup.PACKAGE_ID + ":id/btnReset")
    public WebElement btnReset;
    @FindBy(id = Setup.PACKAGE_ID + ":id/alertTitle")
    public WebElement warningAlert;
    @FindBy(id = "android:id/message")
    public WebElement warningMessage;
    @FindBy(id = "android:id/button2")
    public WebElement btnOk;
    @FindBy(id = Setup.PACKAGE_ID + ":id/monthly_emi_result")
    public WebElement monthlyEmiResult;
    @FindBy(id = Setup.PACKAGE_ID + ":id/total_interest_result")
    public WebElement interestResult;
    @FindBy(id = Setup.PACKAGE_ID + ":id/processing_fee_result")
    public WebElement ProcessingFeeResult;
    @FindBy(id = Setup.PACKAGE_ID + ":id/total_payment_result")
    public WebElement paymentResult;

    public EMIScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean emptyFields() {
        btnCalculate.click();
        return warningAlert.isDisplayed();
    }

    public void emiCalculation(int loanAmount, double interest, int period, double processingFee) {
        txtLoanAmount.sendKeys("" + loanAmount + "");
        txtInterest.sendKeys("" + interest + "");
        txtPeriod.sendKeys("" + period + "");
        txtProcessingFee.sendKeys("" + processingFee + "");
        btnCalculate.click();
    }
}
