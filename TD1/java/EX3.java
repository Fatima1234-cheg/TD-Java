package TD1.java;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("donnez deux entiers");
        int a=scan.nextInt();
        int b=scan.nextInt();
        // la somme a+b
        int somme=a+b;
        System.out.println("la somme a+b est "+somme);
        // le produit ab
        int produit=a*b;
        System.out.println(" le produit ab est:"+produit);
        //la parité de somme a+b
        if(somme%2==0)System.out.println(" la somme est paire");
        //la parité de produit ab
        if(produit%2==0) System.out.println(" le produit est pair");
        // la signe de somme a+b
        if(somme>0)System.out.println("la somme est positif");
        else System.out.println("la somme est négatif");
        // la signe de le produit a*b
        if(produit>0) System.out.println("le produit est positif");
        else System.out.println("le produit est négatif");


    }
}