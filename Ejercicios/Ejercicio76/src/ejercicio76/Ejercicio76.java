package ejercicio76;

import java.util.Scanner;

public class Ejercicio76 {

    public static void main(String[] args) {
        Operaciones o = new Operaciones();
        Menu m =new Menu();
        m.Menu();
        Scanner teclado = new Scanner(System.in);
        o.prgunta();
        m.Pregunta();
        o.prgunta1();
        m.Pregunta2();
        o.prgunta2();
        
        switch(o.Getpregunta())
                {
            case 1:
                o.suma();
                System.out.println("El Nº el "+o.Getsuma());
            break;
            
            case 2:
                o.resta();
                System.out.println("El Nº el "+o.Getresta());
            break;
            
            case 3:
                o.mul();
                System.out.println("El Nº el "+o.Getmul());;
            break;
            
            case 4:
                o.div();
                System.out.println("El Nº el "+o.Getdiv());
            break;
            
                }
    }
    
}
