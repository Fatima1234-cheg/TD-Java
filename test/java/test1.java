package test.java;

public class test1 {

        public static void main(String[] agrs) {
            Toto t1 = new Toto();
            Toto t2 = new Toto();
            System.out.println("Toto : " );
        }

    }



class Ouvrage {
    private String Auteur;
    private String Titre;
    private int code;
    private  static  int CompteurOuv=0;
     Ouvrage(){}
     Ouvrage(String Auteur,String Titre,int code){
         this.Auteur=Auteur;
         this.Titre=Titre;
         this.code=code;
         CompteurOuv++;
     }

    public String getAuteur() {
        return Auteur;
    }

    public void setAuteur(String auteur) {
        Auteur = auteur;
    }

    public static int getCompteurOuv() {
        return CompteurOuv;
    }

    public static void setCompteurOuv(int compteurOuv) {
        CompteurOuv = compteurOuv;
    }

    @Override
    public String toString() {
        return "Ouvrage{" +
                "Auteur='" + Auteur + '\'' +
                ", Titre='" + Titre + '\'' +
                ", code=" + code +
                '}';
    }
}
class Toto{
  public static int toto = 0;
    Toto() {
        toto = toto + 1;
    }
   }