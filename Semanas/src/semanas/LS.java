/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semanas;

/**
 *
 * @author RGH-LS23-16
 */
public class LS {
    private Node head;
    
    public LS(){
        head = null;
    }
    public LS(Semanas Semana){
        this.head = new Node(Semana);
        head.setNext(null);
    }
    public void setHead(Node head){
        this.head = head;
    }

    public Node getHead() {
        return head;
    }
    // Functional methods
  public boolean empthy() {
    return head == null;
  }

  public void insBefore(Node ptr, Semanas Semana) {
    Node aux;
    if (head == null) {
      head = new Node(Semana);
    } else if (ptr != null) {
      aux = new Node(ptr.getSemana());
      ptr.setSemana(Semana);
      aux.setNext(ptr.getNext());
      ptr.setNext(aux);
    }
  }
  
  
  public void addEnd(Semanas Semana){
      Node aux = new Node(Semana);
      if(head == null){
          head = aux;
      }else{
          Node curr = head;
          while(curr.next!= null){
              curr = curr.next;
          }
          curr.next = aux;
      }
  }

//  public void insLater(Node ptr, Semanas Semana) {
//    Node aux;
//    if (head == null) {
//      head = new Node(Semana);
//    } else if (ptr != null) {
//      aux = new Node(Semana);
////      aux.setNext(ptr.getNext());
//      ptr.setNext(aux);
//    }
//  }

  public void remove(Node ptr) {
    if (ptr != null && ptr.getNext() != null) {
      Node aux = ptr.getNext();
      ptr.setSemana(aux.getSemana());
      ptr.setNext(aux.getNext());
      aux.setNext(null);
      aux = null;
    }
  }

    
}
