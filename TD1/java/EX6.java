package TD1.java;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" donnez deux nombres");
        int a=scan.nextInt();
        int b=scan.nextInt();
         if((a>0&&b>0)||(a<0&&b<0)) System.out.println(" le produit ab est positif");
         else if((a<0&&b>0)||(a>0&&b<0)) System.out.println(" le produit ab est négatif");
         else System.out.println("on peut rien dire");


    }
}