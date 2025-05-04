import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nombreArchivo = "UT3_PD12/src/basico-ing.txt";
        String nombreArchivo2 = "UT3_PD12/src/basico-emp.txt";
        Conjunto basicoIng1 = new Conjunto();
        Conjunto basicoEmp1 = new Conjunto();
        basicoIng1.cargarDesdeBasicoIng(nombreArchivo);
        basicoEmp1.cargarDesdeBasicoEmp(nombreArchivo2);
        System.out.println("CONJUNTO DE BASICO-ING-1: ");
        basicoIng1.imprimir();
        System.out.println("CONJUNTO DE BASICO-EMP-1: ");
        basicoEmp1.imprimir();
        IConjunto<TAlumno> union = basicoEmp1.union(basicoIng1);
        System.out.println("CONJUNTO DE UNION: ");
        union.imprimir();
        IConjunto<TAlumno> intersection = basicoIng1.interseccion(basicoEmp1);
        System.out.println("CONJUNTO DE INTERSECCION: ");
        intersection.imprimir();
    }


}
