package ConsultórioMédico;
import java.util.LinkedList; // Para a estrutura da fila
import java.util.Queue;      // Para a interface da fila
import java.util.ArrayList;  // Para a lista de atendimentos finalizados
import java.util.List;       // Para a interface da lista

public class GerenciadorFila {
    Queue<Senha> filaEspera = new LinkedList<>();
    List<Atendimento> historicoAtendimentos = new ArrayList<>();

// metodo gerar nova senha
public void gerarNovaSenha(int numero) {
    Senha nova = new Senha(numero);
    filaEspera.add(nova);
    System.out.println("Senha nº " + numero + " gerada às " + nova.horarioGeracao);
}

// metodo chamando o proximo da fila
public Atendimento chamarProximo(Paciente paciente) {
    Senha proxima = filaEspera.poll(); // Tira o primeiro da fila

    if (proxima != null) {
        proxima.chamar(); // Muda status para "Chamada"
        Atendimento novoAtendimento = new Atendimento(proxima, paciente);
        historicoAtendimentos.add(novoAtendimento);
        return novoAtendimento;
    } else {
        System.out.println("Fila vazia!");
        return null;
    }
}

}


