package eserciziogestionelista;

import java.util.Scanner;
import java.util.List;

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

        int dime = conteggio();

        Nodo aux = new Nodo();

        int somma = 0;

        for (int i = 0; i < dime; i++) {

            aux = testa;

            somma += aux.getValore();
            aux = aux.getNext();

        }

        return somma;

    }

    public String media() {

        int dim = conteggio();
        float mediatot = 0;

        mediatot = (float) somma() / dim;
        return String.valueOf(mediatot);

    }

  /*  public boolean occorrenza(int occ) {
        boolean occ2;
        Nodo aux = new Nodo();
        aux = testa;
        System.out.println("inserisci il valore per verificare se è presente nella lista: ");
        occ = Integer.parseInt(input.nextLine());
        if (occ != aux.getValore()) {
            aux = aux.getNext();
            if (occ != aux.getValore()) {
               return  occ2 = false;
            }
        } else {
            return  occ2 = true;
        }
        return occ2;
    }*/
}
