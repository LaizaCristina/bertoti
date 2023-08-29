public class Alimento implements Produto {
    private char tamanho;
    private String tecido;
    private String cor;
    private double preco;

    public Scruchie(char tamanho, String tecido, String cor, double preco){
        this.tamanho = tamanho;
        this.tecido = tecido;
        this.cor = cor;
        this.preco = preco;
    }

    public char getTamanho(){
        return this.tamanho;
    }
    public String getTecido(){
        return this.tecido;
    }
    public String getCor(){
        return this.cor;
    }
    public double getPreco(){
        return this.preco;
    }

    public void setTamanho(char tamanho){
        this.tamanho = tamanho;
    }
    public void setTecido(String cor){
        this.tecido = tecido;
    }
    public void setCor(String tamanho){
        this.cor = cor;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    @Override
    public void comprar() {
    System.out.println("Comprando Scrunchie " + this.cor + ". Total: R$" + this.preco);
  }



}