package ej3;


public class TAlumno {
    int cedula;
    String nombre;
    String apellido;
    public TAlumno(int   cedula, String nombre, String apellido) {
        if (String.valueOf(cedula).length() != 4) {
            throw new IllegalArgumentException("La cedula no es correcta");

        }
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public int getCedula() {
        return cedula;
    }
    public String getNombre() {
        nombre = nombre.toUpperCase();
        return nombre;
    }
    public String getApellido() {
        apellido = apellido.toUpperCase();
        return apellido;
    }
    @Override
    public String toString() {
        return "TAlumno{" + "cedula=" + cedula + ", nombre='" + nombre + ", apellido='" + apellido + '}';
    }



}
