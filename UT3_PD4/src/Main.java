import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Supermercado gestor = new Supermercado();

        try {
            gestor.cargarDesdeArchivoAltas("UT3_PD4/src/altas.txt");

            System.out.println("Productos cargados:");
            gestor.listarProductos();

            double valorStockIncrementado = gestor.calcularValorTotal();
            System.out.println("Valor total del stock después de las altas: " + valorStockIncrementado);

            double valorVentas = gestor.procesarVentas("UT3_PD4/src/ventas.txt");
            System.out.println("Valor total vendido: " + valorVentas);


            System.out.println("Productos después de las ventas:");
            gestor.listarProductos();

        } catch (IOException e) {
            System.err.println("Error al procesar los archivos: " + e.getMessage());
        }
    }
}
