import java.io.*;
import java.util.ArrayList;

public class EstructurasYAlgoritmos {
    ArrayList<String> sucursales;
    int cantidadSucursales;
    public EstructurasYAlgoritmos() {
        this.sucursales = new ArrayList<>();
        this.cantidadSucursales = 0;
    }
    public void agregarSucursal(String nombre) {
        if(!sucursales.contains(nombre)) {
            sucursales.add(nombre);
            cantidadSucursales++;
        }
    }
    public void eliminarSucursal(String nombre) {
        sucursales.remove(nombre);
        cantidadSucursales--;
    }
    public void buscarSucursal(String nombre) {
        if(sucursales.contains(nombre)) {
            System.out.println("SUCURSAL BUSCADA" + nombre);
        }
    }
    public void listarSucursales() {
        System.out.println("SUCURSALES:\n");
        for(String sucursal: sucursales) {
            System.out.println(sucursal);
        }
    }
    public void cantidadSucursales() {
        System.out.println("LA CANTIDAD DE SUCURSALES SON: " + cantidadSucursales);
    }
    public void estaVacia(){
        if(cantidadSucursales==0) {
            System.out.println("La cantidad de sucursales es 0");
        }
        else {
            System.out.println("No esta vacia la cantidad de sucursales");
        }
    }
    public static void escribirArchivo(String nombreCompletoArchivo, String[] listaLineasArchivo) {
        FileWriter fw;
        try {
            fw = new FileWriter("UT3_PD8/src/sucursales.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < listaLineasArchivo.length; i++) {
                String lineaActual = listaLineasArchivo[i];
                bw.write(lineaActual);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo " + "UT3_PD8/src/sucursales.txt");
            e.printStackTrace();
        }
    }

    /**
     * Lee un archivo de texto y devuelve su contenido como un array de strings.
     *
     * @param nombreCompletoArchivo El nombre y ruta del archivo a leer.
     * @return Un array de strings, cada uno de los cuales contiene una línea del archivo.
     * @throws FileNotFoundException Si el archivo no se encuentra en la ruta especificada.
     * @throws IOException Si ocurre un error de entrada/salida al leer el archivo.
     */
    public static String[] leerArchivo(String nombreCompletoArchivo) {
        FileReader fr;
        ArrayList<String> listaLineasArchivo = new ArrayList<String>();
        try {
            fr = new FileReader("UT3_PD8/src/sucursales.txt");
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            while (lineaActual != null) {
                listaLineasArchivo.add(lineaActual);
                lineaActual = br.readLine();
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + "UT3_PD8/src/sucursales.txt");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + "UT3_PD8/src/sucursales.txt");
            e.printStackTrace();
        }

        System.out.println("Archivo leido satisfactoriamente");

        return listaLineasArchivo.toArray(new String[0]);
    }
}




