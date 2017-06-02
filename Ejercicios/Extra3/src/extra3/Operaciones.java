package extra3;

import java.util.Scanner;

public class Operaciones {
    /**
     * Variables
     */
    private double num,yar,pul,cen;
    
    /**
     * Set
     */
    
    /**
     * Pido los pies
     */
    public void setNum()
    {
        System.out.println("Dame los pies que tengas");
        Scanner teclado = new Scanner(System.in);
        num=teclado.nextDouble();
    }
    /**
     * Operacion Yardas
     */
    public void setYardas()
    {
        yar=num/3;
    }
    /**
     * Operacion Yardas
     */
    public void setPulgadas()
    {
        pul=num*12;
    }
    /**
     * Operacion Yardas
     */
    public void setCentimetros()
    {
        cen=num*30.38;
    }
    /**
     * Get
     */
    
    /**
     * Devulebo Yardas
     * @return 
     */
    public double getYardas()
    {
        return yar;
    }
    
    /**
     * Devulebo Centimetros
     * @return 
     */
    public double getCentimetros()
    {
        return cen;
    }
    
    /**
     * Devulebo Pulgadas
     * @return 
     */
    public double getPulgadas()
    {
        return pul;
    }
    
    /**
     * Devulebo Pies
     * @return 
     */
    public double getPies()
    {
        return num;
    }
}
