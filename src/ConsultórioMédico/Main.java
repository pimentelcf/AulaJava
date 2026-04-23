package ConsultórioMédico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        GerenciadorFila gerenciador = new GerenciadorFila();
        Atendimento atendimentoAtual = null;
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n========= SISTEMA CONSULTÓRIO =========");
            System.out.println("1. Gerar Senha");
            System.out.println("2. Chamar Paciente e Iniciar Atendimento");
            System.out.println("3. Registrar Próxima Etapa Clínica");
            System.out.println("4. Finalizar Atendimento");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Número da senha: ");
                    gerenciador.gerarNovaSenha(leitor.nextInt());
                    break;

                case 2:
                    if (atendimentoAtual != null) {
                        System.out.println("ERRO: Finalize o atendimento anterior primeiro!");
                        break;
                    }
                    System.out.print("Nome do Paciente: ");
                    String nome = leitor.nextLine();

                    // --- VALIDAÇÃO DE CPF ---
                    String cpf = "";
                    while (cpf.length() != 11) {
                        System.out.print("CPF (digite exatamente 11 números): ");
                        cpf = leitor.nextLine().replaceAll("\\D", ""); // Remove letras/pontos
                        if (cpf.length() != 11) {
                            System.out.println("CPF inválido! O CPF deve conter 11 dígitos.");
                        }
                    }

                    Paciente p = new Paciente(1, nome, cpf);
                    atendimentoAtual = gerenciador.chamarProximo(p);
                    break;

                case 3:
                    if (atendimentoAtual == null) {
                        System.out.println("Não há ninguém sendo atendido.");
                        break;
                    }


                    System.out.println("Selecione a etapa: 1-Triagem | 2-Consulta | 3-Exames");
                    int escolhaEtapa = leitor.nextInt();
                    leitor.nextLine();

                    String nomeEtapa = "";
                    if(escolhaEtapa == 1) nomeEtapa = "Triagem";
                    else if(escolhaEtapa == 2) nomeEtapa = "Consulta";
                    else if(escolhaEtapa == 3) nomeEtapa = "Exames";
                    else { System.out.println("Opção inválida!"); break; }

                    atendimentoAtual.registrarNovaEtapa(nomeEtapa);
                    break;

                case 4:
                    if (atendimentoAtual != null) {
                        atendimentoAtual.senha.finalizar();
                        System.out.println("Atendimento de " + atendimentoAtual.paciente.nome + " encerrado.");
                        atendimentoAtual = null;
                    }
                    break;
            }
        }
        leitor.close();
    }
}