// Classe Heroi representando um herói de uma aventura
public class Herois {
    private String nome;
    private int idade;
    private int tipo;

    // Construtor que inicializa as propriedades nome, idade e tipo
    public Herois(String nome2, int idade2, int tipo2) {
        this.nome = nome2;
        this.idade = idade2;
        this.tipo = tipo2;
    }

    public void escolherTipo() {
        // Converte a escolha em uma string correspondente ao tipo do herói
        String Etipo;
        String ataque;

        switch (tipo) {
            case 1:
                Etipo = "mago";
                ataque = "usou magia";
                break;
            case 2:
                Etipo = "guerreiro";
                ataque = "usou espada";
                break;
            case 3:
                Etipo = "monge";
                ataque = "usou artes marciais";
                break;
            case 4:
                Etipo = "ninja";
                ataque = "usou shuriken";
                break;
            default:
                System.out.println("Escolha inválida. Usando tipo indefinido.");
                Etipo = "indefinido";
                ataque = "usou um ataque indefinido";
        }

        // Exibe a mensagem de ataque
        System.out.println("\nO " + Etipo + " " + nome + " atacou usando " + ataque);
    }
}
