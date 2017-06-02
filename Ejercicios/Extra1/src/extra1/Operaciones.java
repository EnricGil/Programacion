package extra1;

import java.util.Scanner;

public class Operaciones {
    /**
    * Variables
    */
    float hipo,cat1,cat2;
        
    /**
    * Set
    */
        
    /**
    * Pido el Cateto A
    */
    public void SetcatA()
    {
        System.out.println("Dame el cateto A");
        Scanner teclado = new Scanner(System.in);
        cat1=teclado.nextFloat();
    }
    /**
    * Pido el Cateto B
    */
    public void SetcatB()
    {
        System.out.println("Dame el cateto B");
        Scanner teclado = new Scanner(System.in);
        cat2=teclado.nextFloat();
    }
    /**
    * Operacion de la Hipotenusa
    */
    public void Sethipo()
    {
        hipo=((float)Math.sqrt((float)Math.pow(cat1,2)+(float)Math.pow(cat2,2)));
    }
    /**
    * Get
    */
    
    /**
     * Cateto A
     */
    public float GetcatA()
    {
        return cat1;
    }
    /**
     * Cateto B
     */
    public float GetcatB()
    {
        return cat2;
    }
    /**
     * Hipotenusa
     */
    public float Gethipo()
    {
        return hipo;
    }
}
