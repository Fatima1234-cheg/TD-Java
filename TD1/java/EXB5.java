package TD1.java;

import java.util.Scanner;

public class EXB5 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int N,U0=1,U1=1,UN=1;
        System.out.println("donnez un entier");
        N=scan.nextInt();
        for(int i=2;i<=N;i++){
            UN=U0+U1;
            U0=U1;
            U1=UN;
        }
        System.out.println(UN);

    }
}
