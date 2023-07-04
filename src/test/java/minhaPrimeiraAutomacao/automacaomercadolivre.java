package minhaPrimeiraAutomacao;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class automacaomercadolivre {
    WebDriver driver;
    
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//codigo para abrir o navegador
		driver = new ChromeDriver();
		//codigo para passar o caminho do site
		driver.get("https://www.mercadolivre.com.br/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("purchases")).sendKeys("comprar");
		driver.findElement(By.name("email")).sendKeys("syllvynhho@hotmail.com");
	 	

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
