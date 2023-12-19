/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semanas;

/**
 *
 * @author RGH-LS23-16
 */
public class Node {
    private Semanas Semana;
    public Node next;
    
    public Node(Semanas Semana){
        this.Semana = Semana;
        this.next = null;
    }

    public Semanas getSemana() {
        return Semana;
    }

    public void setSemana(Semanas Semana) {
        this.Semana = Semana;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
