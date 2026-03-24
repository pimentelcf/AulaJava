package FolhaSalarial; // O pacote tem que ser o primeiro comando

public class FolhaSalarial { // A classe tem que ser declarada explicitamente

    public double calcularSalario(double horasNormais, double horasExtras, double valorHora, double valorExtra) {
        double totalNormal = horasNormais * valorHora;
        double totalExtra = horasExtras * valorExtra;
        return totalNormal + totalExtra;
    }
}