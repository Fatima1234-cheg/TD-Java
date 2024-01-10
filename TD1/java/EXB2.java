package TD1.java;

import java.util.Scanner;

public class EXB2 {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println(" donnez un entier");
        int N= scan.nextInt();
        int somme=0;
        for(int i=0;i<N;i++){
            if(i%2!=0)
                somme=somme+i;

        }
        System.out.println("la somme des entiers impairs inférieurs à "+N+" est: "+somme);






}
}
