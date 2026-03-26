package FolhaSalarial;

public class Holerite {
    public void imprimirRecibo(Funcionario f, double valorFinal) {
        System.out.println("\n===============================");
        System.out.println("       RECIBO DE PAGAMENTO      ");
        System.out.println("===============================");
        System.out.println("Funcionário: " + f.nome);
        System.out.println("Dependentes: " + f.quantidadeDeFilhos);
        System.out.println("-------------------------------");
        System.out.printf("TOTAL A RECEBER: R$ %.2f%n", valorFinal);
        System.out.println("===============================");
    }
}
