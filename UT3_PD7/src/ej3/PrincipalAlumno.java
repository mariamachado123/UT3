package ej3;

public class PrincipalAlumno {
    public static void main(String[] args) {
        TAlumno alumno1 = new TAlumno(1234, "Luca", "Perez");
        TAlumno alumno2 = new TAlumno(4567, "Maria", "Pedro");
        TAlumno alumno3 = new TAlumno(7890, "Jose", "Gomez");
        TAlumno alumno4 = new TAlumno(1122, "Ana", "Martínez");
        TAlumno alumno5 = new TAlumno(3344, "Pedro", "Fernández");

        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
        System.out.println(alumno3.toString());
        System.out.println(alumno4.toString());
        System.out.println(alumno5.toString());

        Conjunto cursoAED1 = new Conjunto();
        Conjunto cursoPF = new Conjunto();

        cursoAED1.insertar(alumno1);
        cursoAED1.insertar(alumno2);

        cursoPF.insertar(alumno2);
        cursoPF.insertar(alumno3);
        cursoPF.insertar(alumno4);
        cursoPF.insertar(alumno5);
        cursoPF.insertar(alumno1);

        System.out.println("Alumnos en el curso 'Algoritmos y Estructuras de Datos I – AED1':");
        cursoAED1.imprimir();
        System.out.println("Alumnos en el curso 'Programación Funcional – PF':");
        cursoPF.imprimir();
        Conjunto union=(Conjunto) cursoAED1.union(cursoPF);
        System.out.println("Alumnos tanto en PF o en AED1:");
        union.imprimir();

        Conjunto interseccion=(Conjunto) cursoAED1.interseccion(union);
        System.out.println("Alumnos tanto en PF y AED1:");
        interseccion.imprimir();

    }
}
