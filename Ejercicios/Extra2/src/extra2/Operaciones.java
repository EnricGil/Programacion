package extra2;

import java.util.Scanner;

public class Operaciones {
    /**
     * Variables
     */
     private int num,sem,dias,hora,min,se,res;
    
    /**
     * Set
     */
    
    /**
     * Pidonlos segundos del usuario
     */
    public void setNum()
    {
        System.out.println("Dame los segundos que tienes");
        Scanner teclado = new Scanner(System.in);
        num=teclado.nextInt();
    }
    
    /**
     * Paso los segundos a semanas
     */
    public void setSemanas()
    {
        sem=num/604800;
        res=num%604800;
    }
    /**
     * Paso los el resto de las semana a dias
     */
    public void setDias()
    {   
        dias=res/86400;
        res=res%86400;
    }
    /**
     * Paso los el resto de las dias a horas
     */
    public void setHoras()
    {
        hora=(res)/3600;
        res=res%3600;
    }
    /**
     * Paso los el resto de las horas a minutos
     */
    public void setMinutos()
    {
        min=res/60;
        res=res%60;
    }
    /**
     * Paso los el resto de los minutos a segundos
     */
    public void setSegundos()
    {;
        se=res;
    }
    
    /**
     * Gett
     */
    
    /**
     * Devuelvo las Semanas
     */
    public int getSemanas()
    {
    return sem;            
    }
    /**
     * Devuelvo los Dias
     */
    public int getDias()
    {
    return dias;            
    }
    /**
     * Devuelvo las Horas
     */
    public int getHoras()
    {
    return hora;            
    }
    /**
     * Devuelvo los Minutos
     */
    public int getMinutos()
    {
    return min;            
    }
    /**
     * Devuelvo los Segundps
     */
    public int getSegundos()
    {
    return se;            
    }
    /**
     * Le paso el num inicial para hacer comprovaciones
     */
    public int getNum()
    {
        return num;
    }
}
