package ejercicio84;

import java.util.Scanner;

public class Ejercicio84 {

    public static void main(String[] args) {
        /**
         * Declarar objetos
         */
        Menu m = new Menu();
        Cuenta c1 = new Cuenta("Juan", "Migel", "Martinez", "73401497x", "87468068", "20%");
        Cuenta c2 = new Cuenta("Enric", "Gil", "Gallen", "73321162h", "51789677", "5%");

        Scanner teclado= new Scanner (System.in);

        boolean finalizar=false;

        while(finalizar==false){
            m.setmostrar();
            m.setopcion();
            
            if(m.getopcion()=='s'){
                finalizar=true;
            }
            else if(m.getopcion()!='a' && m.getopcion()!='b'){
                System.out.println("La cuenta que ha puesto es erronia");
                System.out.println();
            }
            else{
                while(m.getopcion2()!='f'){
                    m.setmostrar2();
                    m.setopcion2();

                    switch (m.getopcion2()){
                        case 'i':
                            if(m.getopcion()=='a'){
                                System.out.println("Cuannto dinero deseas ingresar?");
                                c1.setdinero(teclado.nextDouble());
                                c1.saldoingreso(c1.getdinero());
                            }
                            else{
                                System.out.println("Cuanto dinero deseas ingresar?");
                                c2.setdinero(teclado.nextDouble());
                                c2.saldoingreso(c2.getdinero());
                            }
                            break;
                            
                        case 'r':
                            if(m.getopcion()=='a'){
                                System.out.println("Cuanto dinero deseas retirar?");
                                c1.setdinero(teclado.nextDouble());
                                c1.saldoreintegro(c1.getdinero());
                            }
                            else{
                                System.out.println("Cuanto dinero deseas retirar?");
                                c2.setdinero(teclado.nextDouble());
                                c2.saldoreintegro(c2.getdinero());
                            }
                            break;
                            
                        case 't':
                            if(m.getopcion()=='a'){
                                System.out.println("Cuanto dinero deseas transferir?");
                                c1.setdinero(teclado.nextDouble());
                                c1.saldotransferencia(c1.getdinero());
                            }
                            else{
                                System.out.println("Cuanto dinero deseas transferir?");
                                c2.setdinero(teclado.nextDouble());
                                c2.saldotransferencia(c2.getdinero());
                            }
                            break;
                            
                        case 'm':
                            if(m.getopcion()=='a'){
                                System.out.println("Tu saldo es de "+c1.getsaldo());
                            }
                            else{
                                System.out.println("Tu saldo es de "+c2.getsaldo());
                            }
                            break;
                            
                        case 'd':
                            if(m.getopcion()=='a'){
                                System.out.println("Nombre: "+c1.getnombre());
                                System.out.println("Apellido: "+c1.getapellido1());
                                System.out.println("2 apellido: "+c1.getapellido2());
                                System.out.println("Dni: "+c1.getdni());
                                System.out.println("N de cuenta: "+c1.getnumero_cuenta());
                                System.out.println("Tipo de interes: "+c1.gettipo_interes());
                            }
                            else{
                                System.out.println("Nombre: "+c2.getnombre());
                                System.out.println("Apellido: "+c2.getapellido1());
                                System.out.println("2 apellido: "+c2.getapellido2());
                                System.out.println("Dni: "+c2.getdni());
                                System.out.println("N de cuenta: "+c2.getnumero_cuenta());
                                System.out.println("Tipo de inters: "+c2.gettipo_interes());
                            }
                            break;
                    }
                }
                m.reiniciaropcion2();
            }
        }
        
                
        
        
    }
    }
    

