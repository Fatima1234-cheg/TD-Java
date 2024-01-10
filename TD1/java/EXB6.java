package TD1.java;

import java.util.DoubleSummaryStatistics;
import java.util.Random;
import java.util.Scanner;

public class EXB6 {
    public static void main (String[] args){
        int A,B,C,SOMME=15;
        for(A=1;A<=9;A++)
            for(B=1;B<=9;B++){
                for(C=1;C<=9;C++){
                    if(A+B+C==SOMME){
                        System.out.println(A+ "+"+B+ "+"+C+"="+SOMME);
                    }
            }
        }




    }
}
