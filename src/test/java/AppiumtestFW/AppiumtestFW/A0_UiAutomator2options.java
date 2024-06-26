package AppiumtestFW.AppiumtestFW;

import java.io.File;

import io.appium.java_client.android.options.UiAutomator2Options;

public class A0_UiAutomator2options 
{
public UiAutomator2Options getApiDemoApkOptions()
{
	System.out.println("-----Started: Api Demo Apk------");
	
	ClassLoader classLoader = getClass().getClassLoader();
	File file = new File(classLoader.getResource("builds/C_Android-MyDemoAppRN.1.3.0.build-244.apk").getFile());
String apkPath =file.getAbsolutePath();
UiAutomator2Options options = new UiAutomator2Options();
options
.setPlatformName("Android")
.setPlatformVersion("8.1")
.setAutomationName("UiAutomator2")
.setDeviceName("emulator-5554")
.setAppPackage("io.appium.android.apis")
.setAppActivity(".ApiDemos")
.setApp(apkPath)
.setNoReset(false);

return options;
}

public UiAutomator2Options getSauceLabApkOptions()
{
System.out.println("----Started: Saucelab Demo Apk -----");

ClassLoader classLoader =getClass().getClassLoader();

File file = new File(classLoader.getResource("builds/B_Android-NativeDemoApp-0.4.0.apk").getFile());
String apkPath =file.getAbsolutePath();
UiAutomator2Options options = new UiAutomator2Options();
options
.setPlatformName("Android")
.setPlatformVersion("8.1")
.setAutomationName("UiAutomator2")
.setDeviceName("emulator-5554")
.setAppPackage("com.saucelabs.mydemoapp.rn")
.setAppActivity(".MainActivity")
.setApp(apkPath)
.setNoReset(false);

return options;

}

public UiAutomator2Options getWebdriverIOApkOptions()
{
System.out.println("----Started: WebdriverIO Demo Apk -----");

ClassLoader classLoader =getClass().getClassLoader();

File file = new File(classLoader.getResource("builds/C_Android-MyDemoAppRN.1.3.0.build-244.apk").getFile());
String apkPath =file.getAbsolutePath();
UiAutomator2Options options = new UiAutomator2Options();
options
.setPlatformName("Android")
.setPlatformVersion("8.1")
.setAutomationName("UiAutomator2")
.setDeviceName("emulator-5554")
.setAppPackage("com.wdiodemoapp")
.setAppActivity(".MainActivity")
.setApp(apkPath)
.setNoReset(false);

return options;


}

public UiAutomator2Options getChromeOptions()
{
System.out.println("----Started: Chrome Browser -----");


UiAutomator2Options options = new UiAutomator2Options();
options
.setPlatformName("Android")
.setPlatformVersion("8.1")
.setAutomationName("UiAutomator2")
.setDeviceName("emulator-5554")
.setAppPackage("com.wdiodemoapp")
.noReset()
.withBrowserName("Chrome");

return options;


}
	
	

}
