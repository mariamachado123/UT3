package ej1;

import java.util.*;

public class Union {
    ArrayList<Integer> listaA ;
    ArrayList<Integer> listaB ;
    ArrayList<Integer> conjunto = new ArrayList<>();

    public Union(ArrayList<Integer> listaA, ArrayList<Integer> listaB) {
        this.listaA = listaA;
        this.listaB = listaB;
    }
    public void mostrar() {
        conjunto.addAll(listaA);
        conjunto.addAll(listaB);
        ordenar();
        imprimir();
    }
    public void ordenar() {
        HashSet<Integer> set = new HashSet<>(conjunto);
        conjunto.clear();
        conjunto.addAll(set);
        Collections.sort(conjunto);

    }
    public ArrayList<Integer> getConjunto() {
        return conjunto;
    }

    public void imprimir() {
        System.out.println("Lista: " + conjunto);
    }


    protected static ArrayList<Integer> procesarConjunto(String entrada){
        ArrayList<Integer> lista = new ArrayList<>();
        String[] elementos = entrada.split(",");

        for (String num : elementos) {
            lista.add(Integer.parseInt(num.trim()));
        }
        return lista;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la lista separadas por comas: ");
        String valor = sc.nextLine();
        ArrayList<Integer> listaA = procesarConjunto(valor);
        System.out.println("Ingrese el valor de la lista 2,  separados por comas: ");
        String valor2 = sc.nextLine();
        ArrayList<Integer> listaB = procesarConjunto(valor2);
        Union union = new Union(listaA, listaB);
        union.mostrar();
    }
}