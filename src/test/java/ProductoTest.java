import org.example.entidades.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoTest {
    @Test
    public void testGettersAndSetters() {
        Producto producto = new Producto("Manzana", 0.5);
        assertEquals("Manzana", producto.getNombre());
        assertEquals(0.5, producto.getPrecio(), 0.01);

        producto.setNombre("Banana");
        producto.setPrecio(0.3);
        assertEquals("Banana", producto.getNombre());
        assertEquals(0.3, producto.getPrecio(), 0.01);
    }
}
