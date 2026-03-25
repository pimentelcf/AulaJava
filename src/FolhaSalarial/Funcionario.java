package FolhaSalarial;
import java.util.Scanner;

public class Funcionario {
    public String nome;
    public int quantidadeDeFilhos;

    public void mostrarDados() {
        System.out.println("Nome: " + nome + " | Filhos: " + quantidadeDeFilhos);
    }
}