package extra2;
public class Extra2 {

    public static void main(String[] args) {
        Operaciones o = new Operaciones();
        o.setNum();
        o.setSemanas();
        o.setDias();
        o.setHoras();
        o.setMinutos();
        o.setSegundos();
        if(o.getNum()<0)
        {
            System.out.println("NO PUEDES PONER LOS SEGUNDOS EN NEGATIVO¡¡¡¡¡¡");

        }
        else
        {
            System.out.println(o.getSemanas()+" Semanas");
            System.out.println(o.getDias()+" Dias");
            System.out.println(o.getHoras()+" Horas");
            System.out.println(o.getMinutos()+" Minutos");
            System.out.println(o.getSegundos()+" Segundos");
        }
        
    }
    
}
