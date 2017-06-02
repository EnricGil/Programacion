package ejercicio79;

public class Ejercicio79 {

    public static void main(String[] args) {
        Operaciones o = new Operaciones();
        o.Setaltura();
        o.Setperimetro();
        o.Setcomprovacion();
        o.Setcomprovacion2();
        if(o.Getarea()==0)
        {
            System.out.println("El perimetro o la area estan mal introducidos, vuelva a intentarlo.");
        }
        else
        {
            System.out.println("El area es: "+o.Getarea()+" cm");
        }
    }
    
}
