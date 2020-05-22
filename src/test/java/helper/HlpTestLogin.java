package helper;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import pageObjects.PgoTestLogin;
import support.Utils;

public class HlpTestLogin extends Utils{
	PgoTestLogin pg;

	public HlpTestLogin(AndroidDriver<WebElement> androidDriver) {
		super(androidDriver);
		pg = new PgoTestLogin(androidDriver);
	}

	public void preencherCPF(String cpf) {
		aguardeEnquantoAvisoEstiverNaTela();
		preencheCampo(pg.CMP_CPF, cpf);
	}

	public void apagarCPF() {
		click(pg.TXT_APAGAR_CPF);
	}

	public void preencherSenha(String senha) {
		aguardeEnquantoAvisoEstiverNaTela();
		preencheCampo(pg.CMP_SENHA, senha);
	}

	public void clicarBotaoEntrar() {
		aguardeEnquantoAvisoEstiverNaTela();
		click(pg.BTN_ENTRAR);
	}

	public void validaMensagemUsuarioSenhaInvalidos() {
		pontoVerificacao(pg.TXT_USUARIO_SENHA_INVALIDOS, "Usuário e/ou senha inválidos");
	}

	public void validaMensagemSenhaNaoInformada() {
		pontoVerificacao(pg.TXT_SENHA_NAO_INFORMADA, "Digite uma senha válida");
	}
	
	public void validaMensagemCpfNaoInformado() {
		pontoVerificacao(pg.TXT_CPF_NAO_INFORMADO, "Digite um CPF válido");
	}


	public void validaLoginComSucesso() {
		pulaHabilitacaoDigital();
		pontoVerificacao(pg.TXT_BOAS_VINDAS, "Boas-vindas!");
	}

	public void clicarBotaoSair() {
		click(pg.BTN_SAIR);
	}


	private void pulaHabilitacaoDigital() {
		try {
			aguardeEnquantoAvisoEstiverNaTela();
			pg.TXT_HABILITAR_LEITOR_DIGITAL.isDisplayed();
			click(pg.BTN_HABILITAR_DEPOIS);
		} catch (Exception e) {
		}
	}

	public void aguardeEnquantoAvisoEstiverNaTela() {
		try {
			Thread.sleep(2000);
			while(pg.TXT_AVISO.isDisplayed()) {
				Thread.sleep(1000);
			}
		} catch (Exception e) {
		}
	}
}
