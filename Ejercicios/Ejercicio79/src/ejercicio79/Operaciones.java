package ejercicio79;

import java.util.Scanner;

public class Operaciones {
    /**
     * Variables
     */
    private float area,per,alt;
    
    /**
     * Setters
     */
    
    /**
     * Pido el Perimetro
     */
    public void Setperimetro()
    {
        System.out.println("Dime el valor del perimetro en cm");
        Scanner teclado = new Scanner(System.in);
        per=teclado.nextFloat();

    }
    /**
     * Pido la Altura
     */
    public void Setaltura()
    {
        System.out.println("Dime el valor la altura en cm");
        Scanner teclado = new Scanner(System.in);
        alt=teclado.nextFloat();

    }
    /**
     * Comprovacion de que el Nº sea corecto
     */
    public void Setcomprovacion()
    {
        if(per<=0)
        {
            per=0;
        }
    }
    /**
     * Comprovacion de que el Nº sea corecto
     */
    public void Setcomprovacion2()
    {
        if(alt<=0)
        {
            alt=0;
        }
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
        area=per*alt/2;
        return area;
    }
}

