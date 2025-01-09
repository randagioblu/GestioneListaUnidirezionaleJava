/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eserciziogestionelista;



public class Nodo {
    private int valore;
    private Nodo next;
    
    public Nodo() {}
    
    public Nodo(int valore) {
        this.valore = valore;
    }
    
    public void setValore(int valore) {
        this.valore = valore;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public int getValore() {
        return valore;
    }

    public Nodo getNext() {
        return next;
    }
}