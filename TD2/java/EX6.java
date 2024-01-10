package TD2.java;

public class EX6 {
    public static void main(String[]agrs){
        Banque B1=new Banque(2,2345,"M656173");
        System.out.println(B1.toString());
        B1.déposer(2000);
        System.out.println(B1.toString());
        B1.Retirer(100);
        System.out.println(B1.AvoirSolde());
    }
}

class Banque{
    private int Ncompte;
    private float Solde;
    private String Cin;
    Banque(int Ncompte, float solde,String Cin){
        this.Ncompte=Ncompte;
        this.Solde=solde;
        this.Cin=Cin
;    }

    public int getNcompte() {
        return Ncompte;
    }

    public float getSolde() {
        return Solde;
    }

    public String getCin() {
        return Cin;
    }

    public void setNcompte(int ncompte) {
        Ncompte = ncompte;
    }

    public void setSolde(float solde) {
        Solde = solde;
    }

    public void setCin(String cin) {
        Cin = cin;
    }

    public void déposer(float somme){
        Solde+=somme;
    }
    public void Retirer(float somme){
        Solde-=somme;
    }
    public float AvoirSolde(){
        return  Solde;
    }


    @Override
    public String toString() {
        return "Banque{" +
                "Ncompte=" + Ncompte +
                ", Solde=" + Solde +
                ", Cin='" + Cin + '\'' +
                '}';
    }


}