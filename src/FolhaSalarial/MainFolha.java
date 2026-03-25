package FolhaSalarial; // 1. O endereço da pasta

import java.util.Scanner; // 2. O import sempre aqui em cima

public class MainFolha { // 3. Início da classe

    public static void main(String[] args) { // 4. Início do método

        // Criando os objetos necessários
        Scanner leitor = new Scanner(System.in);
        FolhaSalarial minhaFolha = new FolhaSalarial();
        Funcionario func1 = new Funcionario();

        System.out.print("Digite o seu nome: ");
        func1.nome = leitor.nextLine(); // leitor.next() pega uma palavra

        System.out.print("Digite a quantidade de filhos: ");
        func1.quantidadeDeFilhos = leitor.nextInt(); // leitor.nextInt() pega um número inteiro
        // USANDO O MÉTODO:
        func1.mostrarDados();

        System.out.println("--- Sistema de Folha Salarial ---");

        // O usuário entra com os dados
        System.out.print("Digite as horas normais: ");
        double hNormais = leitor.nextDouble();

        System.out.print("Digite as horas extras: ");
        double hExtras = leitor.nextDouble();

        System.out.print("Digite o valor da hora normal: ");
        double vNormal = leitor.nextDouble();

        System.out.print("Digite o valor da hora extra: ");
        double vExtra = leitor.nextDouble();

        // Faz o cálculo usando o objeto que criamos lá em cima
        double resultado = minhaFolha.calcularSalario(hNormais, hExtras, vNormal, vExtra);

        System.out.println("\nCálculo Concluído!");
        System.out.println("O total a pagar é: R$ " + resultado);


        leitor.close();
    }
}
