package FolhaSalarial;
import java.util.Scanner;

public class FolhaPagamento {
    public double horasNormaisTrabalhadas;
    public double horasExtrasTrabalhadas;

    // Método para ler o que aconteceu no mês
    public void lerDadosPagamento(Scanner leitor) {
        System.out.println("\n--- Registro do Mês ---");
        System.out.print("Digite as horas normais trabalhadas: ");
        this.horasNormaisTrabalhadas = leitor.nextDouble();

        System.out.print("Digite as horas extras trabalhadas Esse Mês: ");
        this.horasExtrasTrabalhadas = leitor.nextDouble();
    }

    // Método que calcula tudo recebendo o ContratoTrabalho
    public double calcularTotal(ContratoTrabalho contrato) {
        double totalNormal = this.horasNormaisTrabalhadas * contrato.valorHoraNormal;
        double totalExtra = this.horasExtrasTrabalhadas * contrato.valorHoraExtra;

        return totalNormal + totalExtra;
    }
}