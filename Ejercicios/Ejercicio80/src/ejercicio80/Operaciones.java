package ejercicio80;

import java.util.Scanner;

public class Operaciones {
    /**
     * Variables
     */
    private float area,cost;
    
    /**
     * Setters
     */
    
    /**
     * Pido el costado
     */
    public void Setcostado()
    {
        System.out.println("Dime el valor del costado en cm");
        Scanner teclado = new Scanner(System.in);
        cost=teclado.nextFloat();
    }
    /**
     * Comprovacion de que el Nº sea corecto
     */
    public void Setcomprovacion()
    {
        if(cost<=0)
        {
            cost=0;
        }
    }
    /**
     * Operacion area 
     */
    public void setArea()
    {
        area=4*(float)Math.pow(cost,2);
    }
    /**
     * Get 
     */
    /**
     * Resultado Area
     * @return 
     */
    public float Getarea()
    {
        
        return area;
    }
}
