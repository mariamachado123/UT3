
public class TAlumno {
    int cedula;
    String nombre;
    String apellido;
    public TAlumno(int   cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
    public int getCedula() {
        return cedula;
    }
    public String getNombre() {
        nombre = nombre.toUpperCase();
        return nombre;

    }
    @Override
    public String toString() {
        return "TAlumno{" + "ID=" + cedula + ", nombre='" + nombre + '\'' +  '}';
    }



}
