public class Lanche {
    private String nome;
    private int cod;
    private double preco;

    public Lanche(String nome, int cod, double preco) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Código: " + cod + " | Nome: " + nome + " | Preço: R$ " + String.format("%.2f", preco);
    }
}
