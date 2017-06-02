package ejercicio83;

import java.util.Scanner;

public class Operaciones {
    /**
     * Variables
     */
    float numA,numB,numC,ecu,finA,finB;
    
    /**
     * Set
     */
    /**
     * Pido A
     */
    public void SetnumA()
    {
        System.out.println("Dame el valor de A");
        Scanner teclado = new Scanner(System.in);
        numA=teclado.nextFloat();
    }
    /**
    * Pido B
    */
      public void SetnumB()
    {
        System.out.println("Dame el valor de B");
        Scanner teclado1 = new Scanner(System.in);
        numB=teclado1.nextFloat();
    }
    /**
    * Pido C
    */
        public void SetnumC()
    {
        System.out.println("Dame el valor de C");
        Scanner teclado2 = new Scanner(System.in);
        numC=teclado2.nextFloat();
    }
    /**
     * Operacion de la raiz
     */    
      public void Setecu()
    {
        ecu=numB*numB-(4*numA*numC);
    }
    /**
     * Operacion A
     */ 
    public void SetfinA()
    {
        finA=(((-1)*numB)+ecu)/(2*numA);
    }
    /**
     * Operacion B
     */
    public void SetfinB()
    {
        finB=(((-1)*numB)-ecu)/(2*numA);
    }
    
    /**
     * Get
     */
    
    /**
     * Resultado Raiz
     */
    public float Getecu()
    {
        return ecu;
    }
    /**
     * Resultado A
     */ 
    public float GetfinA()
    {
        return finA;
    }
    /**
     * Resultado B
     */
    public float GetfinB()
    {
        return finB;
    }
}
