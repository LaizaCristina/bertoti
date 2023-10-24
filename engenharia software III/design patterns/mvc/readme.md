## mvc → strategy + observer + composite

 <img align="center" alt="uml-mvc" height="400" width="600" src="https://github.com/LaizaCristina/bertoti/blob/main/engenharia%20software%20III/design%20patterns/mvc/image/uml-mvc.png">


##
### Padrão Strategy:
Neste contexto, o padrão Strategy permite definir estratégias para atualizar o estoque de produtos com base em diferentes métodos. Teremos duas estratégias: uma para adicionar produtos ao estoque e outra para remover produtos do estoque.
```java
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
```
##
### Padrão Observer:
Os observadores serão diferentes departamentos do armazém, como o departamento de embalagem e o departamento de envio. Quando o estoque de um produto muda, esses departamentos precisam ser notificados para tomar ações apropriadas.
```java
class DepartamentoArmazem {
    private String nome;

    public DepartamentoArmazem(String nome) {
        this.nome = nome;
    }

    public void atualizarEstoque(Produto produto, int quantidade) {
        System.out.println(nome + ": Atualizando estoque de " + produto.getNome() + " em " + quantidade + " unidades.");
    }
}
```
##
### Padrão Composite:
Construímos uma estrutura em camadas para representar o armazém como um todo. Isso significa que dividimos o armazém em seções (ou departamentos) e organizamos os produtos dentro dessas seções. É como se estivéssemos criando uma árvore de categorias, onde cada nível representa um nível diferente de organização, desde o armazém como um todo até os produtos individuais. Isso torna a gestão e organização do armazém mais eficiente e fácil de entender.
```java
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
```
##
### código
```java
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
```
### main
```java
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
```
