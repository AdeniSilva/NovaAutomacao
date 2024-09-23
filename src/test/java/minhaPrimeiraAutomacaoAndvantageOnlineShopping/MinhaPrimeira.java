package minhaPrimeiraAutomacaoAndvantageOnlineShopping;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinhaPrimeira {

  WebDriver navegador;	
	
	@Before
	public void setUp() throws Exception {
	// mostrar caminho do Chrome Driver 
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	// abrir sempre um novo Chrome
		navegador = new ChromeDriver();
		// comando para mostrar o site
		navegador.get("https://www.advantageonlineshopping.com/#/");
		// comando para maximizar tela
		navegador.manage().window().maximize();
		Thread.sleep(3000);
		// comando para clicar
		navegador.findElement(By.id("menuUser")).click();
		// comando para preenher 
		navegador.findElement(By.name("username")).sendKeys("adeniturma20");
		// comando de pausa
		Thread.sleep(3000);
		navegador.findElement(By.name("password")).sendKeys("Turma20fc@");
		navegador.findElement(By.id("sign_in_btn")).click();
		Thread.sleep(5000);
		navegador.quit();
	}
		@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
