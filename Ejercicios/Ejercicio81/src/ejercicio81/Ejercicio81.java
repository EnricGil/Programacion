package ejercicio81;

public class Ejercicio81 {

    public static void main(String[] args) {
        Opercaciones o = new Opercaciones();//Decalro el Objeto
        //Lamo a las funciones
        o.Setradi();
        o.area();
        o.vol();
        //Comprovacion
        o.Setcomprovacion();
        if(o.GetRadio()==0)
        {
            System.out.println("El radio esta mal introducido.");
        }
        else
        {
            System.out.println("El area es: "+o.Getarea()+" cm");
            System.out.println("El volumen es: "+o.GetVolumen()+" cm^2");
        }
    }
    
}
