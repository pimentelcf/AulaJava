public class Foguete {

    private String nome;
    private double combustivelRestante;
    private float cargaMaxima;
    private String status;


    public Foguete(String nome, float carga) {
        this.nome = nome;
        this.cargaMaxima = carga;
        this.combustivelRestante = 0; // Começa vazio
        this.status = "Pronto";
    }

    public void abastecer(double quantidade) {
        // CORREÇÃO: Se a quantidade for menor ou igual a zero, aí sim dá erro
        if (quantidade <= 0) {
            System.out.println("Erro: Quantidade de abastecimento inválida.");
            return;
        }

        this.combustivelRestante += quantidade;

        if (this.combustivelRestante > 100.0) {
            double excesso = this.combustivelRestante - 100.0;
            this.combustivelRestante = 100.0;
            System.out.println("Tanque cheio! Desperdiçamos " + excesso + "% de combustível extra.");
        } else {
            System.out.println("Abastecido! Nível atual: " + this.combustivelRestante + "%");
        }
    }

    public void lancar() {
        if (this.combustivelRestante >= 80) {
            this.status = "Em órbita";
            System.out.println(" " + this.nome + " LANÇADO! Rumo ao espaço.");
        } else {
            System.out.println(" Falha no lançamento! Combustível insuficiente (" + this.combustivelRestante + "%)");
        }
    }

    public void relatorio() {
        System.out.println("\n--- RELATÓRIO DO FOGUETE ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Status: " + this.status);
        System.out.println("Combustível: " + this.combustivelRestante + "%");
        System.out.println("Carga Máxima: " + this.cargaMaxima + " toneladas");
        System.out.println("----------------------------\n");
    }

    public static void main(String[] args) {
        // Criando a instância (o objeto real)
        Foguete meuFoguete = new Foguete("foguete 123", 50.5f);

        meuFoguete.relatorio();
        meuFoguete.abastecer(90); // Agora com o sinal corrigido funciona!
        meuFoguete.lancar();
        meuFoguete.relatorio();
    }
}