package ejercicio87;

import java.util.Scanner;

public class Ejercicio87 {

    public static void main(String[] args) {
        Menu n = new Menu();
        Operaciones o = new Operaciones("El mio Cid","Anonimo",1);
        Operaciones o2 = new Operaciones("El señor de los aniños","Tolken",35);
        Scanner teclado= new Scanner (System.in);
        
        n.setMenu();
        o.setNum(teclado.nextInt());
        switch (o.getNum()){
            case 1:
                System.out.println(o2.getautor());
                System.out.println(o.getautor());
            break;
                
            case 2:
                o2.prestamo();
                System.out.println(o2.getejemplares());
                o.prestamo();
                System.out.println(o.getejemplares());
            break;
            
            case 3:
                o2.devolucion();
                System.out.println(o2.getejemplares());
                o.devolucion();
                System.out.println(o.getejemplares());
            break;
        }
    }
    
}
