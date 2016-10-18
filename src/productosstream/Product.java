package productosstream;

/**
 *
 * @author Yasmin
 */
public class Product {
    private String codigo;
    private String descripcion;
    private int prezo;

    public Product() {
        codigo=null;
        descripcion=null;
        prezo=0;
    }
    
    public Product(String codigo, String descripcion, int prezo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.prezo = prezo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrezo() {
        return prezo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }
    
    
}
