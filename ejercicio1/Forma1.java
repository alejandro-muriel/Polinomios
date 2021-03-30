/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Daniel Salazar
 */
public class Forma1 {
    
    //Atributos
    private int Vp1[];
    private int Du;
    
    //metodos
    
    public Forma1()
    {
        Du = 0;
        Vp1 = new int[15];
    }
    
    public Forma1(int t)
    {
        Du = t;
        Vp1 = new int[t+1];
    }
    
    public int GetDu()
    {
        return Du;
    }
    
    public void SetDu(int Du)
    {
        this.Du = Du;
    }

    //devuelve un solo valor en una pos especifica
    public int getVp1(int pos) {
        return Vp1[pos];
    }

    public void setVp1(int pos, int dato) {
        Vp1[pos] = dato;
    }
    
    // devuelve todo el vector

    public int[] getVp1() {
        return Vp1;
    }

    public void setVp1(int[] Vp1) {
        this.Vp1 = Vp1;
    }
    
    public void CrearPolinomio()
    {
        
    }
    
    
    
}//fin class
