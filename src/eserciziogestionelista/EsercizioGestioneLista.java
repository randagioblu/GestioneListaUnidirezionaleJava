package eserciziogestionelista;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EsercizioGestioneLista {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lista lista = new Lista();
        int scelta;
        System.out.println("Benvenuto sul programma gestione liste");
        System.out.println("Selezionare una delle seguenti opzioni: ");

        do {

            System.out.println("0) Uscita dal programma;\n"+
                    "1) Inserimento di un elemento in testa alla lista;\n"
                    + "2) Inserimento di un elemento in coda alla lista;\n"
                    + "3) Visualizzazione della lista;\n"
                    + "4) Conteggio degli elementi della lista;\n"
                    + "5) Media degli elementi della lista;\n"
                    + "6) Dato un valore verificare se l’elemento è presente all’interno di una lista;\n"
                    + "7) Calcolare il numero di elementi che sono inferiori alla media (riutilizzare i metodi precedenti);\n"
                    + "8) Verificare se nella lista ci sono elementi ripetuti;\n"
                    + "9) Effettuare un inserimento in testa/coda se e solo se l’elemento non è già presente.");
            try {
                scelta = Integer.parseInt(input.nextLine());

            } catch (Exception e) {
                System.out.println("Inserita una parola invece che un numero " + e.getMessage());
                scelta = 10;
            }

            switch (scelta) {

                case 0:
                    System.out.print("Uscita dal programma");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EsercizioGestioneLista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.print(".");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EsercizioGestioneLista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.print(".");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EsercizioGestioneLista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.print(".");
                    System.exit(0);
                    break; //metodo figo per uscire dal programma ᕙ(▀̿ĺ̯▀̿ ̿)ᕗ

                case 1:

                    boolean errore1 = true; //non mi permette di chiamarlo con la stessa variabile
                    //non ho "tempo" per una implementazione con java.lang.Exception
                    //quindi si riccorre con errore, errore1, errore2, errore3 ecc...
                    do {

                        System.out.println("inserire un valore intero alla ''testa'' della lista ");

                        try {

                            lista.inserimentoTesta(Integer.parseInt(input.nextLine()));
                            errore1 = false;

                        } catch (Exception e) {
                            System.out.println("Inserita una parola invece che un numero " + e.getMessage());
                        }

                    } while (errore1 != false);

                    break;

                case 2:
                    boolean errore2 = true; //ecco

                    do {

                        System.out.println("inserire un valore intero nella 'coda' della lista");

                        try {

                            lista.inserimentoCoda(Integer.parseInt(input.nextLine()));
                            errore2 = false;

                        } catch (Exception e) {
                            System.out.println("Inserita una parola invece che un numero " + e.getMessage());
                        }

                    } while (errore2 != false);
                   
                    break;

                case 3:
                    System.out.println("visualizzazione della lista");
                    System.out.println(lista.visualizzazione());
                    break;

                case 4:
                    System.out.println("Dimensione lista: ");
                    System.out.println(lista.conteggio());

                    break;

                case 5:
                    System.out.println("media degli elementi nella lista: ");
                    System.out.println(lista.media());

                    break;

                case 6:
                    System.out.println("occorrenza: ");
                    int ValoreDaTrovare = 0;
                    boolean errore = true; //toh

                    do {

                        System.out.println("inserisci il valore da Cercare nella lista");

                        try {
                            ValoreDaTrovare = Integer.parseInt(input.nextLine());
                            errore = false;
                        } catch (Exception e) {

                            System.out.println("Inserita una parola invece che un numero " + e.getMessage());

                        }

                    } while (errore != false);

                    System.out.println(lista.occorrenza(ValoreDaTrovare));

                    break;

                case 7:
                    System.out.println("elementi sotto la media: ");
                    System.out.println(lista.elementiSottoLaMedia());
                    break;

                case 8:
                    System.out.println("disabilitato");
                    break;

                case 9:
                    System.out.println("disabilitato");
                    break;

                default:
                    System.out.println("errore di inserimento");
                    break;

            }

        } while (scelta != 0);

    }

}
