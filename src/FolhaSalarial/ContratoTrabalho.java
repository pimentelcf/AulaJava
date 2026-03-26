package FolhaSalarial;

import java.util.Scanner;

public class ContratoTrabalho {

    public Funcionario funcionario;
    public double valorHoraNormal;
    public double valorHoraExtra;

    // Método para preencher os dados do contrato
    public void lerDadosContrato(Scanner leitor, Funcionario f) {
        this.funcionario = f; // Conecta o funcionário a este contrato

        System.out.println("\n--- Dados do Contrato ---");
        System.out.print("Digite o valor da hora normal: ");
        this.valorHoraNormal = leitor.nextDouble();

        System.out.print("Digite o valor da hora extra: ");
        this.valorHoraExtra = leitor.nextDouble();
    }
}