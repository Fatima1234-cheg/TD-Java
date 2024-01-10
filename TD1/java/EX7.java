package TD1.java;

import java.util.Scanner;

public class EX7 {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        String N;
        do{
        System.out.println("donne un netiers de trois chiffres");
 N=scan.nextLine();
        for(int i=0;i<3;i++) {
            if (N.charAt(i) != 0) {
                System.out.println(N);
                break;}}}
            while (N.length() != 3) ;
        int intValue = Integer.parseInt(N);
            int Q=intValue/100;
            int R=intValue%100;
           int Q1=R/10;
           int R1=R%10;
           System.out.println("Les nombres formés par les chiffres de N sont:"+Q+Q1+R1+","+Q+R1+Q1+ ","+Q1+Q+R1+","+Q1+R1+Q+ ","+R1+Q+Q1+","+R1+Q1+Q);
        }

}
