package ejercicio80;

public class Ejercicio80 {

    public static void main(String[] args) {
        Operaciones o = new Operaciones();
        o.Setcostado();
        o.Setcomprovacion();
        o.setArea();
        if(o.Getarea()==0)
        {
            System.out.println("El costado esta mal introducida.");
        }
        else
        {
            System.out.println("El area es: "+o.Getarea()+" cm^2");
        }
    }
    
}
