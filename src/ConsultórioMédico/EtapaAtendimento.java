package ConsultórioMédico;

import java.time.LocalDateTime;

public class EtapaAtendimento {
    String nomeEtapa;
    LocalDateTime horarioInicial;
    LocalDateTime horarioFim;

    public EtapaAtendimento(String nomeEtapa) {
        this.nomeEtapa = nomeEtapa;
        this.horarioInicial = LocalDateTime.now();
    }

    public void encerrarEtapa() {
        this.horarioFim = LocalDateTime.now();
    }
}