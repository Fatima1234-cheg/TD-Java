package TD1.java;

import java.util.Scanner;

public class EX8 {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("saisir un mois");
        int annee;
        int mois=scan.nextInt();
        if(mois==2){
            do{
                System.out.println("donnez une année entre 1900 et 2100");
                annee=scan.nextInt();
            }while(annee<1900||annee>2100);
            if(annee%4==0) System.out.println("le jour de mois est 29");
            else {
                System.out.println("le jour de mois est 28");
            }
        }
        else if(mois==4||mois==6||mois==8||mois==9&&mois==11)
            System.out.println("le jour de mois est 31");
        else System.out.println("le jour de mois est 31");

}}
