package FolhaSalarial;

public class FolhaPagamento {

    public Holerite calcularSalario(ContratoTrabalho contrato, double horasN, double horasE) {
        //  Criamos o objeto que será retornado
        Holerite h = new Holerite();
        h.funcionario = contrato.funcionario;

        //  Cálculos base
        h.valorTotalHorasNormais = horasN * contrato.valorHoraNormal;
        h.valorTotalHorasExtras = horasE * contrato.valorHoraExtra;

        //  Regra do Adicional de 10%
        double subtotal = h.valorTotalHorasNormais + h.valorTotalHorasExtras;
        if (contrato.temAdicionalFilhos()) {
            h.valorAdicionalFilhos = subtotal * 0.10;  // bonus dos 10 %
        } else {
            h.valorAdicionalFilhos = 0; // caso cair na condição de o funcionario não possui filhos 0% de adicional no bonus
        }
        // unica condicional feita no projeto

        // Retorna o OBJETO inteiro
        return h;
    }
}