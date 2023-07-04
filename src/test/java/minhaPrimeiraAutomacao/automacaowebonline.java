package minhaPrimeiraAutomacao;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automacaowebonline {
    WebDriver driver;
	@Before
	public void setUp() throws Exception {
		//codigo para mostrar o caminho do site
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		//codigo para passar o caminho do site
		driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
		 Thread.sleep(3000);
	    driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap-v4");
	    Thread.sleep(3000);
	    driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap-v4/add");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElement(By.id("field-customerName")).sendKeys("Silvano");
	    driver.findElement(By.id("field-contactLastName")).sendKeys("Silvinho");
	    driver.findElement(By.id("field-contactFirstName")).sendKeys("Silvano Silva");
	    driver.findElement(By.id("field-phone")).sendKeys("1165212120");
	    driver.findElement(By.id("field-addressLine1")).sendKeys("rua 06");
	    Thread.sleep(1000);
	    driver.findElement(By.id("field-addressLine2")).sendKeys("rua 13");
	    driver.findElement(By.id("field-city")).sendKeys("cruz das almas");
	    driver.findElement(By.id("field-state")).sendKeys("Bahia-Ba");
	    driver.findElement(By.id("field-postalCode")).sendKeys("44380-000");
	    driver.findElement(By.id("field-country")).sendKeys("Brasil");
	    driver.findElement(By.id("field-salesRepEmployeeNumber")).sendKeys("1158344001");
	    driver.findElement(By.id("field-creditLimit")).sendKeys("R$ 5,000,00");
	    driver.findElement(By.id("field-deleted")).sendKeys("deletada");
	    Thread.sleep(5000);
	    driver.findElement(By.id("form-button-save")).sendKeys("salvar");
	    Thread.sleep(5000);
	    driver.findElement(By.id("cancel-button")).sendKeys("cancelar tudo");
	   


	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
