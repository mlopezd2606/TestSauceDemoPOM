Feature: Agregar productos en Sauce Demo
Scenario Outline: Agregar un producto al carrito de compra
Given que estoy en la pagina de productos
And he iniciado sesion con exito
When selecciono el producto "<product>" de la lista
And presiono el boton de agregar al carrito
Then veo que el producto "<product>" fue agregado al carrito de compra

Examples:
| product                  |
| Sauce Labs Backpack       |
| Sauce Labs Bike Light     |
| Bolt T-Shirt              |
