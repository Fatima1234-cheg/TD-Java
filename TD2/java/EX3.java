package TD2.java;

public class EX3 {
    public static void main (String[] args){
        Livre livre1=new Livre();
        System.out.println(livre1.toString());





    }}
    class Livre
    {
        private String titre;
        private String Auteur;
        private double prix;
        private int annee;
Livre(){
}
        Livre(String titre ){
           titre=titre;
        }
        Livre(String titre,String Auteur ){
           titre=titre;
            this.Auteur=Auteur;
        }
        Livre(String titre,String Auteur,double prix ){
            this.titre=titre;
            this.Auteur=Auteur;
            this.prix=prix;
        }
        Livre(String titre,String Auteur,double prix ,int annee){
            this.titre=titre;
            this.Auteur=Auteur;
            this.prix=prix;
            this.annee=annee;
        }

      public  String getTitre(){
            return titre;
        }
        public  String getAuteur(){
            return Auteur;
        }
        public double getPrix(){
            return prix;
        }
        public int getAnnee(){
            return annee;
        }
     public void setTitre(String titre){
            this.titre=titre;
        }
        public void setAuteur(String Auteur){
            this.Auteur=Auteur;
        }
        public void setPrix(double prix){
            this.prix =prix;

        }
        public void setAnnee(int annee){
            this.annee=annee;
        }
        public String toString(){
           return ("le titre de livre est:"+getTitre()+ " et son auteur est :"+this.getAuteur()+" prix :"+this.getPrix()+"publié en :"+this.getAnnee());

        }

    }
