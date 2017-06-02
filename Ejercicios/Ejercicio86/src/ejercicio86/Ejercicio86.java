package ejercicio86;

import java.util.Scanner;

public class Ejercicio86 {

    public static void main(String[] args) {
        Operaciones o = new Operaciones ();
        Menu m = new Menu ();
        Scanner teclado= new Scanner (System.in);
        m.setMenu();
        o.setNum(teclado.nextInt());
        while(o.getNum()!=3){
            switch(o.getNum()){
                case 1:
                    System.out.println("¿Hasta que Nº deseas llegar?");
                    o.setLimite(teclado.nextInt());
                    o.incrementar();
                    m.setMenu();
                    o.setNum(teclado.nextInt());
                break;
                case 2:
                    System.out.println("¿Hasta que Nº deseas llegar?");
                    o.setLimite(teclado.nextInt());
                    o.decrementar();
                    m.setMenu();
                    o.setNum(teclado.nextInt());
                break;
                
                case 3:
                    System.out.println("Gracias por el uso.");
                break;
                    
            }
            
        }
    }
    
}
