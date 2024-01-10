package TD1.java;

import java.util.Scanner;

public class EXB4 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, B,R;
        do {
            System.out.println(" donnez deux entiers");
            N = scan.nextInt();
            B = scan.nextInt();
        } while (N == 0 ||B==0);

        while((R=N%B)!=0){
            N=B;
            B=R;
        }
        System.out.println("le PGCD de ces deux nombres est :"+B);
    }}