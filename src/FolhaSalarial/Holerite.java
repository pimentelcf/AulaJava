package FolhaSalarial;

public class Holerite {
    public Funcionario funcionario;
    public double valorTotalHorasNormais;
    public double valorTotalHorasExtras;
    public double valorAdicionalFilhos;

    //  Calcular o valor total somando tudo
    public double calcularValorTotal() {
        return valorTotalHorasNormais + valorTotalHorasExtras + valorAdicionalFilhos;
    }

    //  Imprimindo dados do holerite
    public void imprimir() {
        System.out.println("\n========== HOLERITE ==========");
        System.out.println("Funcionário: " + funcionario.nome);
        System.out.printf("Horas Normais: R$ %.2f\n", valorTotalHorasNormais);
        System.out.printf("Horas Extras: R$ %.2f\n", valorTotalHorasExtras);
        System.out.printf("Adicional Filhos (10%%): R$ %.2f\n", valorAdicionalFilhos);
        System.out.println("------------------------------");
        System.out.printf("VALOR TOTAL: R$ %.2f\n", calcularValorTotal());
        System.out.println("==============================");
    }
}