package com.saucedemo.main.steps;

import com.saucedemo.main.pages.ProductsPage;
import net.thucydides.core.annotations.ManagedPages;

public class OrdenarProductosSteps {
    @ManagedPages
    ProductsPage productsPage;
    public void ordenarPor(String tipoOrden) {
        productsPage.ordenarPor(tipoOrden);
    }

    public void veoLosProductosOrdenadosPorPrecioDeMenorAMayor() {
        productsPage.veoLosProductosOrdenadosPorPrecioDeMenorAMayor();
    }

    public void elPrecioDelProducto1EsMenorOIgualAlDel2() {
        productsPage.elPrecioDelProducto1EsMenorOIgualAlDel2();
    }

    public void elPrecioDelProducto2EsMenorOIgualAlDel3() {
        productsPage.elPrecioDelProducto2EsMenorOIgualAlDel3();
    }

    public void elPrecioDelProducto3EsMenorOIgualAlDel4() {
        productsPage.elPrecioDelProducto3EsMenorOIgualAlDel4();
    }
}
