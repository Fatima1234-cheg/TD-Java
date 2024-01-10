package TD3.java;

public class EX6 {
    public static void main( String [] agrs){
        Figure f1=new Disque("fati",5,7);
       System.out.println(f1.getAire());
       System.out.println(f1.getNom());
       Figure f2=new Rectangle("A",4,4);
        System.out.println(f2.getAire());
        System.out.println(f2.getNom());

    }
}

abstract class Figure{
    private String Nom;
    Figure(){}

    public Figure(String nom) {
        Nom = nom;
    }

    public  abstract  double  getPeimetre();
    public abstract  double  getAire();

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "Nom='" + Nom + '\'' +
                '}';
    }
}
class Disque extends Figure{
    private int centre;

    private int rayon;
    public Disque (){
        super();
    }
public Disque(int centre,int rayon){
    super();
    this.centre = centre;
    this.rayon=rayon;

}
    public Disque(String nom, int centre,int rayon) {
        super(nom);
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
    public double getAire(){
        return+3.14*rayon*rayon;

    }
    public double getPeimetre(){
        return 2*3.14*rayon;
    }

}
class Rectangle extends Figure{
    private int largeur;

    private int longeur;
    public Rectangle (){
        super();
    }
    public Rectangle(int largeur,int longeur){
        super();
        this.largeur = largeur;
        this.longeur=longeur;

    }
    public Rectangle (String nom, int largeur,int longeur) {
        super(nom);
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
    public double getAire(){
        return largeur*longeur;

    }
    public double getPeimetre(){
        return 2*(largeur+longeur);
    }


}