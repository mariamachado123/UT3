package ej1;

import java.util.*;

public class Interseccion {
    ArrayList<Integer> listaA;
    ArrayList<Integer> listaB;
    public ArrayList<Integer> conjunto = new ArrayList<>();
    public Interseccion(ArrayList<Integer> listaA, ArrayList<Integer> listaB) {
        this.listaA = listaA;
        this.listaB = listaB;
        this.conjunto = conjunto;
    }
    public void juntar(){
        if(listaA.size() == listaB.size()){
            for(int i=0; i<listaA.size(); i++){
                for(int j=0; j<listaB.size(); j++){
                    if(listaA.get(i).equals(listaB.get(j))){
                        if (!conjunto.contains(listaA.get(i))){
                            conjunto.add(listaA.get(i));
                        }
                    }
                }
            }
        }
        if(listaB.size() > listaA.size()){
            for(int i=0; i<listaB.size(); i++){
                for(int j=0; j<listaA.size(); j++){
                    if(listaB.get(j).equals(listaA.get(i))){
                        if (!conjunto.contains(listaB.get(j))){
                            conjunto.add(listaB.get(j));
                        }
                    }
                }
            }
        }
        if(listaA.size() > listaB.size()){
            for(int i=0; i<listaA.size(); i++){
                for(int j=0; j<listaB.size(); j++){
                    if(listaA.get(i).equals(listaB.get(j))){
                        if(!conjunto.contains(listaA.get(i))){
                            conjunto.add(listaA.get(i));
                        }
                    }
                }
            }
        }
        ordenar();
        imprimir();
    }
    public void ordenar(){
        Collections.sort(conjunto); //ordena el conjunto
        }

    public void imprimir(){
        System.out.println("Lista de conjunto: " + conjunto);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la lista separadas por comas: ");
        String valor = sc.nextLine();
        ArrayList<Integer> listaA = procesarConjunto(valor);
        System.out.println("Ingrese el valor de la lista 2,  separados por comas: ");
        String valor2 = sc.nextLine();
        ArrayList<Integer> listaB = procesarConjunto(valor2);
        Interseccion interseccion = new Interseccion(listaA, listaB);
        interseccion.juntar();


    }
    protected static ArrayList<Integer> procesarConjunto(String entrada){
        ArrayList<Integer> lista = new ArrayList<>();
        String[] elementos = entrada.split(",");

        for (String num : elementos) {
            lista.add(Integer.parseInt(num.trim())); // Convertir a entero y eliminar espacios
        }
        return lista;
    }
}
