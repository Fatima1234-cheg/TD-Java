package TD1.java;

import java.util.Scanner;

public class EX9 {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println(" donnez deux nombres ");
        int a= scan.nextInt();
        int b= scan.nextInt();

        if(b>a) {int c=a;
        a=b;
        b=c;
        System.out.println(c+" "+a);}
        else System.out.println(a+" "+b);


}}
