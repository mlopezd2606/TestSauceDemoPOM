package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinitions {
    @Steps
    LoginSteps loginSteps;

    @Given("^que estoy en la pagina de inicio de sesion$")
    public void queEstoyEnLaPaginaDeInicioDeSesion() throws Throwable {
        loginSteps.abrirPaginaInicioDeSesion();
    }

    @When("^ingreso mi nombre de usuario \"([^\"]*)\" y mi clave \"([^\"]*)\"$")
    public void ingresoMiNombreDeUsuarioSomethingYMiClaveSomething(String usuario, String clave) throws Throwable {
        loginSteps.ingresarCredenciales(usuario, clave);
    }

    @Then("^veo la pagina de productos$")
    public void veoLaPaginaDeProductos() throws Throwable {
        loginSteps.veoLaPaginaDeProductos();
    }
}
