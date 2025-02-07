import java.util.ArrayList;
import java.util.List;

public class LancheController {

    private List<Lanche> lanches = new ArrayList<>();

    public void cadastrarLanche(String nome, int cod, double preco) {
        if (buscarLanche(cod) != null) {
            System.out.println("Código já existe! Escolha outro código.\n");
            return;
        }

        Lanche lanche = new Lanche(nome, cod, preco);
        lanches.add(lanche);
        System.out.println("Lanche cadastrado com sucesso!\n");
    }

    public void listarLanches() {
        if (lanches.isEmpty()) {
            System.out.println("Nenhum lanche cadastrado.\n");
            return;
        }
        System.out.println("===== Lista de Lanches =====");
        for (Lanche l : lanches) {
            System.out.println(l);
        }
        System.out.println();
    }

    public Lanche buscarLanche(int codigo) {
        for (Lanche l : lanches) {
            if (l.getCod() == codigo) {
                return l;
            }
        }
        return null;
    }
}
