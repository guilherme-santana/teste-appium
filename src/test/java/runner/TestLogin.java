package runner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import helper.HlpTestLogin;
import support.AppiumGetDriver;


public class TestLogin extends AppiumGetDriver{
	private static HlpTestLogin tlg;

	@BeforeClass
	public void init() {
		tlg = new HlpTestLogin(getDriver());
	}

	@Test
	public void CT01_validarLoginComSucesso(){
		tlg.preencherCPF("44966917875");
		tlg.preencherSenha("141629");
		tlg.clicarBotaoEntrar();
		tlg.validaLoginComSucesso();
		tlg.clicarBotaoSair();
	}

	@Test
	public void CT02_validarSenhaInvalida() {
		tlg.preencherCPF("44966917875");
		tlg.preencherSenha("123456");
		tlg.clicarBotaoEntrar();
		tlg.validaMensagemUsuarioSenhaInvalidos();
	}
	
	@Test
	public void CT03_validarCPFInvalido() {
		tlg.apagarCPF();
		tlg.preencherCPF("11111111111");
		tlg.clicarBotaoEntrar();
		tlg.validaMensagemUsuarioSenhaInvalidos();
	}
	
	@Test
	public void CT04_validarCPFNaoInformado() {
		tlg.apagarCPF();
		tlg.clicarBotaoEntrar();
		tlg.validaMensagemCpfNaoInformado();
	}

	@AfterClass
	public static void quitDriver() {
		closeDriver();
	}

}
