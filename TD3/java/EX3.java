package TD3.java;

public class EX3 {
    public static void main(String[] agrs){
        PointB p1=new PointB(4,5);
        PointB p2=new Cercle(2,3,"A",4);
        p2.affiche();
        Cercle C1=new Cercle(3,4,"A",6);
        C1.affCercle();
        C1.affCoordB();
    }
}

class PointB { public PointB(int x, int y) { this.x = x; this.y = y; }
    public void affCoord() { System.out.println("Coordonnees : " + x + " " + y); }
    public void affiche() { System.out.println("Coordonnees : " + x + " " + y); }
    private int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
class Centre extends PointB{
    private String Nom;
    Centre (int x,int y ,String Nom){
        super(x,y);
        this.Nom=Nom;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }
    public void affNom(){
        System.out.println("le nom est :"+getNom());
    }
    public void affCoordB(){
        System.out.println(" les coordonnes des point sont :"+getX()+" "+getY()+" et son nom est :"+this.Nom);

    }
}
class Cercle extends Centre{
    int rayon;
    Cercle(int x,int y, String Nom,int rayon){
        super(x,y,Nom);
        this.rayon=rayon;
    }
    public void affCercle(){
        System.out.println("les coordonners de cntre de cercle sont :"+getX()+" "+getY()+" et son nom est :"+ getNom()+" et le rayon égale a "+this.rayon);
    }
}