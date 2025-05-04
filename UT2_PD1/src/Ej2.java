import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej2 {

    public static void main(String[] args) {

        int[] arreglo = {5, 3, 8, 4, 2, 7};
        int contador = 0;

        // Llamada a la función que realiza el algoritmo y cuenta las comparaciones
        Ej2(arreglo, contador);

        System.out.print("Arreglo ordenado: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
        String nombreArchivo = "UT2_PD1/src/numeros.txt";
        leerEntradaArchivo(nombreArchivo);
    }

    public static void Ej2(int[] arreglo, int contador) {
        int N = arreglo.length;

        for (int i = 1; i <= N - 1; i++) {
            for (int j = N - 1; j >= i + 1; j--) {
                contador++;
                if (arreglo[j] < arreglo[j - 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j - 1];
                    arreglo[j - 1] = temp;
                }
            }
        }

        System.out.println("La sentencia 'si' fue invocada " + contador + " veces.");
    }

    public static void leerEntradaArchivo(String rutaArchivo) {
        BufferedReader br = null;
        String[] elementos = new String[101];
        int cont = 0;
        try {
            br = new BufferedReader(new FileReader(rutaArchivo));
            String linea;

            /* Leer las 101 líneas*/
            while ((linea = br.readLine()) != null && cont < 101) {
                linea = linea.trim();
                if (!linea.isEmpty())
                    elementos[cont]=linea;// Eliminar espacios en blanco alrededor de la cadena
                cont++;
            }


            System.out.println("El largo es de " + elementos[0] + "numeros");
            int sumaElem= 0;

            for (int n = 1; n < cont; n++) {
                sumaElem += Integer.parseInt(elementos[n]);
            }
            System.out.println("La suma de la cantidad de elementos es: " + sumaElem + "numeros");
            int resta = 0;
            if (cont>0) {
                resta = elementos[0].length() - elementos[cont - 1].length();
            }
            System.out.println("La diferencia de numeros es " + resta + "numeros");
            System.out.println("El primer elemento del arreglo es" + elementos[0] + "numeros");
            System.out.println("El ultimo elemento del arreglo es  " + elementos[cont-1] + "numeros");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir el número. Asegúrate de que los datos sean válidos.");
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}