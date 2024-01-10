package TD3.java;

public class EX5 {
    public static void main(String[] agrs) {
        vehicule V1 = new vehicule(4);
        System.out.println(V1.toString());
        vehicule V2= new Moto(3,5);
        System.out.println(V2.toString());


    }
}
class vehicule{
    private int nbPassager;
    vehicule(int n){
        this.nbPassager=n;
    }

    @Override
    public String toString() {
        return "vehicule{" +
                "nbPassager=" + nbPassager +
                '}';
    }}
   class Moto extends  vehicule{
        private int nbroues=2;
        public Moto(int n, int nbroues) {
            super(n);
            this.nbroues = nbroues;
        }

        @Override
        public String toString() {
            return "Moto{" +
                    "nbroues=" + nbroues +
                    '}';
        }
    }

class Avion extends vehicule{
    private int nbMoteur;

    public Avion(int n, int nbMoteur) {
        super(n);
        this.nbMoteur = nbMoteur;
    }
}
class tripteur extends Moto{
    private int nbMoteur;

    public tripteur(int n, int nbroues, int nbMoteur) {
        super(n, nbroues);
        this.nbMoteur = nbMoteur;
    }
}