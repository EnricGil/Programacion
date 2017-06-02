package ejercicio78;

import java.util.Scanner;

public class Operaciones {
    /**
     * Variables 
     */
    private float base, altura;
    private double result;
    
    /**
     * setters
     */

    /**
     * Pido la altura 
     */
    public void setAltura()
    {
        System.out.println("Dime la Altura");
        Scanner teclado = new Scanner(System.in);
        altura=teclado.nextFloat();
    }
    /**
     * Pido la altura 
     */
    public void setBase()
    {
        System.out.println("Dime la Base");
        Scanner teclado1 = new Scanner(System.in);
        base=teclado1.nextFloat();
    }
    /**
     * Operacion 
     */
    public void setOperacion()
    {
        result=base*altura;
    }
    /**
     * Getters
     */
    public double getResultado()
    {
        return result;
    }
}
