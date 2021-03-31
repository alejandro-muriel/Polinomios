
package javaapplication1;
import java.util.*;

public class JavaApplication1 {

    public static void main(String[] args) {
        int n = 0;
        Polinomio A = new Polinomio();// instancia
        A.setDu(n);
        
        IngresoPoli();
        
    }        
        
    
    public static void IngresoPoli (){
        
     int k=0;
     String sCadena = "-5x^4-3x^3-x+10", s = "";
     char[] aCarateres = sCadena.toCharArray();
     String Vs[] = new String [aCarateres.length];
     
        for (int i = 0; i< aCarateres.length; i++) {
               
            System.out.print("["+aCarateres[i]+"]");
            
            if(aCarateres[i] == '-' || Character.isDigit(aCarateres[i]))
            {    
                s = s+aCarateres[i];                 
            }
            else
            {
                if(aCarateres[i] == 'x' && s.equals(""))
                {
                   Vs[k] = "1"; 
                   k++;
                   Vs[k] ="1";
                 
                }  else
                {
                    if(aCarateres[i] == 'x' && s.equals("-"))
                    {
                       Vs[k] = "-1";
                        s = "";
                        k++;
                    }else{
                        Vs[k] = s;
                        s = "";
                    }
                }
                k++;
            }
            
            if(aCarateres[i] == '^')
            {
               Vs[k] = Character.toString(aCarateres[i+1]);
               k++;
               i++;
            }else {
            
               if((i+1) < aCarateres.length){
                if(aCarateres[i] == 'x' && (aCarateres[i+1] == '-' || aCarateres[i+1] == '+' ) )
                   {
                    Vs[k] = "1";
                   }
               }else{
                    Vs[k] = s;
                    k++;
                    Vs[k] = "0";
                }
            }
        }
        System.out.println("");
           for(int j = 0; j<Vs.length;j++){
               System.out.print("[" +Vs[j] + "]");
           }
    }
   }
    

