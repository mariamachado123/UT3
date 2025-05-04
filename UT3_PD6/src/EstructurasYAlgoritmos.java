import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EstructurasYAlgoritmos {
    private static class NodoSucursal {
        String sucursalNombre;
        NodoSucursal siguiente;;

        public NodoSucursal(String nombre) {
            this.sucursalNombre = nombre;
            this.siguiente = null;
        }
    }

    private NodoSucursal cabeza;
    private int cantidadSucursales;

    public EstructurasYAlgoritmos() {
        this.cabeza = null;
        this.cantidadSucursales = 0;
    }

    public void agregarSucursal(String nombre) {
        NodoSucursal nuevo = new NodoSucursal(nombre);
        if (this.cabeza == null) {
            this.cabeza = nuevo;
            this.cantidadSucursales++;
        } else {
            NodoSucursal actual = this.cabeza;
            while (actual.siguiente != null) {
                if (actual.siguiente.sucursalNombre.equals(nombre)) {
                    return;
                }
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        this.cantidadSucursales++;
    }

    public void eliminarSucursal(String nombre) {
        if (this.cabeza == null) {
            return;
        }
        if (cabeza.sucursalNombre.equals(nombre)) {
            cabeza = cabeza.siguiente;
            cantidadSucursales--;
            return;
        }
        NodoSucursal actual = cabeza;
        while (actual.siguiente != null && !actual.siguiente.sucursalNombre.equals(nombre)) {
            actual = actual.siguiente;
        }
        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
            cantidadSucursales--;
        }
    }

    public boolean buscarSucursal(String nombre) {
        NodoSucursal actual = this.cabeza;
        while (actual.siguiente != null) {
            if (actual.sucursalNombre.equals(nombre)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }
    public void imprimirSiguienteSucursal(String nombre) {
        NodoSucursal actual = this.cabeza;
        while (actual != null) {
            if (actual.sucursalNombre.contains(nombre)){
                if(actual.siguiente != null) {
                    System.out.println(" EL SIGUIENTE DE "+ actual.sucursalNombre + "ES " + actual.siguiente.sucursalNombre);
                }else {
                    System.out.println("No se encontro el siguiente");

                }
            }
            actual = actual.siguiente;
        }
    }

    public void listarSucursales() {
        NodoSucursal actual = this.cabeza;
        while (actual != null) {
            System.out.println(actual.sucursalNombre);
            actual = actual.siguiente;
        }
    }

    public void cantidadSucursales() {

        System.out.println("La cantidad de sucursales son " + this.cantidadSucursales);
    }

    public void estaVacia() {
        if (cantidadSucursales == 0) {
            System.out.println("La cantidad de sucursales esta vacia");
        } else {
            System.out.println("La cantidad de sucursales no esta vacia");
        }
    }public void imprimirSiguienteSucursal() {
        NodoSucursal actual = this.cabeza;
        System.out.println("La siguiente sucursal a "+ actual.sucursalNombre+ " es " + actual.siguiente.sucursalNombre);
    }
    public void imprimir(){
        NodoSucursal actual = this.cabeza;
        while (actual != null) {
            System.out.print(actual.sucursalNombre+";_");
            actual = actual.siguiente;
        }
    }

    public void cargarDesdeSucursales(String archivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                agregarSucursal(linea.trim());
            }
            listarSucursales();
            cantidadSucursales();
            imprimir();
            imprimirSiguienteSucursal("Hong Kong");
        }catch (IOException ex) {
        System.out.println(ex.getMessage());}
        }
    }














