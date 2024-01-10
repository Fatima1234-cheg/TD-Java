package TD1.java;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        int i=0;
        Scanner scan = new Scanner(System.in);
        System.out.println(" donne la moyenne");
        int moy=scan.nextInt();
        if(moy>=10&&moy<12) i=1;
        if(moy>=12&&moy<14) i=2;
        if(moy>=14&&moy<16) i=3;
        if(moy>=16) i=4;
        switch(i){
            case 1:System.out.println("la mention est passable");break;
            case 2:System.out.println("la mention est assez bien");break;
            case 3:System.out.println(" la mention est bien");break;
            default:System.out.println("la mention est trés bien");
        }
    }
}