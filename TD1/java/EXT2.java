package TD1.java;

import java.util.Scanner;

public class EXT2 {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println(" donnez un entier");
        int N= scan.nextInt();
        int[] T=new int [50];
        int Q,R,i=0,j;
        do{
            Q=N/2;
            R=N%2;
            N=Q;
            T[i]=R;
            i++;
        }while(Q!=0);
        System.out.println(i);
        for(i=4;i<1;i--)
            System.out.println(T[i]);


}
}
