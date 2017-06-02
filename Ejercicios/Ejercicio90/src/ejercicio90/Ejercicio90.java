package ejercicio90;

import java.util.Scanner;

public class Ejercicio90 {

    public static void main(String[] args) {
        Operaciones o = new Operaciones();
        Scanner teclado= new Scanner (System.in);

        System.out.println("Dime tu numero del dni");
        o.setDni(teclado.nextInt());
        o.calculo(o.getDni());
    }
    
}
