package TD1.java;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" donnez trois nombres ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int delta;
        delta=b*b-4*a*c;
        System.out.println("delata= "+delta);
        if(delta>0){
            int x1=(int)(-b-Math.sqrt(delta))/2*a;
            int x2=(int)(-b+Math.sqrt(delta))/2*a;
            System.out.println(" l'equation admet deux solutions réelles:"+x1+ "et"+x2);
        }
        else if(delta==0){
            int x1=-b/2*a;
            System.out.println("l'équation admet une seule racine :"+x1 );

        }
        else{
            System.out.println("l'équation admet deux racines complexes");
        }
    }
}