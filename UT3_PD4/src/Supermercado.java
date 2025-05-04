import java.io.*;
import java.util.*;

public class Supermercado {
    private Map<String, Producto> productos;

    public Supermercado() {
        productos = new HashMap<>();
    }

    public void incorporarProducto(String codigo, String descripcion, double precioUnitario, int cantidad) {
        Producto producto = productos.get(codigo);
        if (producto == null) {
            productos.put(codigo, new Producto(codigo, descripcion, precioUnitario, cantidad));
        } else {
            producto.agregarStock(cantidad);
        }
    }

    public double venderProducto(String codigo, int cantidad) {
        Producto producto = productos.get(codigo);
        if (producto != null && producto.venderProducto(cantidad)) {
            return producto.getPrecioUnitario() * cantidad;
        }
        return 0;
    }

    public void listarProductos() {
        productos.values().stream()
                .sorted(Comparator.comparing(Producto::getDescripcion))
                .forEach(System.out::println);
    }

    public int obtenerStock(String codigo) {
        Producto producto = productos.get(codigo);
        return (producto != null) ? producto.getCantidad() : 0;
    }

    public double calcularValorTotal() {
        return productos.values().stream().mapToDouble(Producto::calcularValorStock).sum();
    }

    public void cargarDesdeArchivoAltas(String archivo) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 4) {
                    try {
                        String codigo = datos[0].trim();
                        String descripcion = datos[1].trim();
                        double precioUnitario = Double.parseDouble(datos[2].trim());
                        int cantidad = Integer.parseInt(datos[3].trim());

                        incorporarProducto(codigo, descripcion, precioUnitario, cantidad);
                    } catch (NumberFormatException e) {
                        System.err.println("Error en los datos del archivo: " + linea);
                    }
                } else {
                    System.err.println("Linea del archivo no válida: " + linea);
                }
            }
        }
    }

    public double procesarVentas(String archivo) throws IOException {
        double totalVentas = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                String codigo = datos[0].trim();
                int cantidad = Integer.parseInt(datos[1].trim());

                double montoVenta = venderProducto(codigo, cantidad);
                totalVentas += montoVenta;
            }
        }
        return totalVentas;
    }
}
