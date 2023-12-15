import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Utilizando Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar os detalhes do herói
        System.out.print("Digite o nome do herói: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do herói: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("   ----MENU----");
        System.out.print("\n | 1 - Mago      | \n | 2 - Guerreiro | \n | 3 - Monge     |\n | 4 - Ninja     |\n\n");
        System.out.print("Selecione o tipo do herói:");
        int tipo = scanner.nextInt();

        // Criando uma instância da classe Heroi com base na entrada do usuário
        Herois heroi = new Herois(nome, idade, tipo);

        // Chamando o método atacar para o herói

        heroi.escolherTipo();
        // Fechar o scanner quando não for mais necessário
        scanner.close();
    }
}
