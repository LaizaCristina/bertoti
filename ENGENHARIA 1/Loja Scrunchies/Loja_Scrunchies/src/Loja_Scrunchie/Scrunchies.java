package Loja_Scrunchie;
/**
 *
 * @author laiza
 */
public class Scrunchies {
    private String codigo;
    private Especificacao espec;

    public Scrunchies(String codigo, Especificacao espec) {
        this.codigo = codigo;
        this.espec = espec;}
    

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Especificacao getEspec() {
        return espec;
    }
    public void setEspec(Especificacao espec) {
        this.espec = espec;
    }
    
}
