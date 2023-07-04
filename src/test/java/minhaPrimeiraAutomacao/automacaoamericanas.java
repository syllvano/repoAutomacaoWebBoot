package minhaPrimeiraAutomacao;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class automacaoamericanas {
	WebDriver driver;

	@BeforeEach
	public void setUp() throws Exception {
		//codigo para mostrar o caminho do site
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				//codigo para abrir o navegador
				driver = new ChromeDriver();
				//codigo para passar o caminho do site
				driver.get("https://www.americanas.com.br");
				//codigo para maximizar o site
				driver.manage().window().maximize();
				// comando para clicar
				
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
