package TD3.java;

public class EX2 {
    public static void main( String[]agrs){
        PointNom p1=new PointNom(5,7,"A");
       p1.affCoor();

    }
}

class Point {
  Point(int x, int y)
{ this.x = x; this.y = y; }
    public void deplace(int dx, int dy)
{ x += dx; y += dy; }
    public void affCoord() { System.out.println("Coordonnees : " + this.x + " " + this.y); }
    private int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

   public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class PointNom extends Point{
    private String Nom;
    PointNom (int x,int y,String Nom){
        super(x,y);
        this.Nom=Nom;
    }



    public void affCoor(){
        System.out.println("les coordonées de pointNOM sont "+this.getX()+ " "+this.getY()+" et nom de point est "+this.Nom);
    }
}
