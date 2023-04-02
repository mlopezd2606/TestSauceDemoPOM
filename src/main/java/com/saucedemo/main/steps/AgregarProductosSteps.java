package com.saucedemo.main.steps;

import com.saucedemo.main.pages.*;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;

public class AgregarProductosSteps {
    @ManagedPages
    ProductsPage productsPage;

    @ManagedPages
    LoginPage loginPage;

    @Step
    public void veoLaPaginaDeProductos() {
        productsPage.estoyEnProductsPage();
    }

    @Step
    public void heIniciadoSesionConExito() {
        loginPage.inicioDeSesionExitoso();
    }


    @Step
    public void seleccionarProducto(String productName) {
        productsPage.seleccionarProducto(productName);
    }

    @Step
    public void agregarAlCarrito() {
        productsPage.agregarAlCarrito();
    }

    @Step
    public void verProductoEnCarrito(String productName) {
        productsPage.verProductoEnCarrito(productName);
    }
}
