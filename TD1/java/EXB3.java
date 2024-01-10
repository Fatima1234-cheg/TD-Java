package TD1.java;
import java.util.Scanner;
public class EXB3 {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        int compteur=0;
        int max=0,pos=0;
        while(compteur<20){
            System.out.println("entrer successivement 20 nombres");
            int N= scan.nextInt();

            if(N>max){ max=N;
                pos=compteur;}

            compteur++;}
        System.out.println("le max est :"+max+ "son position est: "+pos);












    }










}
