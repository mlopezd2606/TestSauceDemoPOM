package com.saucedemo.main.pages;

        import net.serenitybdd.core.pages.PageObject;
        import net.thucydides.core.annotations.DefaultUrl;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import static org.hamcrest.MatcherAssert.assertThat;
        import static org.hamcrest.Matchers.*;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class ProductsPage extends PageObject {

    public static final String TEXTO_ESPERADO_HOME_PAGE = "Products";
    public static final String TEXTO_ESPERADO_ORDEN_PRECIO_MENOR_A_MAYOR = "Price (low to high)";

    public void estoyEnProductsPage() {
        WebElement productsLabel =  getDriver().findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        String textoActualHomePage = productsLabel.getText();

        assertThat(textoActualHomePage, equalTo(TEXTO_ESPERADO_HOME_PAGE));
    }

    public void seleccionarProducto(String productName) {
        WebElement product = getDriver().findElement(By.xpath("//div[contains(text(), '" + productName + "')]"));
        product.click();
    }

    public void agregarAlCarrito() {
        WebElement addToCartBtn = getDriver().findElement(By.xpath("//*[starts-with(@id, 'add-to-cart')]"));
        addToCartBtn.click();
    }

    public void verProductoEnCarrito(String productName) {
        WebElement shoppingCartBtn = getDriver().findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        shoppingCartBtn.click();

        WebElement product = getDriver().findElement(By.xpath("//div[contains(text(), '" + productName + "')]"));

        WebElement continueShoppingBtn = getDriver().findElement(By.id("continue-shopping"));
        continueShoppingBtn.click();

    }

    public void ordenarPor(String tipoOrden) {
        WebElement oderListOption = getDriver().findElement(By.xpath("//select/option[contains(text(), '" + tipoOrden + "')]"));
        oderListOption.click();
    }

    public void veoLosProductosOrdenadosPorPrecioDeMenorAMayor() {
        WebElement oderListOption = getDriver().findElement(By.xpath("//span[contains(@class, 'active_option')]"));
        String textoActualOrdenadoPor =  oderListOption.getText();

        assertThat(textoActualOrdenadoPor, equalTo(TEXTO_ESPERADO_ORDEN_PRECIO_MENOR_A_MAYOR));

    }

    public void elPrecioDelProducto1EsMenorOIgualAlDel2() {
        String posicionProductoA = "1";
        String posicionProductoB = "2";

        WebElement productoA = getDriver().findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[" + posicionProductoA + "]/div[2]/div[2]/div"));
        Float precioProductoA = Float.parseFloat(productoA.getText().replace("$",""));

        WebElement productoB = getDriver().findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[" + posicionProductoB + "]/div[2]/div[2]/div"));
        Float precioProductoB = Float.parseFloat(productoB.getText().replace("$",""));

        assertThat(precioProductoA, lessThanOrEqualTo(precioProductoB));
    }

    public void elPrecioDelProducto2EsMenorOIgualAlDel3() {
        String posicionProductoA = "2";
        String posicionProductoB = "3";

        WebElement productoA = getDriver().findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[" + posicionProductoA + "]/div[2]/div[2]/div"));
        Float precioProductoA = Float.parseFloat(productoA.getText().replace("$",""));

        WebElement productoB = getDriver().findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[" + posicionProductoB + "]/div[2]/div[2]/div"));
        Float precioProductoB = Float.parseFloat(productoB.getText().replace("$",""));

        assertThat(precioProductoA, lessThanOrEqualTo(precioProductoB));
    }

    public void elPrecioDelProducto3EsMenorOIgualAlDel4() {
        String posicionProductoA = "3";
        String posicionProductoB = "4";

        WebElement productoA = getDriver().findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[" + posicionProductoA + "]/div[2]/div[2]/div"));
        Float precioProductoA = Float.parseFloat(productoA.getText().replace("$",""));

        WebElement productoB = getDriver().findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[" + posicionProductoB + "]/div[2]/div[2]/div"));
        Float precioProductoB = Float.parseFloat(productoB.getText().replace("$",""));

        assertThat(precioProductoA, lessThanOrEqualTo(precioProductoB));
    }

}

