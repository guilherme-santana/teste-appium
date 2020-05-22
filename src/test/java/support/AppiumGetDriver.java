package support;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class AppiumGetDriver{


	public static AndroidDriver<WebElement> driver;

	public static AndroidDriver<WebElement> createDriver() {

		try {
			File diretorioAplicacao = new File("apps");
			File arquivoAplicacao = new File(diretorioAplicacao, "app-release.apk");
			DesiredCapabilities capacidade = new DesiredCapabilities();
			capacidade.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
			capacidade.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
			capacidade.setCapability("appPackage", "br.com.liveloincentivo");
			capacidade.setCapability(MobileCapabilityType.APP, arquivoAplicacao.getAbsolutePath());
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capacidade);

		}catch (MalformedURLException e){
			System.out.println( e.getMessage() );
		}
		return driver;
	}

	public static AndroidDriver<WebElement> getDriver()  {
		if (driver == null){
			return createDriver();
		}
		return  driver;
	}

	public static void closeDriver(){
		driver.quit();
	}

	public static void relaunchApp() {
		driver.launchApp();
	}
}