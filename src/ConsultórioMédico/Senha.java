package ConsultórioMédico;

import java.time.LocalDateTime;

public class Senha {
    int numero;
    LocalDateTime horarioGeracao;
    String status;

    public Senha(int numero) {
        this.numero = numero;
        this.horarioGeracao = LocalDateTime.now();
        this.status = "Aguardando";
    }

    public void chamar() {
        this.status = "Chamada";
    }

    public void finalizar() {
        this.status = "Finalizada";
    }
}