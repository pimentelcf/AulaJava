package FolhaSalarial;

import java.util.Scanner;

public class Funcionario {
    // 1. Atributos (O que o funcionário TEM)
    public String nome;
    public int quantidadeDeFilhos;

    // 2. Método de Entrada (A classe pergunta ao usuário)
    public void preencherDados(Scanner leitor) {
        System.out.println("\n--- Cadastro de Funcionário ---");

        System.out.print("Digite o seu nome: ");
        // Usamos nextLine() para aceitar nomes compostos
        this.nome = leitor.nextLine();

        System.out.print("Digite a quantidade de filhos: ");
        this.quantidadeDeFilhos = leitor.nextInt();

        // Dica: Limpar o buffer do teclado após ler um número
        leitor.nextLine();
    }

    // 3. Método de Saída (A classe mostra o que tem dentro dela)
    public void mostrarDados() {
        System.out.println("Funcionário: " + this.nome);
        System.out.println("Dependentes: " + this.quantidadeDeFilhos);
    }
}