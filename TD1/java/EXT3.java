package TD1.java;

import java.util.Scanner;

public class EXT3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N,compteur=0;
        do{
            System.out.println("donnez la taille de votre tableau");
            N=scan.nextInt();}while(N>50);
        double[] tab = new double[N];
        for(int i=0;i<N;i++){
            System.out.println(" donnez un moyenne");
            tab[i]=scan.nextDouble();
        }
        for(int i=0;i<N;i++){
            System.out.print(tab[i]+"|");
        }

    System.out.println("\nchoiir un seuil");
        int seuil=scan.nextInt();
        for(int i=0;i<N;i++){
            if(tab[i]>=seuil) compteur++;}
            System.out.println("le nombre d’étudiants ayant une moyenne supérieure ou égale à un seuil donné "+compteur);


}}