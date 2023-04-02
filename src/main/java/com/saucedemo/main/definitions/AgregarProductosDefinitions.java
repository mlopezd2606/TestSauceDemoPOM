package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.AgregarProductosSteps;
import com.saucedemo.main.steps.LoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AgregarProductosDefinitions {
    @Steps
    LoginSteps loginSteps;

    @Steps
    AgregarProductosSteps agregarProductosSteps;

    @Given("^que estoy en la pagina de productos$")
    public void queEstoyEnLaPaginaDeProductos() throws Throwable {
        agregarProductosSteps.veoLaPaginaDeProductos();
    }

    @And("^he iniciado sesion con exito$")
    public void heIniciadoSesionConExito() throws Throwable {
        agregarProductosSteps.heIniciadoSesionConExito();
    }

    @When("^selecciono el producto \"([^\"]*)\" de la lista$")
    public void seleccionoElProductoSomethingDeLaLista(String productName) throws Throwable {
        agregarProductosSteps.seleccionarProducto(productName);
    }

    @And("^presiono el boton de agregar al carrito$")
    public void presionoElBotonDeAgregarAlCarrito() throws Throwable {
        agregarProductosSteps.agregarAlCarrito();
    }

    @Then("^veo que el producto \"([^\"]*)\" fue agregado al carrito de compra$")
    public void veoQueElProductoSomethingFueAgregadoAlCarritoDeCompra(String productName) throws Throwable {
        agregarProductosSteps.verProductoEnCarrito(productName);
    }


}
