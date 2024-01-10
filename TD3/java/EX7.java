package TD3.java;

public class EX7 {
    public static void main(String [] agrs){

    }}
 abstract class Employe{
    private String Nom;
    private String Prenom;
    Employe(){};
    Employe(String Nomp,String Prenom){
        this.Nom=Nom;
        this.Prenom=Prenom;
    }

     @Override
     public String toString() {
         return "Employe{" +
                 "Nom='" + Nom + '\'' +
                 ", Prenom='" + Prenom + '\'' +
                 '}';
     }
     abstract double gains();

     public String getNom() {
         return Nom;
     }

     public String getPrenom() {
         return Prenom;
     }

     public void setNom(String nom) {
         Nom = nom;
     }

     public void setPrenom(String prenom) {
         Prenom = prenom;
     }
 }
 class Patron extends Employe{
    private double Salaire;
    Patron(){
        super();
    }

     public Patron(String Nomp, String Prenom, double salaire) {
         super(Nomp, Prenom);
         Salaire = salaire;
     }

     public double getSalaire() {
         return Salaire;
     }

     public void setSalaire(double salaire) {
         Salaire = salaire;
     }

     @Override
     double gains() {
         return Salaire;
     }
 }
 class TravailleurCommission extends Employe{
      private double Commission;
     private int Quantite;
     TravailleurCommission(){
         super();
     }

     public TravailleurCommission(String Nomp, String Prenom, double commission ){
         super(Nomp, Prenom);
         Commission = commission;


     }

     public double getCommission() {
         return Commission;
     }

     public int getQuantite() {
         return Quantite;
     }



     public void setCommission(double commission) {
         Commission = commission;
     }

     public void setQuantite(int quantite) {
         Quantite = quantite;
     }

     @Override
     double gains() {
         return getCommission()*getQuantite();
     }

     @Override
     public String toString() {
         return "TravailleurCommission{" +

                 ", Commission=" + Commission +
                 ", Quantite=" + Quantite +
                 '}';
     }
 }
class TravailleurHoraire extends Employe {

    private int heure;
    private double  Retribution;

    TravailleurHoraire() {
        super();
    }

    public TravailleurHoraire(String Nomp, String Prenom, double retribution) {
        super(Nomp, Prenom);
        Retribution = retribution;

    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public double  getRetribution() {
        return Retribution;
    }

    public void setRetribution(double  retribution) {
        Retribution = retribution;
    }
    double gains() {
        return heure*Retribution;
    }

    @Override
    public String toString() {
        return "TravailleurHoraire{" +
                "heure=" + heure +
                ", Retribution=" + Retribution +
                '}';
    }
}
