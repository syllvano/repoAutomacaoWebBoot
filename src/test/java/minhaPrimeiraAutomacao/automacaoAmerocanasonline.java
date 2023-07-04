package minhaPrimeiraAutomacao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class automacaoAmerocanasonline {
	
    WebDriver driver;
    
	@BeforeEach
	void setUp() throws Exception {
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
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
