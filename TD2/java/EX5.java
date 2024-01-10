package TD2.java;

public class EX5 {
    public static void main(String[] agrs){
        Rectangle R1=new Rectangle(2,6);
        System.out.println(R1.toString());
        R1.CalculPermitre();
        R1.CalculAire();
        System.out.println(R1.toString());
        R1.isCarre();


    }
}

class Rectangle{
    private int longeur;
    private int largeur;
    Rectangle(){}
    Rectangle(int longeur ,int largeur ){
        this.longeur=longeur;
        this.largeur=largeur;
    }
    Rectangle(Rectangle R1){
        this.longeur=R1.longeur;
        this.largeur=R1.largeur;
    }
    public int getLongeur() {
        return longeur;

    }
    public void setLongeur(int longeur){
        this.longeur=longeur;
    }
    public int getlargeur(){
    return largeur;}
    public void setLargeur(int largeur){
        this.largeur=largeur;
    }
    public int CalculPermitre(){
        return 2*(this.getLongeur()*this.getlargeur());

    }
    public int CalculAire(){
        return largeur*longeur;
    }
    public void isCarre(){
        if(this.getLongeur()==this.getlargeur())System.out.println(" Rectangle is carré");
        else System.out.println(" rectangle is autre forme");
    }
    public String toString(){
        return("le rectangle de longeur : "+this.getLongeur()+" et de largeur :"+this.getlargeur()+" de perimétre : "+CalculPermitre()+" et d'aire : "+CalculAire());
    }
}