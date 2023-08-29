package Loja_Scrunchie;

import java.util.LinkedList;
import java.util.List;
import Loja_Scrunchie.Especificacao;
/**
 *
 * @author laiza
 */
public class Loja {
     private List<Scrunchies> scrunchies = new LinkedList<Scrunchies>();
    
    public void cadastrarScrunchie(Scrunchies scrunchie){
        scrunchies.add(scrunchie);
    }
    
    public List<Scrunchies> buscarScrunchiePorEspecificacao(Especificacao espec){
        List<Scrunchies> scrunchiesEncontradas = new LinkedList<Scrunchies>();
        for(Scrunchies scrunchie:scrunchies){
            if(scrunchie.getEspec().comparar(espec)){
                scrunchiesEncontradas.add(scrunchie);
            }
        }return scrunchiesEncontradas;
    } 
    
    public Scrunchies buscarScrunchiePorCodigo(String codigo){
        for(Scrunchies scrunchie:scrunchies){
            if(scrunchie.getCodigo().equals(codigo)){
                return scrunchie;
            }
         }
        return null;
    }
    public List<Scrunchies> getScrunchies(){
        return this.scrunchies;
    }
    
}
