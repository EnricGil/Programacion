package ejercicio76;

import java.util.Scanner;

public class Operaciones {
    /**
     * Variables
     */
    private float num1,num2,sum,res,mul,div;
    private int num;
    
    
    /**
     * Set
     */
    
    /**
     * Pido el Nº para elegir la opcion
     */
    public void prgunta()
            {
                Scanner teclado = new Scanner(System.in);
                num=teclado.nextInt();
            }
    /**
     * Pido el 1º Nº
     */
    public void prgunta1()
            {
                Scanner teclado = new Scanner(System.in);
                num1=teclado.nextFloat();
            }
    /**
     * Pido el 2º Nº
     */
    public void prgunta2()
            {
                Scanner teclado = new Scanner(System.in);
                num2=teclado.nextFloat();
            }
    /**
     * Operacion Suma
     */
    public void suma()
    {
        sum=num1+num2;
    }
    /**
     * Operacion resta
     */
    public void resta()
    {
        res=num1-num2;
    }
    /**
     * Operacion multiplicacion
     */
    public void mul()
    {
        mul=num1*num2;
    }
    /**
     * Operacion division
     */
    public void div()
    {
        div=num1/num2;
    }
    
    /**
     * Get
     */
    
    /**
     * Devuelvo Nº 
     * @return 
     */
    public int Getpregunta()
            {
                return num;
            }
    /**
     * Devuelvo la suma
     * @return 
     */
    public float Getsuma()
            {
                return sum;
            }
    /**
     * Devuelvo la resta
     * @return 
     */
    public float Getresta()
            {
                return res;
            }
    /**
     * Devuelvo la multiplicacion
     * @return 
     */
    public float Getmul()
            {
                return mul;
            }
    /**
     * Devuelvo la division
     * @return 
     */
    public float Getdiv()
            {
                return div;
            }
            
}
