public class Compras implements Produto{
    private List<Produto> produtos;
    private double preco;

    public Compras(){
        this.produtos = new ArrayList<>();
        this.preco = 0.00;
    }

    @Override
    public void comprarProduto(){
        System.out.println("Produtos no carrinho, R$: "+this.preco);
    }

   
    public void addProduto(Produto produto){
        produtos.add(produto);
        this.preco += produto.getPreco();
    }

    public List<Produto> getProdutos(){
        return produtos
    }

     @Override
    public double getPreco(){
        return this.preco;
    }
}