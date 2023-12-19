/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semanas;


public class Semanas {
    private int semNum;

    private int Tem[][] = new int[5][5];
    private int dia;
    private int tiempo;
    private int by;
    private char ans;

    public Semanas(int semNum, int dia, int tiempo, int by) {
        this.semNum = semNum;
        this.dia = dia;
        this.tiempo = tiempo;
        this.by = by;
        this.Tem[this.tiempo][this.dia] = (this.by * 300) / 1023;
    }

   

    public int getSemNum() {
        return semNum;
    }

    public void setSemNum(int semNum) {
        this.semNum = semNum;
    }

    public int[][] getTem() {
        return Tem;
    }

    public void setTem(int[][] Tem) {
        this.Tem = Tem;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getBy() {
        return by;
    }

    public void setBy(int by) {
        this.by = by;
    }


    public void Reasignar(int dia, int tiempo, int by) {
        this.dia = dia;
        this.tiempo = tiempo;
        this.by = by;
        this.Tem[this.tiempo][this.dia] = (this.by * 300) / 1023;
    }
    public void Eliminar(int dia, int tiempo){
        this.dia = dia;
        this.tiempo = tiempo;
         this.Tem[this.tiempo][this.dia] = 0 ;
    }

    public String imprimirDatos() {
//        Scanner sc = new Scanner(System.in);

        //Tem[this.tiempo][this.dia] = (this.by * 300) / 1023;
        //System.out.println(Tem[tiempo][dia] + " C ");
        int diaN[] = new int[5];
//        for (int i = 0; i < diaN.length; i++) {
//            diaN[i] = (i + 1);
//        }
//        for (int i = 0; i < diaN.length; i++) {
//            if (i == 0) {
//                System.out.print("         Dia" + (diaN[i]) + " ");
//            } else {
//                System.out.print("Dia" + (diaN[i]) + " ");
//            }
//
//        }
//        System.out.println("\n");
//
//        for (int i = 0; i < this.Tem.length; i++) {
//
//            for (int j = 0; j < this.Tem.length; j++) {
//                if (j == 0) {
//                    System.out.print("Tiempo " + (j + 1) + "  " + Tem[i][j] + " C  ");
//
//                } else {
//                    System.out.print(Tem[i][j] + " C  ");
//                }
//
//            }
//            System.out.print("\n");
//
//        }
//        int aux;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (Tem[i][j] > Tem[i + 1][j + 1]) {
//                    aux = Tem[i][j];
//                    Tem[i][j] = Tem[i + 1][j + 1];
//                    Tem[i + 1][j + 1] = aux;
//
//                }
//
//            }
//
//        }
        int aux;

        for (int i = 0; i < Tem.length; i++) {
            for (int j = 0; j < Tem.length; j++) {
                for (int x = 0; x < Tem.length; x++) {
                    for (int y = 0; Tem.length< 5; y++) {
                        if (Tem[i][j] > Tem[x][y]) {
                            aux = Tem[i][j];
                            Tem[i][j] = Tem[x][y];
                            Tem[x][y] = aux;
                        }
                    }
                }
            }
        }

        String resultado = "";
        resultado += "            Semana: " + String.valueOf(semNum) + "\n";
        for (int i = 0; i < diaN.length; i++) {
            diaN[i] = (i + 1);
        }
        for (int i = 0; i < diaN.length; i++) {
            if (i == 0) {
                resultado += "                Dia" + (diaN[i]) + " ";
            } else {
                resultado += "Dia" + (diaN[i]) + " ";
            }

        }
        resultado += "\n";
        for (int i = 0; i < this.Tem.length; i++) {

            for (int j = 0; j < this.Tem.length; j++) {
                if (j == 0) {
                    resultado += "Tiempo " + (i + 1) + "  " + Tem[i][j] + " C  ";

                } else {
                    resultado += Tem[i][j] + " C  ";
                }

            }
            resultado += "\n";

        }
        return resultado;
//
//        for (int i = 0; i < this.Tem.length; i++) {
//            for (int j = 0; j < this.Tem.length; j++) {
//                resultado += this.Tem[i][j];
//                resultado += "    ";
//
//            }
//            resultado += "\n";
//        }
//        return resultado;

    }

    public String EliminarDatos() {

     
            Tem[this.tiempo][this.dia] = 0;
            int diaN[] = new int[5];
//            for (int i = 0; i < diaN.length; i++) {
//                diaN[i] = (i + 1);
//            }
//            for (int i = 0; i < diaN.length; i++) {
//                if (i == 0) {
//                    System.out.print("         Dia" + (diaN[i]) + " ");
//                } else {
//                    System.out.print("Dia" + (diaN[i]) + " ");
//                }
//
//            }
//            System.out.println("\n");
//            for (int i = 0; i < Tem.length; i++) {
//
//                for (int j = 0; j < Tem.length; j++) {
//                    if (j == 0) {
//                        System.out.print("Tiempo " + (i + 1) + "  " + Tem[i][j] + " C  ");
//
//                    } else {
//                        System.out.print(Tem[i][j] + " C  ");
//                    }
//
//                }
//                System.out.print("\n");
//
//            }
//            System.out.println("Quiere eliminar otra temperatuta");
//            ans = sc.next().charAt(0);
                int aux;

        for (int i = 0; i < Tem.length; i++) {
            for (int j = 0; j < Tem.length; j++) {
                for (int x = 0; x < Tem.length; x++) {
                    for (int y = 0; Tem.length< 5; y++) {
                        if (Tem[i][j] > Tem[x][y]) {
                            aux = Tem[i][j];
                            Tem[i][j] = Tem[x][y];
                            Tem[x][y] = aux;
                        }
                    }
                }
            }
        }

        String resultado = "";
        resultado += "            Semana: " + String.valueOf(semNum) + "\n";
        for (int i = 0; i < diaN.length; i++) {
            diaN[i] = (i + 1);
        }
        for (int i = 0; i < diaN.length; i++) {
            if (i == 0) {
                resultado += "                Dia" + (diaN[i]) + " ";
            } else {
                resultado += "Dia" + (diaN[i]) + " ";
            }

        }
        resultado += "\n";
        for (int i = 0; i < this.Tem.length; i++) {

            for (int j = 0; j < this.Tem.length; j++) {
                if (j == 0) {
                    resultado += "Tiempo " + (i + 1) + "  " + Tem[i][j] + " C  ";

                } else {
                    resultado += Tem[i][j] + " C  ";
                }

            }
            resultado += "\n";

        }
        return resultado;
    }

   
    
}
