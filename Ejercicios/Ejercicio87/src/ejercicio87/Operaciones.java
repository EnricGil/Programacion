package ejercicio87;

public class Operaciones {
    private int num,ejemplares;
    private String titulo,autor;
    /**
     * Constructor
     * @param titulo
     * @param autor
     * @param ejemplares 
     */
    public Operaciones(String titulo, String autor, int ejemplares){
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplares=ejemplares;
    }
    /**
     * llamo al tittulo
     * @param titulo 
     */
    public void settitulo(String titulo){
        this.titulo=titulo;
    }
    /**
     *  Llamo al autor
     * @param autor 
     */
    public void setautor(String autor){
        this.autor=autor;
    }
    public String getautor(){
        return autor;
    }
    /**
     * Llamo a los ejemplares
     * @param ejemplares 
     */
    public void setejemplares(int ejemplares){
        this.ejemplares=ejemplares;
    }
    public int getejemplares(){
        return ejemplares;
    }
    /**
     * Operacion prestamo
     */
    public void prestamo(){
        ejemplares=ejemplares-1;
    }
    /**
     * Operacion devolucion
     */
    public void devolucion(){
        ejemplares=ejemplares+1;
    }
    /**
     * para el swicht
     * @param num 
     */
    public void setNum(int num){
        this.num=num;

    }
    public int getNum(){
        return num;
    }
}
