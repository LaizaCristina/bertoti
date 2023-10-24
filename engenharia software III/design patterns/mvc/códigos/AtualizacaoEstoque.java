interface AtualizacaoEstoque {
    void atualizarEstoque(Produto produto, int quantidade);
}

class AdicionarAoEstoque implements AtualizacaoEstoque {
    public void atualizarEstoque(Produto produto, int quantidade) {
        produto.adicionarAoEstoque(quantidade);
    }
}

class RemoverDoEstoque implements AtualizacaoEstoque {
    public void atualizarEstoque(Produto produto, int quantidade) {
        produto.removerDoEstoque(quantidade);
    }
}