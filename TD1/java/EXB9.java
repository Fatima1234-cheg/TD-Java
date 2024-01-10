package TD1.java;

import java.util.Scanner;

public class EXB9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" donnez un entier");
        int N = scan.nextInt();
        int Q,R,Q1,R1,Q2,R2,Q3,R3;
        Q=N/100;
        R=N%100;
        Q1=Q/100;
        R1=Q%100;
        Q2=R1/10;
        R2=R1%10;
        Q3=R/10;
        R3=R%10;


        int somme;
        somme=Q1+R2+Q3+R3+Q2;
        System.out.println(somme);


















}}
