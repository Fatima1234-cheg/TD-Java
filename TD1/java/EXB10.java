package TD1.java;
import java.lang.Math;
public class EXB10 {
    public static void main (String[] args){
      int i,Q,R,Q1,R1;
        for(i=100;i<=999;i++){
            Q=i/100;
            R=i%100;
            Q1=R/10;
            R1=R%10;
            if(Math.pow(Q,3)+Math.pow(Q1,3)+Math.pow(R1,3)==i){

                System.out.println(i+" est cubique");
            }
        }






            }
        }



