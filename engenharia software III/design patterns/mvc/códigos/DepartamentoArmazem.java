class DepartamentoArmazem {
    private String nome;

    public DepartamentoArmazem(String nome) {
        this.nome = nome;
    }

    public void atualizarEstoque(Produto produto, int quantidade) {
        System.out.println(nome + ": Atualizando estoque de " + produto.getNome() + " em " + quantidade + " unidades.");
    }
}