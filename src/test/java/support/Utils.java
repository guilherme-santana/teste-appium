package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;

public class Utils {

	protected static WebDriverWait wait;

	public Utils(AndroidDriver<WebElement> androidDriver) {
		wait = new WebDriverWait((WebDriver) androidDriver, 30);
	}

	/**
	 * Método para preenchimento de campos
	 * @param object
	 * @param valor
	 */
	public void preencheCampo(WebElement object, String valor) {
		wait.until(ExpectedConditions.elementToBeClickable(object));
		object.sendKeys(valor);
	}

	/**
	 * Método para cliques de botões ou ícones
	 * @param object
	 */
	public void click(WebElement object) {
		wait.until(ExpectedConditions.elementToBeClickable(object));
		object.click();
	}

	/**
	 * Método para validação de campos e resultado esperado
	 * @param esperado
	 * @param valorAtual
	 */
	public void pontoVerificacao(WebElement valorAtual,String esperado) {
		String valorActual = wait.until(ExpectedConditions.elementToBeClickable(valorAtual)).getText();
		Assert.assertEquals(valorActual, esperado);
	}

}
