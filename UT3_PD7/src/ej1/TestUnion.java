package ej1;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class TestUnion {
    private ej1.Union union;
    @Test
    public void testUnionListasIguales() {
    ArrayList<Integer> listaA = new ArrayList<>(Arrays.asList(1, 2, 3));
    ArrayList<Integer> listaB = new ArrayList<>(Arrays.asList(3, 2, 1));
    union = new ej1.Union(listaA, listaB);
    union.mostrar();

    assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3)), union.getConjunto());
}

    @Test
    public void testUnionListaALarga() {
        ArrayList<Integer> listaA = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> listaB = new ArrayList<>(Arrays.asList(3, 2, 1));
        union = new ej1.Union(listaA, listaB);
        union.mostrar();
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), union.getConjunto());
    }


    @Test
    public void testUnionConDuplicados() {
        ArrayList<Integer> listaA = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
        ArrayList<Integer> listaB = new ArrayList<>(Arrays.asList(3, 4, 5));
        union = new ej1.Union(listaA, listaB);
        union.mostrar();
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), union.getConjunto());
    }

    @Test
    public void testUnionListaAVaciaListaB() {
        ArrayList<Integer> listaA = new ArrayList<>();
        ArrayList<Integer> listaB = new ArrayList<>(Arrays.asList(1, 2, 3));
        union = new ej1.Union(listaA, listaB);
        union.mostrar();
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3)), union.getConjunto());
    }

    @Test
    public void testUnionListasVacias() {
        ArrayList<Integer> listaA = new ArrayList<>();
        ArrayList<Integer> listaB = new ArrayList<>();
        union = new ej1.Union(listaA, listaB);
        union.mostrar();
        assertEquals(new ArrayList<>(), union.getConjunto());
    }

}
