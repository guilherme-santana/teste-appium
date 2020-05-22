package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PgoTestLogin {
	
	public PgoTestLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@text='CPF']")
	public WebElement CMP_CPF;
	
	@FindBy(xpath = "//*[@text='Senha']")
	public WebElement CMP_SENHA;
	
	@FindBy(xpath = "//*[@text='Entrar']")
	public WebElement BTN_ENTRAR;
	
	@FindBy(xpath = "//*[@text='Habilitar leitor de digital?']")
	public WebElement TXT_HABILITAR_LEITOR_DIGITAL;
	
	@FindBy(xpath = "//*[@text='Habilitar depois em Configura��es']")
	public WebElement BTN_HABILITAR_DEPOIS;
	
	@FindBy(xpath = "//*[@text='Boas-vindas!']")
	public WebElement TXT_BOAS_VINDAS;
	
	@FindBy(xpath = "//*[@text='Sair 0']")
	public WebElement BTN_SAIR;
	
	@FindBy(xpath = "//*[@text='Estamos felizes em receber seus coment�rios.']")
	public WebElement TXT_AVISO;
	
	@FindBy(xpath = "//*[@text='Usu�rio e/ou senha inv�lidos']")
	public WebElement TXT_USUARIO_SENHA_INVALIDOS;
	
	@FindBy(xpath = "//*[@text='Digite uma senha v�lida']")
	public WebElement TXT_SENHA_NAO_INFORMADA;
	
	@FindBy(xpath = "//*[@text='Digite um CPF v�lido']")
	public WebElement TXT_CPF_NAO_INFORMADO;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement TXT_APAGAR_CPF;
	
	




	

	
	
}
