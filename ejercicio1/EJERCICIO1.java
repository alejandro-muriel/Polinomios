/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.*;
/**
 *
 * @author Daniel Salazar
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int n = 0;
    Forma1 F1 = new Forma1(); //instancia  
        
    F1.SetDu(n);
    
    IngresoPoli();
        
     
        
    }//fin main
    
    public static void IngresoPoli()
    {
                Scanner lea=new Scanner(System.in);
        int a=0,b=0,sum=0,n, i=0,d=0;
        String scadena="-5x^4+12x^3-x+10", s="";
        char[] acarateres = scadena.toCharArray();
        String Vs[] = new String[acarateres.length];
        for(int j=0; j<acarateres.length; j++)
        {
            System.out.print("["+j+"]="+acarateres[j]+" " );
            
            if(acarateres[j] == '-'  || Character.isDigit(acarateres[j]))
            {
                s = s + acarateres[j];
            }//fin if 
           
            else 
                {
                    if(acarateres[j] == 'x' && s.equals(""))
                    {
                        Vs[a] = "1";
                        
                    }//fin if
                        else 
                        {
                         if(acarateres[j] == 'x' && s.equals("-"))//equals = s==""
                            {
                               Vs[a] = "-1";
                                s="";
                            }
                        
                        else
                        {
                            Vs[a] = s;
                            s="";
                        }
                        }
                    a++;
                }//fin else
            if(acarateres[j] == '^')
            {
                Vs[a] = Character.toString(acarateres[j+1]);//cambiar a string
                a++;
                j++;
                
            }//fin if ^
            
        }//fin for
        System.out.println("/n");
        System.out.println("--------------------------------------------");
        for (int j = 0; j < Vs.length; j=j+2)
        {
            
            System.out.print("["+Vs[j]+"]");
        }//fin for imprimir
    }//fin ImgresoPoli
    
}//fin class
