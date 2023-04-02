Feature: Iniciar sesion en Sauce Demo
  Scenario: Iniciar sesion con exito
    Given que estoy en la pagina de inicio de sesion
    When ingreso mi nombre de usuario "standard_user" y mi clave "secret_sauce"
    Then veo la pagina de productos
