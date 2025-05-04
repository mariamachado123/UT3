import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Pila<T> {
    private LinkedList<T> elementos;
    private int capacidadMaxima;

    public Pila(int capacidadMaxima) {
    this.capacidadMaxima = capacidadMaxima;
    this.elementos=new LinkedList<>();}

    public List<T> getElementos() {
        return elementos;
    }
    public void setElementos(List<T> elementos) {
        this.elementos = new LinkedList<>();

    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    public boolean esVacio() {
        if (elementos.isEmpty() || elementos.getFirst() == null) {
            return true;
        }
        return false;
    }
    public boolean mete(T elemento) {
        if (elementos.size() >= capacidadMaxima) {
            return false;
        }
        elementos.push(elemento);
        return true;
    }
    public T saca() {
        if(esVacio()) {
            return null;
        }
        else{
            return elementos.pop();
        }
    }
}