package FolhaSalarial;

import java.util.Scanner;

public class Funcionario {

    public String nome;
    public int quantidadeDeFilhos;

    //  Metodo para descobrir "filhos" das classes
    public boolean possuiFilhos() {
        return this.quantidadeDeFilhos > 0;
    }

    //  metodo de entrada para preencher os dados
    public void preencherDados(Scanner leitor) {
        System.out.println("\n--- Cadastro de Funcionário ---");

        System.out.print("Digite o seu nome: ");
        // Usamos nextLine() para aceitar nomes compostos exemplo vitor pimentel sem a main dar erro
        this.nome = leitor.nextLine();

        System.out.print("Digite a quantidade de filhos: ");
        this.quantidadeDeFilhos = leitor.nextInt();

        //  Limpar o buffer do teclado após ler um número
        leitor.nextLine();
    }

    //  Metodo para mostrar a saida da classe
    public void mostrarDados() {
        System.out.println("Funcionário: " + this.nome);
        System.out.println("Dependentes: " + this.quantidadeDeFilhos);
    }
}