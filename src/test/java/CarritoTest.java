import org.example.entidades.Carrito;
import org.example.entidades.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarritoTest {
    @Test
    public void testAgregarProducto() {
        Carrito carrito = new Carrito();
        Producto manzana = new Producto("Manzana", 0.5);
        Producto banana = new Producto("Banana", 0.3);

        carrito.agregarProducto(manzana, 3);
        carrito.agregarProducto(banana, 2);

        assertEquals(2, carrito.getItems().size());
        assertEquals(3, carrito.getItems().get(0).getCantidad());
        assertEquals(2, carrito.getItems().get(1).getCantidad());
    }

    @Test
    public void testEliminarProducto() {
        Carrito carrito = new Carrito();
        Producto manzana = new Producto("Manzana", 0.5);

        carrito.agregarProducto(manzana, 3);
        carrito.eliminarProducto(manzana);

        assertEquals(0, carrito.getItems().size());
    }

    @Test
    public void testModificarCantidadProducto() {
        Carrito carrito = new Carrito();
        Producto manzana = new Producto("Manzana", 0.5);

        carrito.agregarProducto(manzana, 3);
        carrito.modificarCantidadProducto(manzana, 5);

        assertEquals(5, carrito.getItems().get(0).getCantidad());
    }

    @Test
    public void testCalcularTotal() {
        Carrito carrito = new Carrito();
        Producto manzana = new Producto("Manzana", 0.5);
        Producto banana = new Producto("Banana", 0.3);

        carrito.agregarProducto(manzana, 3);
        carrito.agregarProducto(banana, 2);

        assertEquals(2.1, carrito.calcularTotal(), 0.01);
    }
}
