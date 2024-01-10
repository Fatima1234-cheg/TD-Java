package TD3.java;

public class EX1 {
    public static void main (String [] agrs){
        Point1 p1=new Point1();

PointA p2=new PointA();

        System.out.println(p2.toString());
    }
}





class Point1 {
    private int x;
    private int y ;
    public void Point1(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void déplacer(int dx,int dy){
        x=x+dx;
        y=y+dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
class PointA extends Point1 {

    public String toString(){
        return("le point d'abscisse : "+this.getX()+" et d'ordonné "+this.getY());
    }
}
