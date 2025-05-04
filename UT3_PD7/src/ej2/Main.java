package ej2;

public class Main {
    public static void main(String[] args) {
        IConjunto<Integer> conjunto1=new Conjunto<>();
        IConjunto<Integer> conjunto2=new Conjunto<>();

        conjunto1.insertar(1);
        conjunto1.insertar(2);
        conjunto1.insertar(3);

        conjunto2.insertar(2);
        conjunto2.insertar(3);
        conjunto2.insertar(4);

        System.out.println("Conjunto 1: ");
        conjunto1.imprimir();
        System.out.println("Conjunto 2: ");
        conjunto2.imprimir();

        IConjunto<Integer> union=conjunto1.union(conjunto2);
        System.out.println("Conjunto 1 union Conjunto 2: ");
        conjunto1.union(conjunto2).imprimir();

        IConjunto<Integer> interseccion=conjunto1.interseccion(conjunto2);
        System.out.println("Conjunto 1 interseccion Conjunto 2: ");
        conjunto1.interseccion(conjunto2).imprimir();

    }
}