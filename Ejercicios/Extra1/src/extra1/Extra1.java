package extra1;

public class Extra1 {

    public static void main(String[] args) {
        Operaciones o = new Operaciones();
        o.SetcatA();
        o.SetcatB();
        o.Sethipo();
        if(o.GetcatA()>0 && o.GetcatB()>0)
        {
            System.out.println("El resultado de la Hipotenusa es: "+o.Gethipo());
        }
        else
        {
            System.out.println("Algun Nº esta mal introducido.");
        }
    }
    
}
