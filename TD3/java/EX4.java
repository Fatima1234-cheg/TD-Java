package TD3.java;

public class EX4 {
    public static void main(String []main){
        Batiment B1=new Batiment(2345);
        System.out.println(B1.toString());
    }
}

class Batiment{
    private int adresse;
    Batiment(){}
    Batiment(int adresse){
        this.adresse=adresse;
    }

    public int getAdresse() {
        return adresse;
    }

    public void setAdresse(int adresse) {
        this.adresse = adresse;
    }
    public String toString(){
        return (" Batiment se situe en :"+this.adresse);
    }
}
class Maison extends Batiment{
    private int nbChambres;
    Maison(){
        super();
    }
    Maison(int adresse){super(adresse);
        this.nbChambres=nbChambres;}

    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "nbChambres=" + nbChambres +
                '}';
    }
}
class Immeuble extends Batiment{
    private int nbApparts;
    public Immeuble() {
    }

    public Immeuble(int adresse) {
        super(adresse);
        this.nbApparts=nbApparts;

    }

    public int getNbApparts() {
        return nbApparts;
    }

    public void setNbApparts(int nbApparts) {
        this.nbApparts = nbApparts;
    }

    @Override
    public String toString() {
        return "Immeuble{" +
                "nbApparts=" + nbApparts +
                '}';
    }
}