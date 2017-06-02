package ejercicio82;

import java.util.Scanner;

public class Operaciones {
    /**
     * Declaro la Array  las variables
     */
    private int [] A = new int [] {500,200,100,50,20,10,5,2,1};
    private int [] B = new int [9];
    private int num,res;

    /**
     * Pido la cantidad de dinero
     */
    public void setDiner()
    {
        System.out.println("Dime cuanto dinero tienes");
        Scanner teclado = new Scanner(System.in);
        num=teclado.nextInt();
    }
    /**
     * Operacion
     */
    public void setOperacion()
    {
        B[0]=num/A[0];
        res=num%A[0];
        
        for(int i=1; i<9; i++)
        {
            B[i]=res/A[i];
            res=res%A[i];
        }
    }
    /**
     * Devueldo las 2 Array para poder mostrarlas
     * @return 
     */
    public int[] getDatos()
    {
        return B;
    }
    public int[] getDatos1()
    {
        return A;
    }
}
    
          
    



    

