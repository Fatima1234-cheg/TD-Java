package TD1.java;

import java.util.Scanner;

public class EX1 {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println(" donnez trois nombres ");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();
        int max=a;
        if(b>max) max=b;
        if(c>max) max=c;
        System.out.println("le max de trois nombres est "+max);
    }
}
