package ConsultórioMédico;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos o Gerenciador (o motor do sistema)
        GerenciadorFila gerenciador = new GerenciadorFila();

        // 2. Criamos um Paciente
        Paciente p1 = new Paciente(1, "Vitor Pimentel", "123.456.789-00");

        // 3. GERAR SENHA (Registro de Horário de Entrada)
        System.out.println("--- Recepção: Gerando Senha ---");
        gerenciador.gerarNovaSenha(101); // Senha nº 101

        System.out.println("\n--- Painel: Chamando Paciente ---");
        // 4. INICIAR ATENDIMENTO (Tira da fila e vincula ao Paciente)
        Atendimento atendimentoJoao = gerenciador.chamarProximo(p1);

        if (atendimentoJoao != null) {
            // 5. REGISTRAR PROCEDIMENTOS (Com horários automáticos)
            System.out.println("\n--- Iniciando Procedimentos Clínicos ---");

            atendimentoJoao.registrarNovaEtapa("começando a espera");
            // Simulando um pequeno delay ou intervalo entre etapas
            atendimentoJoao.registrarNovaEtapa("Consulta Médica");
            atendimentoJoao.registrarNovaEtapa("Exame de Sangue");
            atendimentoJoao.registrarNovaEtapa("Retorno Consulta");

            // 6. FINALIZAR SENHA
            atendimentoJoao.senha.finalizar();
            System.out.println("\nStatus Final da Senha: " + atendimentoJoao.senha.status);
        }

        System.out.println("\n--- Sistema: Atendimento de " + p1.nome + " concluído ---");
    }
}