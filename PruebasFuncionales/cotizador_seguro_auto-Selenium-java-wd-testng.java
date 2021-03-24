package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CotizadorSeguroAuto {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.blazedemo.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCotizadorSeguroAuto() throws Exception {
    // Label: Test
    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1266,561 | ]]
    driver.get("http://tcon194:9080/PinCotizadorVida-web/cargarProductos.do");
    driver.findElement(By.id("rut")).clear();
    driver.findElement(By.id("rut")).sendKeys("26928900-7");
    driver.findElement(By.id("rut")).clear();
    driver.findElement(By.id("rut")).sendKeys("26928900-7");
    driver.findElement(By.id("rut")).clear();
    driver.findElement(By.id("rut")).sendKeys("26928900-7");
    driver.findElement(By.id("apellidoPaterno")).clear();
    driver.findElement(By.id("apellidoPaterno")).sendKeys("bernal");
    driver.findElement(By.id("apellidoPaterno")).clear();
    driver.findElement(By.id("apellidoPaterno")).sendKeys("bernal");
    driver.findElement(By.id("apellidoPaterno")).clear();
    driver.findElement(By.id("apellidoPaterno")).sendKeys("bernal");
    driver.findElement(By.id("apellidoMaterno")).clear();
    driver.findElement(By.id("apellidoMaterno")).sendKeys("camacho");
    driver.findElement(By.id("apellidoMaterno")).clear();
    driver.findElement(By.id("apellidoMaterno")).sendKeys("camacho");
    driver.findElement(By.id("apellidoMaterno")).clear();
    driver.findElement(By.id("apellidoMaterno")).sendKeys("camacho");
    driver.findElement(By.id("nombres")).clear();
    driver.findElement(By.id("nombres")).sendKeys("soraimar claivel");
    driver.findElement(By.id("nombres")).clear();
    driver.findElement(By.id("nombres")).sendKeys("soraimar claivel");
    driver.findElement(By.id("nombres")).clear();
    driver.findElement(By.id("nombres")).sendKeys("soraimar claivel");
    driver.findElement(By.name("bean.coverList[0].capital")).clear();
    driver.findElement(By.name("bean.coverList[0].capital")).sendKeys("2000");
    driver.findElement(By.name("bean.coverList[0].capital")).clear();
    driver.findElement(By.name("bean.coverList[0].capital")).sendKeys("2000");
    driver.findElement(By.name("bean.nvalPrimaProyectada")).clear();
    driver.findElement(By.name("bean.nvalPrimaProyectada")).sendKeys("2.0");
    driver.findElement(By.name("bean.nvalPrimaProyectada")).clear();
    driver.findElement(By.name("bean.nvalPrimaProyectada")).sendKeys("2.0");
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | name=bean.nvalPrimaProyectada | ]]
    driver.findElement(By.name("bean.nvalPrimaProyectada")).clear();
    driver.findElement(By.name("bean.nvalPrimaProyectada")).sendKeys("31.0");
    driver.findElement(By.name("bean.nvalPrimaProyectada")).clear();
    driver.findElement(By.name("bean.nvalPrimaProyectada")).sendKeys("31.0");
    driver.findElement(By.id("calle")).clear();
    driver.findElement(By.id("calle")).sendKeys("test");
    driver.findElement(By.id("calle")).clear();
    driver.findElement(By.id("calle")).sendKeys("test");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("test@test.com");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("test@test.com");
    driver.findElement(By.id("reemail")).clear();
    driver.findElement(By.id("reemail")).sendKeys("test@test.com");
    driver.findElement(By.id("reemail")).clear();
    driver.findElement(By.id("reemail")).sendKeys("test@test.com");
    driver.findElement(By.id("nroTelefono1")).clear();
    driver.findElement(By.id("nroTelefono1")).sendKeys("12312312");
    driver.findElement(By.id("nroTelefono1")).clear();
    driver.findElement(By.id("nroTelefono1")).sendKeys("12312312");
    driver.findElement(By.id("numero")).clear();
    driver.findElement(By.id("numero")).sendKeys("123");
    driver.findElement(By.id("numero")).clear();
    driver.findElement(By.id("numero")).sendKeys("123");
    driver.findElement(By.id("deptoCasa")).clear();
    driver.findElement(By.id("deptoCasa")).sendKeys("123");
    driver.findElement(By.id("deptoCasa")).clear();
    driver.findElement(By.id("deptoCasa")).sendKeys("123");
    driver.findElement(By.id("nroPropuesta")).clear();
    driver.findElement(By.id("nroPropuesta")).sendKeys("90090014");
    driver.findElement(By.id("nroPropuesta")).clear();
    driver.findElement(By.id("nroPropuesta")).sendKeys("90090014");
    driver.findElement(By.id("nroPropuestaConf")).clear();
    driver.findElement(By.id("nroPropuestaConf")).sendKeys("90090014");
    driver.findElement(By.id("nroPropuestaConf")).clear();
    driver.findElement(By.id("nroPropuestaConf")).sendKeys("90090014");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
