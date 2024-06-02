import org.example.entidades.ItemCarrito;
import org.example.entidades.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemCarritoTest {
    @Test
    public void testGettersAndSetters() {
        Producto producto = new Producto("Manzana", 0.5);
        ItemCarrito itemCarrito = new ItemCarrito(producto, 2);

        assertEquals(producto, itemCarrito.getProducto());
        assertEquals(2, itemCarrito.getCantidad());

        itemCarrito.setCantidad(5);
        assertEquals(5, itemCarrito.getCantidad());
        assertEquals(2.5, itemCarrito.getSubtotal(), 0.01);
    }
}
