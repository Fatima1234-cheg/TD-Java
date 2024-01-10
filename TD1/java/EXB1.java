package TD1.java;

import java.util.Scanner;

public class EXB1 {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println(" donnez un entier");
        int N= scan.nextInt();
        int F=1;
        for(int i=2;i<=N;i++)
            F=F*i;
        System.out.println("le factorielle de "+N+" est :"+F);

}}
