Feature: Ordenar productos en Sauce Demo

  Scenario: Ordenar por precio de menor a mayor
    Given que estoy en la pagina de productos
    And he iniciado sesion con exito
    When selecciono "Price (low to high)" en el menu de ordenamiento
    Then veo los productos ordenados por precio de menor a mayor
    And el precio del primer producto es menor o igual al precio del segundo producto
    And el precio del segundo producto es menor o igual al precio del tercer producto
    And el precio del tercer producto es menor o igual al precio del cuarto producto
