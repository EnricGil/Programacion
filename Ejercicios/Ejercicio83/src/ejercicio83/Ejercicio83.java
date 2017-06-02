package ejercicio83;

public class Ejercicio83 {

    public static void main(String[] args) {
        Operaciones o = new Operaciones();
        o.SetnumA();
        o.SetnumB();
        o.SetnumC();
        o.Setecu();
        if(o.Getecu() >= 0)
        {
            o.SetfinA();
            System.out.println("El resutado de la + es: "+o.GetfinA());
            o.SetfinB();
            System.out.println("El resutado de la - es: "+o.GetfinB());
        }
        else
        {
            System.out.println("La raiz es negativa no se puedo resolver por numeros naturales.");
        }
    }
    
}
