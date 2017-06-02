package ejercicio.pkg89;

import java.util.Scanner;

public class Ejercicio89 {

    public static void main(String[] args) {
        /**
         * Declaro los objetos
         */
        Menu m = new Menu();
        Fecha c1 = new Fecha();
        
        /**
         * Entrada por teclado
         */
        Scanner teclado= new Scanner (System.in);
        
        /**
         * Boolean para el menu
         */
        boolean finalizar=false;
        /**
         * bucle del menu para que finalice cuando yo lo pido
         */    
        while(finalizar==false){
            m.setmostrar();
            m.setopcion();
            /**
             * creo condiciones para cada opcion del menu, contemplando si te equivocas al apretar
             */
            if(m.getopcion()=='s'){
                finalizar=true;
            }
            else if(m.getopcion()!='m' && m.getopcion()!='v'){
                System.out.println("La opcionn que pone no es correcta");
                System.out.println();
            }
            else{
                if(m.getopcion()=='m'){
                    c1.fechaactual(c1.getdia(), c1.getmes(), c1.getaño());
                    System.out.println("La fecha actual es:");
                    System.out.println("El "+c1.getdia()+" del "+c1.getmes()+" del "+c1.getaño());
                }
                else{
                    System.out.println("Introduce una fecha");
                    System.out.println(" Que año dia quieres introducir?");
                    c1.setdia(teclado.nextInt());
                    System.out.println("Que mes quieres introducir?");
                    c1.setmes(teclado.nextInt());
                    System.out.println("Que aÃ±o quieres introducir?");
                    c1.setaño(teclado.nextInt());
                    
                    c1.fechavalida(c1.getdia(), c1.getmes(), c1.getaño());
                }
            }
    }
    
}
    }
    

