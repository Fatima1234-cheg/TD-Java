package TD1.java;

import java.util.Scanner;

public class EXT4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] Mat = new int[3][3];
        int[][] Mat2 = new int[3][3];
        // saisir les éléments de la premiére  matrice
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Mat[i][j] = scan.nextInt();
            }
        }
        // parcourir les éléments de la matrice1

        System.out.println("Matrice 1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Mat[i][j]+" ");
            }
            System.out.println();
        }
        // saisir les éléments de la deuxiéme  matrice
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Mat2[i][j] = scan.nextInt();
            }
        }
        // parcourir les éléments de la matrice2

        System.out.println("Matrice 2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Mat2[i][j]+" ");


            }
            System.out.println();
        }
        // calcul la somme de deux matrices
        int[][] Matsomme = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Matsomme[i][j]=Mat[i][j]+Mat2[i][j];
            }
            }
        //affichage de la matricesomme
        System.out.println("Matricesomme");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Matsomme[i][j]+ " ");


            }
            System.out.println();
        }


    }
}