package TD2.java;

public class EX1 {
    public static void main (String[] args) {
        POINT p1=new POINT("A",5);
        System.out.println(p1.toString());
        p1.deplacer(10);
        System.out.println(p1.toString());
        p1.Nom="B";
        System.out.println(p1.toString());
        p1.deplacer(4);
        System.out.println(p1.toString());
    }}
    class POINT{
 String Nom;
 double Abscisse;
    public POINT(String Nom, double Abscisse){
        this.Nom=Nom;
        this.Abscisse=Abscisse;
    }
    public String toString(){
       return "le nom du point est:"+this.Nom+" et son abscisse est :"+this.Abscisse;
    }
    public void deplacer(int dx){
        Abscisse=Abscisse+dx;
    }


    }
