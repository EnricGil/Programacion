package ejercicio90;

public class Operaciones {
    public class nif {
    /**
     * Variable
     */
    private int dni;

    /**
     * SEt
     * @param dni este parametro es la del dni que introduciomos
     */
    public void setDni(int dni){
        this.dni=dni;
        }   
    /**
     * get
     * @return dni
     */
    public int getDni(){
        return dni;
    }
    
    
    /**
     * Hago la operacion
     * @param dni este parametro es la del dni
     */
    public void calculo(int dni){
        /**
         * Declaro el if para que arranque el programa al meter un dni valido
         */
        if (dni>99999999)
            System.out.println("tu dni es falso ");
        else
            /**
             * Declaro el switch y le asigno una letra al dni segun el resto
             */
            switch (dni%23){
                case '0':
                    System.out.println("tu letra del dni es T ");
                    break;
                case 1:
                    System.out.println("tu letra del dni es R ");
                    break;
                case 2:
                    System.out.println("tu letra del dni es W ");
                    break;
                case 3:
                    System.out.println("tu letra del dni es A ");
                    break;
                case 4:
                    System.out.println("tu letra del dni es G ");
                    break;
                case 5:
                    System.out.println("tu letra del dni es M ");
                    break;
                case 6:
                    System.out.println("tu letra del dni es Y ");
                    break;
                case 7:
                    System.out.println("tu letra del dni es F ");
                    break;
                case 8:
                    System.out.println("tu letra del dni es P ");
                    break;
                case 9:
                    System.out.println("tu letra del dni es D ");
                    break;
                case 10:
                    System.out.println("tu letra del dni es X ");
                    break;
                case 11:
                    System.out.println("tu letra del dni es B ");
                    break;
                case 12:
                    System.out.println("tu letra del dni es N ");
                    break;
                case 13:
                    System.out.println("tu letra del dni es J ");
                    break;
                case 14:
                    System.out.println("tu letra del dni es Z ");
                    break;
                case 15:
                    System.out.println("tu letra del dni es S ");
                    break;
                case 16:
                    System.out.println("tu letra del dni es Q ");
                    break;
                case 17:
                    System.out.println("tu letra del dni es V ");
                    break;
                case 18:
                    System.out.println("tu letra del dni es H ");
                    break;
                case 19:
                    System.out.println("tu letra del dni es L ");
                    break;
                case 20:
                    System.out.println("tu letra del dni es C ");
                    break;
                case 21:
                    System.out.println("tu letra del dni es K ");
                    break;
                case 22:
                    System.out.println("tu letra del dni es E ");
                    break;
                default:

            }
        }
    }
}

