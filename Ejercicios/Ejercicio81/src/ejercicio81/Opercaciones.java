package ejercicio81;

import java.util.Scanner;

public class Opercaciones {
    /**
     * Variables
     */
    private float area,vol,radi;
    
    /**
     * Set
     */  
    
    /**
     * Pido la Radio
     */
    public void Setradi()
    {
        System.out.println("Dime el valor la Radio en cm");
        Scanner teclado = new Scanner(System.in);
        radi=teclado.nextFloat();
    }
    /**
     * Comprovacion de que el Nº sea corecto
     */
    public void Setcomprovacion()
    {
        if(radi<=0)
        {
            radi=0;
        }
    }
    /**
     * Operacion area
     */
    public void area()
    {
        area=(float)(4*Math.pow(radi,2)*Math.PI);
    }
    /**
     * operacion volumen
     */
    public void vol()
    {
        vol=(float)((4/3)*Math.pow(radi,3)*Math.PI);
    }
    
    /**
     * Get 
     */
    
    /**
     * devuelvo Radio
     * @return 
     */
    public float GetRadio()
    {
        return radi;
    }
    /**
     * devuelvo Area
     * @return 
     */
    public float Getarea()
    {
        return area;
    }
    /**
     * devuelvo volumen
     * @return 
     */
    public float GetVolumen()
    {
        return vol;
    }
}
