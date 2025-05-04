//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        String nombreArchivo= "UT3_PD6/src/suc3.txt";
        EstructurasYAlgoritmos estructurasYAlgoritmos=new EstructurasYAlgoritmos();
        try{
            estructurasYAlgoritmos.cargarDesdeSucursales(nombreArchivo);
        }
        catch(IOException e){
            System.out.println("ERROR AL CARGAR LAS SUCURSALES" + e.getMessage());
        }
    }
}
