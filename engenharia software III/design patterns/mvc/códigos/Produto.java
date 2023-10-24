class Produto {
    private String nome;
    private int estoque;

    public Produto(String nome, int estoque) {
        this.nome = nome;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAoEstoque(int quantidade) {
        estoque += quantidade;
    }

    public void removerDoEstoque(int quantidade) {
        if (estoque >= quantidade) {
            estoque -= quantidade;
        }
    }
}