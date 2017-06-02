package ejercicio77;

import java.util.Scanner;

public class Operaciones {
    /**
     * Variables
     */
    private float radio,area,longitud;
    
    /**
     * Set
     */
    
    /**
     * Pido el radio
     */
    public void setPregunta()
    {
        System.out.println("Dime el valor del radio");
        Scanner teclado = new Scanner(System.in);
        radio=teclado.nextFloat();

    }
    /**
     * Operacion area
     */
    public void area()
    {
        area=(float)(Math.PI*Math.pow(radio,2));
    }
    /**
     * Operacion longitud
     */
    public void longitud()
    {
        longitud=(float)(2*Math.PI*radio);
    }
    
    /**
     * Get
     */
    
    /**
     * Devuelvo arae
     * @return 
     */
    public float Getarea()
    {
        return area;
    }
    /**
     * Devueldo longitud
     * @return 
     */
    public float Getlongitud()
    {
        return longitud;
    }
}
