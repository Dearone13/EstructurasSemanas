/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semanas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author RGH-LS23-16
 */
public class Interfaz {

    public static void main(String[] args) {
        int op;
        int opT1;
        int opT2;
        int opT3;
        boolean exist = false;
        boolean exist2 = false;
        boolean exist3 = false;
        int semNum;
        int tiempo;
        int dia;
        int by;
        LS ls = null;
        ArrayList<LS> Sem = new ArrayList<LS>();
        Semanas Semana;
        Node ptr;
        do {
            op = Menu();
            exist2 = false;
            exist3 = false;
            switch (op) {
                case 1:
                    do {
                        String answer2 = JOptionPane.showInputDialog(
                                " MAIN MENU\n"
                                + "1.Agregar Temperatura\n"
                                + "2.Eliminar Temperatura\n"
                                + "3.Mostrar Temperatura \n"
                                + "4.Exit\n");
                        opT1 = Integer.parseInt(answer2);
                        switch (opT1) {
                            case 1:
                                if (exist == false) {
                                    String semNum1 = JOptionPane.showInputDialog("Ingrese numero de semana");
                                    semNum = Integer.parseInt(semNum1);
                                    String Tiempo1 = JOptionPane.showInputDialog("Ingrese posicion del tiempo");
                                    tiempo = Integer.parseInt(Tiempo1);
                                    String dia1 = JOptionPane.showInputDialog("Ingrese posicion del dia");
                                    dia = Integer.parseInt(dia1);
                                    String by1 = JOptionPane.showInputDialog("Ingrese el byte");
                                    by = Integer.parseInt(by1);
                                    Semana = new Semanas(semNum, dia, tiempo, by);
                                    Semana = new Semanas(semNum, dia, tiempo, by);
                                    Semana.imprimirDatos();
                                    ls = new LS(Semana);
                                    ptr = ls.getHead();
                                    Sem.add(ls);
                                    JOptionPane.showMessageDialog(null, "Agrege otra semana desde cola o cabeza ");
                                    exist = true;
                                } else if (exist == true) {
                                    String semNumD = JOptionPane.showInputDialog("¿Que semana en su temperatura quiere agregar?");
                                    int semNumDe = Integer.parseInt(semNumD);
                                    ptr = find(ls.getHead(), semNumDe);
                                    Semana = ptr.getSemana();
                                    String TiempoS = JOptionPane.showInputDialog("Ingrese posicion del tiempo");
                                    tiempo = Integer.parseInt(TiempoS);
                                    String diaS = JOptionPane.showInputDialog("Ingrese posicion del dia");
                                    dia = Integer.parseInt(diaS);
                                    String by1 = JOptionPane.showInputDialog("Ingrese el byte");
                                    by = Integer.parseInt(by1);
                                    Semana.Reasignar(dia, tiempo, by);
                                    Semana.imprimirDatos();
                                    ptr.setSemana(Semana);
                                    Sem.set(0, ls);
                                }

                                break;
                            case 2:
                                String semNumD = JOptionPane.showInputDialog("¿Que semana de temperaturas quiere borrar?");
                                int semNumDe = Integer.parseInt(semNumD);
                                ptr = find(ls.getHead(), semNumDe);
                                Semana = ptr.getSemana();
                                String TiempoS = JOptionPane.showInputDialog("Ingrese posicion del tiempo");
                                tiempo = Integer.parseInt(TiempoS);
                                String diaS = JOptionPane.showInputDialog("Ingrese posicion del dia");
                                dia = Integer.parseInt(diaS);
                                Semana.Eliminar(dia, tiempo);
                                Semana.EliminarDatos();
                                ptr.setSemana(Semana);
                                Sem.set(0, ls);

                                break;
                            case 3:
                                ls = Sem.get(0);
                                ptr = ls.getHead();
                                view(ls.getHead());
                                break;
                            case 4:
                                break;

                        }
                    } while (opT1 != 4);

                    break;
                case 2:
                    do {

                        String answer3 = JOptionPane.showInputDialog(
                                " MAIN MENU\n"
                                + "1.Agregar Temperatura\n"
                                + "2.Eliminar Temperatura\n"
                                + "3.Mostrar Temperatura \n"
                                + "4.Exit\n");
                        opT2 = Integer.parseInt(answer3);
                        switch (opT2) {
                            case 1:
                                if (exist2 == false) {
                                    ls = Sem.get(0);
                                    String semNum2 = JOptionPane.showInputDialog("Ingrese numero de semana");
                                    semNum = Integer.parseInt(semNum2);
                                    String Tiempo2 = JOptionPane.showInputDialog("Ingrese posicion del tiempo");
                                    tiempo = Integer.parseInt(Tiempo2);
                                    String dia2 = JOptionPane.showInputDialog("Ingrese posicion del dia");
                                    dia = Integer.parseInt(dia2);
                                    String by2 = JOptionPane.showInputDialog("Ingrese el byte");
                                    by = Integer.parseInt(by2);
                                    Semana = new Semanas(semNum, dia, tiempo, by);

                                    ls.addEnd(Semana);
                                    ptr = find(ls.getHead(), 2);
                                    Sem.add(ls);
                                    exist2 = true;
                                } else if (exist2 == true) {
                                    String semNumD = JOptionPane.showInputDialog("¿Que semana en su temperatura quiere agregar?");
                                    int semNumDe = Integer.parseInt(semNumD);
                                    ptr = find(ls.getHead(), semNumDe);
                                    Semana = ptr.getSemana();
                                    String TiempoS = JOptionPane.showInputDialog("Ingrese posicion del tiempo");
                                    tiempo = Integer.parseInt(TiempoS);
                                    String diaS = JOptionPane.showInputDialog("Ingrese posicion del dia");
                                    dia = Integer.parseInt(diaS);
                                    String by1 = JOptionPane.showInputDialog("Ingrese el byte");
                                    by = Integer.parseInt(by1);
                                    Semana.Reasignar(dia, tiempo, by);
                                    Semana.imprimirDatos();
                                    ptr.setSemana(Semana);
                                    Sem.set(0, ls);

                                }

                                break;
                            case 2:
                                String semNumD = JOptionPane.showInputDialog("¿Que semana de temperaturas quiere borrar?");
                                int semNumDe = Integer.parseInt(semNumD);
                                ptr = find(ls.getHead(), semNumDe);
                                Semana = ptr.getSemana();
                                String TiempoS = JOptionPane.showInputDialog("Ingrese posicion del tiempo");
                                tiempo = Integer.parseInt(TiempoS);
                                String diaS = JOptionPane.showInputDialog("Ingrese posicion del dia");
                                dia = Integer.parseInt(diaS);
                                Semana.Eliminar(dia, tiempo);
                                Semana.EliminarDatos();
                                ptr.setSemana(Semana);
                                Sem.set(0, ls);
                                break;
                            case 3:
                                ls = Sem.get(0);
                                ptr = ls.getHead();
                                view(ls.getHead());
                                Sem.set(0, ls);
                                break;
                            case 4:
                            //op = Menu();
                        }
                    } while (opT2 != 4);

                    break;
                case 3:
                    System.out.println("Hola");
                    System.out.println(Sem.get(0));
                    do {
                        System.out.println("Hola2");
                        ls = Sem.get(0);
                        String answer4 = JOptionPane.showInputDialog(
                                " MAIN MENU\n"
                                + "1.Agregar Temperatura\n"
                                + "2.Eliminar Temperatura\n"
                                + "3.Mostrar Temperatura \n"
                                + "4.Exit\n");
                        opT3 = Integer.parseInt(answer4);
                        switch (opT3) {
                            case 1:
                                if (exist3 == false) {
                                    String semNum2 = JOptionPane.showInputDialog("Ingrese numero de semana");
                                    semNum = Integer.parseInt(semNum2);
                                    String Tiempo2 = JOptionPane.showInputDialog("Ingrese posicion del tiempo");
                                    tiempo = Integer.parseInt(Tiempo2);
                                    String dia2 = JOptionPane.showInputDialog("Ingrese posicion del dia");
                                    dia = Integer.parseInt(dia2);
                                    String by2 = JOptionPane.showInputDialog("Ingrese el byte");
                                    by = Integer.parseInt(by2);
                                    Semana = new Semanas(semNum, dia, tiempo, by);
                                    ptr = ls.getHead();
                                    ls.insBefore(ptr, Semana);
                                    exist3 = true;
                                } else if (exist3 == true) {
                                    String semNumD = JOptionPane.showInputDialog("¿Que semana en su temperatura quiere agregar?");
                                    int semNumDe = Integer.parseInt(semNumD);
                                    ptr = find(ls.getHead(), semNumDe);
                                    Semana = ptr.getSemana();
                                    String TiempoS = JOptionPane.showInputDialog("Ingrese posicion del tiempo");
                                    tiempo = Integer.parseInt(TiempoS);
                                    String diaS = JOptionPane.showInputDialog("Ingrese posicion del dia");
                                    dia = Integer.parseInt(diaS);
                                    String by1 = JOptionPane.showInputDialog("Ingrese el byte");
                                    by = Integer.parseInt(by1);
                                    Semana.Reasignar(dia, tiempo, by);
                                    Semana.imprimirDatos();
                                    ptr.setSemana(Semana);
                                    Sem.set(0, ls);
                                }

                                break;
                            case 2:
                                String semNumD = JOptionPane.showInputDialog("¿Que semana de temperaturas quiere borrar?");
                                int semNumDe = Integer.parseInt(semNumD);
                                ptr = find(ls.getHead(), semNumDe);
                                Semana = ptr.getSemana();
                                String TiempoS = JOptionPane.showInputDialog("Ingrese posicion del tiempo");
                                tiempo = Integer.parseInt(TiempoS);
                                String diaS = JOptionPane.showInputDialog("Ingrese posicion del dia");
                                dia = Integer.parseInt(diaS);
                                Semana.Eliminar(dia, tiempo);
                                Semana.EliminarDatos();
                                ptr.setSemana(Semana);
                                Sem.set(0, ls);
                                break;
                            case 3:
                                ls = Sem.get(0);
                                ptr = ls.getHead();
                                view(ls.getHead());
                                break;
                            case 4:

                                break;

                        }
                    } while (opT3 != 4);

                    break;
                case 4:
                    System.exit(0);
                    break;

            }

        } while (op != 4);

    }

    public static int Menu() {
        int op;
        String answer = JOptionPane.showInputDialog(
                " MAIN MENU\n"
                + "1.Agregar Semana\n"
                + "2.Agregar desde cola\n"
                + "3.Agregar desde cabeza\n"
                + "4.Exit\n");
        op = Integer.parseInt(answer);
        return op;
    }

    public static void view(Node ptr) {
        Semanas Semana;

        while (ptr != null) {
            Semana = ptr.getSemana();
            System.out.println("El numero de semana es:" + Semana.getSemNum());
            JOptionPane.showMessageDialog(null, Semana.imprimirDatos());

            ptr = ptr.next;

        }
        System.out.println();
    }

    public static Node find(Node head, int semNum) {
        Node ptr = head;

        while (ptr != null && ptr.getSemana().getSemNum() != semNum) {
            ptr = ptr.getNext();
        }

        return ptr;
    }

}
