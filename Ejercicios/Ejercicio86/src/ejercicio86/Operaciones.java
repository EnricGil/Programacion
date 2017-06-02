package ejercicio86;

import java.util.Scanner;

public class Operaciones {
    /**
     * Variables
     */
    private int contador=0 ,limite,num;
    /**
     * Constructor por defecto
     */
    public Operaciones (){
        contador=1;
    }
    /**
     * Constructor de parametros
     */
    public Operaciones(int contador){
        this.contador=contador;
    }
    /**
     * Contador copia
     * @param c 
     */
   /* public Contador(final Contador c){
        contador=c.contador;
    }*/
    /**
     * Pregunta
     * @param num 
     */
    public void setNum(int num){
        System.out.println("Que quieres hacer?");
        this.num=num;
    }
    public int getNum(){
        return num;
    }
    
    public void setLimite(int limite){
        this.limite=limite;
    }
    public int getLimite(){
        return limite;
    }
    /**
     * Incremento los Nº
     */
    public void incrementar(){
        while(contador<=limite){
            System.out.println(contador);
            contador++;
        }
    }
    /**
     * Decremento los Nº
     */
    public void decrementar(){
        while(limite>0){
            System.out.println(limite);
            limite--;
        }
    }
    
}
