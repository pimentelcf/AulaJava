package FolhaSalarial;

import java.util.Scanner;

public class MainFolha {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // conectando objetos
        Funcionario func1 = new Funcionario();
        ContratoTrabalho contrato = new ContratoTrabalho();
        FolhaPagamento folha = new FolhaPagamento();


        // Dados do Funcionário (Nome e Filhos)
        func1.preencherDados(leitor);

        // CONEXÃO DE OBJETOS: Passamos o objeto 'func1' para dentro do 'contrato'.
        // Isso permite que o contrato "saiba" quem é o funcionário dono dele,
        // possibilitando consultar a quantidade de filhos para o bônus mais tarde.
        contrato.lerDadosContrato(leitor, func1);

        // Dados do Mês (Horas trabalhadas)
        System.out.println("\n--- Registro de Horas do Mês ---");
        System.out.print("Digite a quantidade de horas normais: ");
        double hNormais = leitor.nextDouble();

        System.out.print("Digite a quantidade de horas extras: ");
        double hExtras = leitor.nextDouble();

        Holerite meuHolerite = folha.calcularSalario(contrato, hNormais, hExtras);

        meuHolerite.imprimir();

        leitor.close();
    }
}