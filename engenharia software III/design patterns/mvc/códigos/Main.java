public class Main {
    public static void main(String[] args) {
        AtualizacaoEstoque atualizacaoAdicionar = new AdicionarAoEstoque();
        AtualizacaoEstoque atualizacaoRemover = new RemoverDoEstoque();

        Produto produto1 = new Produto("Produto A", 100);
        Produto produto2 = new Produto("Produto B", 50);

        DepartamentoArmazem departamentoEmbalagem = new DepartamentoArmazem("Embalagem");
        DepartamentoArmazem departamentoEnvio = new DepartamentoArmazem("Envio");

        Armazem armazem = new Armazem("Meu Armazém");
        armazem.adicionarDepartamento(departamentoEmbalagem);
        armazem.adicionarDepartamento(departamentoEnvio);
        armazem.adicionarProduto(produto1);
        armazem.adicionarProduto(produto2);

        
        armazem.atualizarEstoque(produto1, 20, atualizacaoAdicionar);
        armazem.atualizarEstoque(produto2, 10, atualizacaoRemover);
    }
}