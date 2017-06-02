package ejercicio82;

public class Ejercicio82 {
    
    public static void main(String[] args) {
        Operaciones o = new Operaciones();
        o.setDiner();
        o.setOperacion();
        for(int i=0; i<9; i++)
        {
            System.out.println(o.getDatos1()[i]+" - "+o.getDatos()[i]);
        }
        
        
    }
}
