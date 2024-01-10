package TD2.java;

public class EX2 {
    public void main (String[] args) {
        Point p = new Point("AS", 5, 7);
        System.out.println(p.toString());
    }}
        class Point{
         String Nom;
         double Abscisse;
         double Ordonne;
         Point(String Nom,double Abscisse,double Ordonne){
             this.Nom=Nom;
             this.Abscisse=Abscisse;
             this.Ordonne=Ordonne;}
             public String toString(){
                 return "le nom du point est:"+Nom+" et son abscisse est :"+Abscisse+" et son ordonne est ;"+Ordonne;
             }
             public double Nomre(){
             return Math.sqrt(Abscisse*Abscisse+ Ordonne*Ordonne);
             }
         }













