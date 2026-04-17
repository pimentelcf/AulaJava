package ConsultórioMédico;

import java.util.ArrayList;
import java.util.List;

public class Atendimento {
     Senha senha;
     Paciente paciente;
     List<EtapaAtendimento> etapas;

    public Atendimento(Senha senha, Paciente paciente) {
        this.senha = senha;
        this.paciente = paciente;
        this.etapas = new ArrayList<>();
    }

public  void  registrarNovaEtapa(String nomeDaEtapa){

    EtapaAtendimento nova = new EtapaAtendimento(nomeDaEtapa);

    // Guardamos essa etapa na nossa lista
    this.etapas.add(nova);

    System.out.println("Etapa " + nomeDaEtapa + " registrada para o paciente " + paciente.nome);

}

}

