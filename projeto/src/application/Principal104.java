package application;

import java.util.Scanner;

public class Principal104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de linhas: ");
        int m = sc.nextInt();
        System.out.println("Quantidade de colunas: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("Valor da posição [%d][%d]: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("%d  ", mat[i][j]);
            }
            System.out.println();
        }

        System.out.println("Número a ser procurado: ");
        int x = sc.nextInt();
        



        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (x == mat[i][j]) {
                    System.out.println("Posição: " + i + ", " + j);
                    if ((j - 1) >= 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if ((j + 1) < mat[i].length) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if ((i - 1) >= 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if ((i + 1) < mat.length) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }

            }
        }
        sc.close();
    }
}
