import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EstructurasYAlgoritmos estructurasYAlgoritmos = new EstructurasYAlgoritmos();
        String[] sucursalesLeidas = estructurasYAlgoritmos.leerArchivo("\"UT3_PD8/src/sucursales.txt");
        for (int i = 0; i < sucursalesLeidas.length; i++) {
            estructurasYAlgoritmos.agregarSucursal(sucursalesLeidas[i]);
        }
        estructurasYAlgoritmos.cantidadSucursales();
        estructurasYAlgoritmos.listarSucursales();
    }
}