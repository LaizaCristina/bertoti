package Loja_Scrunchie;
/**
 *
 * @author laiza
 */
public class Teste {

    public static void main(String[] args) {
        Loja scrunchie1 = new Loja();
        Loja scrunchie2= new Loja();
        
        scrunchie1.cadastrarScrunchie(new Scrunchies("01", new Especificacao("Esmary", "verde-escuro","cetim",9.0f)));
        scrunchie2.cadastrarScrunchie(new Scrunchies("02", new Especificacao("Olaf", "branco", "cetim", 9.0f)));
        
        Scrunchies busca = scrunchie1.buscarScrunchiePorCodigo("01");

        busca.getEspec().Bespec();
        
    }
    
}
