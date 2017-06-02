package extra3;

public class Extra3 {

    public static void main(String[] args) {
        Operaciones o =new Operaciones();
        o.setNum();
        o.setCentimetros();
        o.setPulgadas();
        o.setYardas();
        if(o.getPies()<0)
        {
            System.out.println("No puedes tener Nº en Negativo");
        }
        else
        {
            System.out.println(o.getCentimetros()+" Centimetros");
            System.out.println(o.getYardas()+" Yardas");
            System.out.println(o.getPulgadas()+" Pulgadas");
        }
    }
    
}
