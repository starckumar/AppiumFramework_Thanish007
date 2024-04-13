package AppiumtestFW.AppiumtestFW;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


public class A1_AppiumBasicsApp1 extends A0_UiAutomator2options

{

	
	static AndroidDriver driver;
	
	public void testBasicFlow()
	{
		driver.findElement(By.xpath ("//android.widget.TextView[@content-desc=\"App\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Activity\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
		
	}
	
	public static void main(String[] args) throws MalformedURLException{
		A0_UiAutomator2options options = new A0_UiAutomator2options();

		driver= new AndroidDriver(new URL("http:/10.0.0.7:4723/wd/hub"),
				options.getApiDemoApkOptions());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		A1_AppiumBasicsApp1 obj = new A1_AppiumBasicsApp1();		
				obj.testBasicFlow();
	}
}

// /wd/hub

