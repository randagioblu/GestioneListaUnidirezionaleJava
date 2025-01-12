package eserciziogestionelista;

import java.util.Scanner;

public class Lista {

    Scanner input = new Scanner(System.in);
    private Nodo testa;

    public Lista() {
        testa = null;
    }

    public void inserimentoTesta(int valore) {
        Nodo nuovoNodo = new Nodo(valore);

        if (testa == null) {
            testa = nuovoNodo;
        } else {                  //lista non vuota
            nuovoNodo.setNext(testa);
            testa = nuovoNodo;
        }
    }

    public void inserimentoCoda(int valore) {
        Nodo nuovoNodo = new Nodo(valore);

        if (testa == null) {
            testa = nuovoNodo;
        } else {
            Nodo aux = new Nodo();
            aux = testa;

            while (aux.getNext() != null) {
                aux = aux.getNext();
            }

            aux.setNext(nuovoNodo);
        }
    }

    public String visualizzazione() {
        if (testa == null) {
            return "Lista vuota";
        }

        Nodo aux = new Nodo();

        aux = testa;
        String stringa = String.valueOf(aux.getValore());

        aux = aux.getNext();

        while (aux != null) {
            stringa = stringa + " -> " + String.valueOf(aux.getValore());
            aux = aux.getNext();
        }
        return stringa;
    }
// potrei anche rimuovere conteggiopriv()...

    public int conteggio() {

        int conta = 0;
        Nodo aux = new Nodo();

        aux = testa;

        while (aux != null) {
            conta++;
            aux = aux.getNext();
        }
        return (conta);
    }

    private int conteggiopriv() {
        int conta1 = 0;
        Nodo aux = new Nodo();

        aux = testa;

        while (aux != null) {
            conta1++;
            aux = aux.getNext();
        }
        return (conta1);
    }

    public int somma() {

        Nodo aux = new Nodo();
        aux = testa;

        int somma = 0;
        while (aux != null) {

            somma += aux.getValore();
            aux = aux.getNext();

        }

        return somma;

    }

    public String media() {

        int dim = conteggio();
        float mediatot = 0;

        mediatot = (float) somma() / dim;
        return String.valueOf(mediatot); //per qualche motivo prima non divideva per "dim" adesso mo va

    }

    public boolean occorrenza(int valore) { //spiegoooo: la variabile aux è assegnata con il valore della variabile testa
        Nodo aux = new Nodo();

        aux = testa;

        while (aux != null) { //ciclo while finche la lista non ha valore 
            if (aux.getValore() == valore) {
                return true; // se il valore è uguale alla posizione della lista ritorna true 
            }
            aux = aux.getNext();// e va avanti 
        }

        return false; // se non ci sono valori simili allora è falso 
    }

    public int elementiSottoLaMedia() {
        Nodo aux = new Nodo();
        aux = testa;

        int conta = 0;

        float media = somma() / conteggio();

        while (aux != null) {
            if (aux.getValore() < media) {
                conta++;
            }
            aux = aux.getNext();
        }

        return conta;

    }
}
