package com.saucedemo.main.steps;

import com.saucedemo.main.pages.*;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    @ManagedPages
    LoginPage loginPage;

    @ManagedPages
    ProductsPage productsPage;

    @Step
    public void abrirPaginaInicioDeSesion() {
        loginPage.open();
    }

    @Step
    public void ingresarCredenciales(String usuario, String clave) {
        loginPage.iniciarSesion(usuario, clave);
    }

    @Step
    public void veoLaPaginaDeProductos() {
        productsPage.estoyEnProductsPage();
    }
}
