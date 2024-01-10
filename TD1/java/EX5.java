package TD1.java;

import java.util.Scanner;

public class EX5 {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int heure,i=0;
        String lang;
        do{
            System.out.println("donne l'heure");
            heure=scan.nextInt();}
        while(heure<=0||heure>24);

        System.out.println("choisissez la langue");
            lang= scan.nextLine();
        if(lang.equals("f")){

            if(heure>0&&heure<18) i=1;
            else if(heure>=18&&heure<22)i=2;
            else i=3;
            switch(i){
                case 1:System.out.println("Bonjour");
                case 2:System.out.println("Bonsoir");
                case 3:System.out.println("bonne nuit");
            }

        }
        if(lang=="a"){
            if(heure>0&&heure<18) i=1;
            else if(heure>=18&&heure<22)i=2;
            else i=3;
            switch(i){
                case 1:System.out.println("good morning");
                case 2:System.out.println("good evening");
                case 3:System.out.println("good night");
            }

        }

    }
}



