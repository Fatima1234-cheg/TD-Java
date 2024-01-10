package TD1.java;

import java.util.Scanner;

public class EXB8 {


    public static void main(String[] args) {
        int i, j;
        Scanner scan = new Scanner(System.in);
        System.out.println(" donnez un entier");
        int N = scan.nextInt();
        for (i = 1; i <= N-1; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=0;i<N;i++)
        {
            for(j=0;j<N-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}