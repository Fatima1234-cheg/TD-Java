package TD1.java;
import java.util.Scanner;
public class EXT5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int taille, i;
        System.out.println("Donnez la taille de votre tableau");
        taille = scan.nextInt();
        String[] tab = new String[taille];
        scan.nextLine();
        for (i = 0; i < taille; i++) {
            System.out.println("Entrez l'élément " +i+ " du tableau : ");
            tab[i] = scan.nextLine();
        }
        System.out.println("tableau avnat la permution");
        for(i=0;i<taille;i++){
            System.out.print("|"+tab[i]+" |");
        }
        System.out.println();


    }
}