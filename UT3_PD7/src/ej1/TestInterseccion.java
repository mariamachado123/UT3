package ej1;


import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestInterseccion {
    @Test
    public void testInterseccionIguales() {
        ArrayList<Integer> listaA = new ArrayList<>();
        listaA.add(1);
        listaA.add(2);
        listaA.add(3);

        ArrayList<Integer> listaB = new ArrayList<>();
        listaB.add(2);
        listaB.add(3);
        listaB.add(4);

        ej1.Interseccion interseccion = new ej1.Interseccion(listaA, listaB);
        interseccion.juntar();

        ArrayList<Integer> esperado = new ArrayList<>();
        esperado.add(2);
        esperado.add(3);
        assertEquals(esperado, interseccion.conjunto);
    }
    @Test
    public void testInterseccionSinComunes() {
        ArrayList<Integer> listaA = new ArrayList<>();
        listaA.add(1);
        listaA.add(2);
        listaA.add(3);

        ArrayList<Integer> listaB = new ArrayList<>();
        listaB.add(4);
        listaB.add(5);
        listaB.add(6);

        ej1.Interseccion interseccion = new ej1.Interseccion(listaA, listaB);
        interseccion.juntar();

        ArrayList<Integer> esperado = new ArrayList<>();
        assertEquals(esperado, interseccion.conjunto);
    }
    @Test

    public void testInterseccionConDuplicados() {
        // Casos de prueba cuando hay duplicados
        ArrayList<Integer> listaA = new ArrayList<>();
        listaA.add(1);
        listaA.add(2);
        listaA.add(2);
        listaA.add(3);

        ArrayList<Integer> listaB = new ArrayList<>();
        listaB.add(2);
        listaB.add(2);
        listaB.add(3);
        listaB.add(4);

        ej1.Interseccion interseccion = new ej1.Interseccion(listaA, listaB);
        interseccion.juntar();

        ArrayList<Integer> esperado = new ArrayList<>();
        esperado.add(2);
        esperado.add(3);
        assertEquals(esperado, interseccion.conjunto);
    }
    @Test
    public void testInterseccionListaVacia() {
        ArrayList<Integer> listaA = new ArrayList<>();
        ArrayList<Integer> listaB = new ArrayList<>();
        listaB.add(1);
        listaB.add(2);

        ej1.Interseccion interseccion = new ej1.Interseccion(listaA, listaB);
        interseccion.juntar();

        ArrayList<Integer> esperado = new ArrayList<>();
        assertEquals(esperado, interseccion.conjunto);
    }

}
