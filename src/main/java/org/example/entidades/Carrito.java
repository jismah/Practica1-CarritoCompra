package org.example.entidades;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<ItemCarrito> items;

    public Carrito() {
        this.items = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        for (ItemCarrito item : items) {
            if (item.getProducto().equals(producto)) {
                item.setCantidad(item.getCantidad() + cantidad);
                return;
            }
        }
        items.add(new ItemCarrito(producto, cantidad));
    }

    public void eliminarProducto(Producto producto) {
        items.removeIf(item -> item.getProducto().equals(producto));
    }

    public void modificarCantidadProducto(Producto producto, int cantidad) {
        for (ItemCarrito item : items) {
            if (item.getProducto().equals(producto)) {
                if (cantidad <= 0) {
                    items.remove(item);
                } else {
                    item.setCantidad(cantidad);
                }
                return;
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public List<ItemCarrito> getItems() {
        return items;
    }
}
