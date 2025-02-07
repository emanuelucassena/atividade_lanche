import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LancheController lanchesController = new LancheController();

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar Lanche");
            System.out.println("2 - Listar Lanches");
            System.out.println("3 - Comprar Lanche");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Código do lanche: ");
                    int cod = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha

                    System.out.print("Nome do lanche: ");
                    String nome = scanner.nextLine();

                    System.out.print("Preço do lanche: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();

                    lanchesController.cadastrarLanche(nome, cod, preco);
                    break;

                case 2:
                    lanchesController.listarLanches();
                    break;

                case 3:
                    if (lanchesController.buscarLanche(1) == null) {
                        System.out.println("Nenhum lanche cadastrado para compra.\n");
                        break;
                    }

                    lanchesController.listarLanches();
                    System.out.print("Código do lanche desejado: ");
                    int codCompra = scanner.nextInt();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();

                    Lanche lancheEscolhido = lanchesController.buscarLanche(codCompra);
                    if (lancheEscolhido != null) {
                        double total = lancheEscolhido.getPreco() * quantidade;
                        System.out.printf("Total a pagar: R$ %.2f\n\n", total);
                    } else {
                        System.out.println("Lanche não encontrado.\n");
                    }
                    break;

                case 4:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!\n");
            }
        }
    }
}
