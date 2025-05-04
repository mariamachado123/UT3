import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class ControlCorchetes {
    public static boolean controlCorchetes(List<Character> listaDeEntrada) {
        Pila pila = new Pila(listaDeEntrada.size());
        if (listaDeEntrada.isEmpty()) {
            throw new ArithmeticException("El archivo esta vacio");
        } else {
            for (int i = 0; i < listaDeEntrada.size(); i++) {
                Character actual = listaDeEntrada.get(i);

                if (actual == null) {
                    return false;
                }
                if (actual.equals("{")) {
                    if (!pila.mete(actual)) {
                        return false;
                    } else if (actual.equals("}")) {
                        if (pila.saca() == null) {
                            return false;
                        }
                    }
                }

            }
            if (pila.esVacio()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public void insertarArchivo(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                List<Character> listaDeEntrada = new ArrayList<>();
                for (int i = 0; i < linea.length(); i++) {
                    listaDeEntrada.add(linea.charAt(i));
                }
                if (!controlCorchetes(listaDeEntrada)) {
                    System.out.println("Los corchetes no estan balanceados en la linea "+ linea);
                }
                else{
                    if(controlCorchetes(listaDeEntrada)){
                        System.out.println("Los corchetes estan balanceados en la linea " + linea);
                    }
                }
            }

        }catch(IOException e){
            System.out.println("Error al leer el archivo");
        }
    }
}
