
package Loja_Scrunchie;
/**
 *
 * @author laiza
 */
public class Especificacao {
    private String nome;
    private String cor;
    private String tecido;
    private float preco;

    public Especificacao(String nome, String cor, String tecido, float preco) {
        this.nome = nome;
        this.cor = cor;
        this.tecido = tecido;
        this.preco = preco;
    }
    
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    
    public String getTecido() {
        return tecido;
    }
    public void setTecido(String tecido) {
        this.tecido = tecido;
    }

    
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    
    public boolean comparar(Especificacao especificacao){
        if(cor.equals(especificacao.cor) && nome.equals(especificacao.nome)&& tecido.equals(especificacao.tecido)) {
            return true;}
        else{
            return false;
        }                        
    }
    
    public void Bespec(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tecido: " + this.tecido);
        System.out.println("Preço: " + this.preco);  
    }
    
}
