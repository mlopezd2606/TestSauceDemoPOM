package com.saucedemo.main.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    public static final String URL_REDIRECCION_INICIO_SESION = "https://www.saucedemo.com/inventory.html";

    public void iniciarSesion(String usuario, String clave) {
        WebElement userNameTxt =  getDriver().findElement(By.id("user-name"));
        WebElement passwordTxt =  getDriver().findElement(By.id("password"));
        WebElement loginBtn =  getDriver().findElement(By.id("login-button"));

        userNameTxt.sendKeys(usuario);
        passwordTxt.sendKeys(clave);
        loginBtn.click();

    }

    public void inicioDeSesionExitoso() {
        String urlActual =  getDriver().getCurrentUrl();
        assertThat(URL_REDIRECCION_INICIO_SESION, equalTo(urlActual));
    }

}
