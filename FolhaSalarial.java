public class FolhaSalarial {

    // Este metodo e a "maquina de calcular" a minha folha
    public double calcularSalario(double horasNormais, double horasExtras, double valorHora, double valorExtra) {

         // aqui eu to calculando separado para tentar deixar mais organizado
        double totalNormal = horasNormais * valorHora;
        double totalExtra = horasExtras * valorExtra;

        // aqui eu to retornando as horas extras
        return totalNormal + totalExtra;
    }
}