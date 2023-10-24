import java.util.ArrayList;
import java.util.List;

class Armazem {
    private String nome;
    private List<DepartamentoArmazem> departamentos;
    private List<Produto> produtos;

    public Armazem(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();
        this.produtos = new ArrayList<>();
    }

    public void adicionarDepartamento(DepartamentoArmazem departamento) {
        departamentos.add(departamento);
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void atualizarEstoque(Produto produto, int quantidade, AtualizacaoEstoque atualizacao) {
        atualizacao.atualizarEstoque(produto, quantidade);
        for (DepartamentoArmazem departamento : departamentos) {
            departamento.atualizarEstoque(produto, quantidade);
        }
    }
}