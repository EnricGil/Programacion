package ejercicio.pkg89;

import java.util.Scanner;

/**
 *
 * @author Enric
 */
public class Menu {
    /**
     * Declaro las variables
     */
    private char opciones;
    private Scanner read= new Scanner(System.in);
    
    /**
     * Hago el setter
     */
    public void setMenu(){
        opciones='.';
    }
    /**
     * Hago el setter del menu
     */
    public void setmostrar(){
        System.out.println("Que desea hacer?");
        System.out.println("m= Mostrar fecha actual");
        System.out.println("v= validar fecha");
        System.out.println("s=salir");
    }
    /**
     * Hago el setter de la eleccion
     */
    public void setopcion(){
        this.opciones=read.next().charAt(0);
        System.out.println();
    }
    /**
     * Hago el getter de la eleccion
     * @return opciones
     */
    public char getopcion(){
        return opciones;
    }
}
