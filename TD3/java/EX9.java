package TD3.java;

public class EX9 {
}




interface Employe1{
    String toString();
    double gains();
}
 class Patron1 implements Employe1{
    private String Nom;
    private String prenom;
    private double Salaire;
    Patron1(){}
     Patron1(String Nom,String prenom,double Salaire){
        this.Nom=Nom;
        this.prenom=prenom;
        this.Salaire=Salaire;
     }

     public String getNom() {
         return Nom;
     }

     public void setNom(String nom) {
         Nom = nom;
     }

     public String getPrenom() {
         return prenom;
     }

     public void setPrenom(String prenom) {
         this.prenom = prenom;
     }

     public double getSalaire() {
         return Salaire;
     }

     public void setSalaire(double salaire) {
         Salaire = salaire;
     }

     @Override
     public String toString() {
         return "Patron{" +
                 "Nom='" + Nom + '\'' +
                 ", prenom='" + prenom + '\'' +
                 ", Salaire=" + Salaire +
                 '}';
     }

     public double gains(){
        return Salaire;
     }
 }
 class TravailleurCommission1 implements Employe1{

private double Salaire;
private int Commission;
private int Quantite;
TravailleurCommission1(){

}
     TravailleurCommission1(double Salaire,int Commission,int Quantite){
    this.Salaire=Salaire;
    this.Commission=Commission;
    this.Quantite=Quantite;
     }

     public double getSalaire() {
         return Salaire;
     }

     public void setSalaire(double salaire) {
         Salaire = salaire;
     }

     public int getCommission() {
         return Commission;
     }

     public void setCommission(int commission) {
         Commission = commission;
     }

     public int getQuantite() {
         return Quantite;
     }

     public void setQuantite(int quantite) {
         Quantite = quantite;
     }

     @Override
     public String toString() {
         return "TravailleurCommission1{" +

                 ", Commission=" + Commission +
                 ", Quantite=" + Quantite +
                 '}';
     }

     @Override
     public double gains() {
         return getCommission()*getQuantite();
     }
 }
 class TravailleurHoraire1 implements Employe1{
    private int heures;

    private double retribution;
    private String nom;
    private String prenom;
    TravailleurHoraire1(){

    }
    TravailleurHoraire1(String Nom,String prenom,double retribution){
        this.nom=nom;
        this.prenom=prenom;
        this.retribution=retribution;
    }

     public int getHeures() {
         return heures;
     }

     public void setHeures(int heures) {
         this.heures = heures;
     }

     public double getRetribution() {
         return retribution;
     }

     public void setRetribution(double retribution) {
         this.retribution = retribution;
     }

     public String getNom() {
         return nom;
     }

     public void setNom(String nom) {
         this.nom = nom;
     }

     public String getPrenom() {
         return prenom;
     }

     public void setPrenom(String prenom) {
         this.prenom = prenom;
     }

     @Override
     public String toString() {
         return "TravailleurHoraire1{" +

                 ", retribution=" + retribution +
                 ", nom='" + nom + '\'' +
                 ", prenom='" + prenom + '\'' +
                 '}';
     }

     @Override
     public double gains() {
         return retribution*heures;
     }
 }