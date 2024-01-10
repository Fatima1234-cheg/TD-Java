package TD3.java;

public class EX8 {
    public static void main (String[]agrs){
        Figure1 f1=new Disque1(2,6,"A");
       System.out.println( f1.getAire());

       System.out.println(f1.toString());

       Disque1 D1=new Disque1(4,6,"A");
        System.out.println(D1.toString());


    }
}



interface Figure1{



    double  getPeimetre();
  double  getAire();

  String toString();



}
class Disque1 implements Figure1{
    private int centre;
    private String Nom;

    private int rayon;
    public Disque1(){

    }
    public Disque1 (int centre,int rayon, String Nom){
        this.centre = centre;
        this.rayon=rayon;
        this.Nom=Nom;

    }
    public Disque1 (int centre,int rayon) {
        this.centre = centre;
        this.rayon=rayon;
    }

    public int getCentre() {
        return centre;
    }

    public int getRayon() {
        return rayon;
    }

    public void setCentre(int centre) {
        this.centre = centre;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }


    public String getNom() {
        return Nom;
    }


    public void setNom(String nom) {
        Nom = nom;
    }

    public double getAire(){
        return+3.14*rayon*rayon;

    }
    public double getPeimetre(){
        return 2*3.14*rayon;
    }
    public String toString(){
        return ("le nom de dique est"+getNom()+" de rayon :"+getRayon()+" et de centre:"+getCentre());
    }

}
class Rectangle1 implements Figure1{
    private int largeur;
private String Nom;
    private int longeur;
    public Rectangle1 (){
    }
    public Rectangle1(int largeur,int longeur){
        super();
        this.largeur = largeur;
        this.longeur=longeur;

    }
    public Rectangle1 (String nom, int largeur,int longeur) {
       this.Nom=Nom;
        this.largeur = largeur;
        this.longeur=longeur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getlongeur() {
        return longeur;
    }
    public void setlargeur(int largeur) {
        this.largeur=largeur;
    }

    public void setlongeur(int longeur) {
        this.longeur = longeur;
    }


    public String getNom() {
        return Nom;
    }


    public void setNom(String nom) {
        Nom = nom;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    public double getAire(){
        return largeur*longeur;

    }
    public double getPeimetre(){
        return 2*(largeur+longeur);
    }


    public String toString() {
        return "Rectangle{" +
                "largeur=" + largeur +
                ", Nom='" + Nom + '\'' +
                ", longeur=" + longeur +
                '}';
    }
}