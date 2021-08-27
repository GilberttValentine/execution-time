/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempodeejecucion;

import java.util.ArrayList;

/**
 *
 * @author Juan Manuel Villanueva Aristizabal
 *
 */
class villa {

    public static void main(String[] args) {
        System.out.println(imprimirMatriz(llenarMatrizV(9)));

        int[][] matriz = {{4, 8}, {12, 4}};
        System.out.println(imprimirMatriz(cuadradosPerfectos(matriz)));

        String[][] matriz2 = {{"cama", "acma"}, {"oso", "foso"}, {"tela", "late"}};
        System.out.println(comprobarSimilitud(matriz2) + "\n");

        System.out.println(imprimirMatriz(llenarMatrizRombo3(8, 6)));
    }

    public static int[][] llenarMatrizV(int x, int y) {
        int[][] matriz = new int[x][y];
        for (int k = 0; k < x; k++) {
            for (int i = 0, j = y - 1; i < y && i <= k; i++, j--) {
                matriz[k][i] = 1;
                matriz[k][j] = 1;
            }
        }

        return matriz;
    }
    
     public static int[][] llenarMatrizV(int x) {
        int y = (x*2)-1;
        int[][] matriz = new int[x][y];
        for (int k = 0; k < x; k++) {
            for (int i = 0, j=y-1; i<y && i <= k; i++, j--) {
                matriz[k][i]=1;
                matriz[k][j]=1;
            }
        }
        
        return matriz;
    }
    
    public static int[][] cuadradosPerfectos(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                boolean flag = true;
                for (int k = 1; flag; k++) {
                    if (Math.sqrt(matriz[i][j] * k) % 1 == 0) {
                        matriz[i][j] = k;
                        flag = false;
                    }
                }

            }
        }

        return matriz;
    }

    public static ArrayList<Integer> comprobarSimilitud(String[][] matriz) {
        ArrayList<Integer> similares = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0].length() == matriz[i][1].length()) {
                boolean lyricFlag = true, wordFlag = true;
                for (int j = 0; j < matriz[i][0].length() && wordFlag; j++) {
                    for (int k = 0; k < matriz[i][1].length() && lyricFlag; k++) {
                        if (matriz[i][0].substring(j, j + 1).equals(matriz[i][1].substring(k, k + 1))) {
                            lyricFlag = false;
                        }
                    }
                    if (lyricFlag) {
                        wordFlag = false;
                    } else {
                        lyricFlag = true;
                    }
                }
                if (wordFlag) {
                    similares.add(i);
                }
            }

        }
        return similares;
    }

    public static int[][] llenarMatrizRombo(int x, int y) {
        int[][] matriz = new int[x][y];
        for (int k = 0; k < x; k++) {
            for (int i = 0, j = (y - 1); i <= (y / 2) && (k <= x / 2 ? (i <= (y - (k * 2)) / 2) : (i < ((k * 2) - y) / 2)); i++, j--) {
                matriz[k][i] = 1;
                matriz[k][j] = 1;
            }
        }

        return matriz;
    }

    public static int[][] llenarMatrizRombo2(int x, int y) {
        int[][] matriz = new int[x][y];

        int cont = (int) Math.round(y / 2.0);

        for (int i = 0; i < x; i++) {
            for (int j = 0, k = y - 1; j < y && j < cont; j++, k--) {
                matriz[i][j] = 1;
                matriz[i][k] = 1;
            }

            if (i < Math.round(y / 2.0) - 1) {
                cont--;
            } else if (x - i <= Math.round(y / 2.0)) {
                cont++;
            }
        }

        return matriz;
    }

    public static int[][] llenarMatrizRombo3(int x, int y) {
        int[][] matriz = new int[x][y];

        int cont = (int) Math.round(y / 2.0);
        for (int i = 0; i < x; i++) {
            for (int j = 0, k = y - 1; j <= y / 2 && j < cont; j++, k--) {
                matriz[i][j] = 1;
                matriz[i][k] = 1;
            }
            if (i < Math.round(y / 2.0) - 1 && i < Math.round(x / 2.0) - 1) {
                cont--;
            } else if (x - i <= Math.round(y / 2.0)) {
                if (x % 2 == 0 && i > Math.round(x / 2.0) - 1) {
                    cont++;
                } else if (x % 2 != 0 && i >= Math.round(x / 2.0) - 1) {
                    cont++;
                }
            }
        }

        return matriz;
    }

    public static String imprimirMatriz(int[][] matriz) {
        String mString = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                mString += matriz[i][j] + " ";
            }
            mString += "\n";
        }
        return mString;
    }

}
