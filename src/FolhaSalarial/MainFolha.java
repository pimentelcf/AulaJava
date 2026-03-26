package FolhaSalarial;
import java.util.Scanner;


public class MainFolha{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // 1. Criar os objetos
        Funcionario func1 = new Funcionario();
        ContratoTrabalho contrato = new ContratoTrabalho();
        FolhaPagamento folha = new FolhaPagamento();
        Holerite recibo = new Holerite();

        // 2. Executar as ações
        func1.preencherDados(leitor); // Nome e filhos

        // Passamos o func1 para o contrato saber de quem ele é
        contrato.lerDadosContrato(leitor, func1); // Valor das horas (R$)

        // Lemos as horas do mês (160h, 10h extras, etc)
        folha.lerDadosPagamento(leitor);

        // 3. O Cálculo (A folha usa os dados do contrato)
        double resultadoFinal = folha.calcularTotal(contrato);

        // 4. Impressão
        recibo.imprimirRecibo(func1, resultadoFinal);

        leitor.close();

        }
    }

