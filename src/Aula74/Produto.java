package Aula74;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade ){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotalEstoque() {
        return quantidade * preco;
    }
    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }
    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }
    public String toString() {
        String s = nome + ", R$" + String.format("%.2f", preco) + ", "
                + quantidade + " unidades. Total: R$" + String.format("%.2f", valorTotalEstoque());
        return s;
    }
}
