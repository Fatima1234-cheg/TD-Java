package TD2.java;

public class EX4 {
    public static void main(String[]agrs){
        Temps T1=new Temps(20,23,23);
        System.out.println(T1.toString());
        T1.AjouterH(23);
        System.out.println(T1.toString());
        T1.AjouterM(23);
        System.out.println(T1.toString());

    }
}
 class Temps{
    private int heure;
    private int minute;
    private int seconde;
    Temps(){}
     Temps(int heure){
        this.heure=heure;
     }
     Temps(int heure, int minute){
        this.heure=heure;
        this.minute=minute;

     }
     Temps (int heure, int minute, int seconde ){
        this.heure=heure;
        this.minute=minute;
        this.seconde=seconde;
     }
     public int getHeure(){
        return heure;
     }
     public int getMinute(){
        return minute;
     }
     public int getSeconde(){
        return seconde;
     }
     public void setHeure(int heure){
        this.heure=heure;

     }
     public void setMinute(int minute){
        this.minute=minute;
     }
     public void setSeconde(int seconde){
        this.seconde=seconde;
     }
     Temps(Temps t){
        this.heure=t.heure;
        this.minute=t.minute;
        this.seconde=t.seconde;
     }
     public String toString(){
        return ("heure : "+this.getHeure()+" Minute: "+ getMinute()+" Seconde: "+getSeconde());
     }
     public void AjouterH(int h){
      this.heure=this.heure+h;
     }
     public void AjouterM(int m){
        m=m+this.minute;
        AjouterH(m/60);
        this.minute=m%60;
     }
     public void AjouterS(int s){
         s=s+this.seconde;
         AjouterM(s/60);
         this.minute=s%60;
     }
 }
