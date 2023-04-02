package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.OrdenarProductosSteps;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
public class OrdenarProductosDefinitions {

    @Steps
    OrdenarProductosSteps ordenarProductosSteps;

    @When("^selecciono \"([^\"]*)\" en el menu de ordenamiento$")
    public void seleccionoSomethingEnElMenuDeOrdenamiento(String tipoOrden) throws Throwable {
        ordenarProductosSteps.ordenarPor(tipoOrden);
    }

    @Then("^veo los productos ordenados por precio de menor a mayor$")
    public void veoLosProductosOrdenadosPorPrecioDeMenorAMayor() throws Throwable {
        ordenarProductosSteps.veoLosProductosOrdenadosPorPrecioDeMenorAMayor();
    }

    @And("^el precio del primer producto es menor o igual al precio del segundo producto$")
    public void elPrecioDelPrimerProductoEsMenorOIgualAlPrecioDelSegundoProducto() throws Throwable {
        ordenarProductosSteps.elPrecioDelProducto1EsMenorOIgualAlDel2();
    }

    @And("^el precio del segundo producto es menor o igual al precio del tercer producto$")
    public void elPrecioDelSegundoProductoEsMenorOIgualAlPrecioDelTercerProducto() throws Throwable {
        ordenarProductosSteps.elPrecioDelProducto2EsMenorOIgualAlDel3();
    }

    @And("^el precio del tercer producto es menor o igual al precio del cuarto producto$")
    public void elPrecioDelTercerProductoEsMenorOIgualAlPrecioDelCuartoProducto() throws Throwable {
        ordenarProductosSteps.elPrecioDelProducto3EsMenorOIgualAlDel4();
    }
}
