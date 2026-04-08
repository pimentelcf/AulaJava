package Colletions;

import java.util.ArrayList;
import java.util.Iterator;

public class colletions_relatorios {

    public void exibirRelatorioNetuno() {

        ArrayList<String> satelitesNetuno = new ArrayList<>();
        satelitesNetuno.add("Tritão");
        satelitesNetuno.add("Nereida");
        satelitesNetuno.add("Proteu");
        satelitesNetuno.add("Larissa");
        satelitesNetuno.add("Galateia");
        satelitesNetuno.add("Despina");
        satelitesNetuno.add("Talassa");
        satelitesNetuno.add("Naiade");
        satelitesNetuno.add("Halimede");
        satelitesNetuno.add("Sao");
        satelitesNetuno.add("Laomedeia");
        satelitesNetuno.add("Psamate");
        satelitesNetuno.add("Neso");
        satelitesNetuno.add("Hipocampo");

        System.out.println("=== RELATÓRIO ESPACIAL: NETUNO ===");
        System.out.println("Total de satélites conhecidos: " + satelitesNetuno.size());
        System.out.println("Lista de Satélites:");

        // Usando o Iterator
        Iterator<String> it = satelitesNetuno.iterator();

        it.forEachRemaining((String nome) -> System.out.println("- " + nome));

        System.out.println("==================================");
        // aqui e para dar um espaço no final da main
    }
}