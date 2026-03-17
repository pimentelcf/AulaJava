import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Relatorios_Geral{
    public static int Relatorios(ArrayList<Missao> lista_missao,
                                 ArrayList<Satelite> lista_satelites,
                                 ArrayList<Foguete> lista_foguetes){

        Scanner input = new Scanner(System.in);

        for(Missao missao : lista_missao){
            System.out.println(missao);
        }

        System.out.println("\n-----------------------------");
        System.out.println("Sim=1");
        System.out.println("Não=2");
        System.out.println("-----------------------------");
        System.out.println("Deseja ver os relatorios das missões?");
        int resposta = input.nextInt();

        if(resposta == 2){
            System.out.println("Encerrando programa...");
            System.exit(0); // finalizado  o programaaa
        }

        System.out.println("-----------------------------");
        System.out.println("Para sair digite 0");
        System.out.println("-----------------------------");

        while(true){
            System.out.println("Digite o ID da missão");
            int respostaID = input.nextInt();

            if(respostaID == 0){
                System.out.println("Encerrando programa...");
                System.exit(0);
            }

            for(Missao m: lista_missao){
                if(m.getID() == respostaID){
                    System.out.println("Missão encontrada!");
                    for(Satelite s: lista_satelites){
                        if(m.getSat().equals(s.getSat())){
                            System.out.println(s);
                        }
                    }
                    for(Foguete f: lista_foguetes){
                        if(m.getFog().equals(f.getFog())){
                            System.out.println(f);
                        }
                    }
                    return respostaID;
                }
            }

            System.out.println("ID não encontrado, tente novamente!");
        }
    }

    public static void Dados(ArrayList<Missao>lista_missao,ArrayList<Satelite>lista_satelites,int ID){
        Random random = new Random();

        double temperatura = -150 + (random.nextDouble() * 200); // -150 até +50
        double radiacao = random.nextDouble() * 500; // 0 até 500
        double posicao = random.nextDouble() * 360; // graus orbitais

        for(Missao m: lista_missao){
            if(m.getID()== ID){ //Achou o ID então vai dar boa na logica
                System.out.println("Missão encontrada!");
                for(Satelite s:lista_satelites){
                    if(m.getSat().equals(s.getSat())){
                        System.out.println("\u001B[36m==============================");
                        System.out.println("📡 Enviando dados do Satélite: " + s.getSat());
                        System.out.println("🌡️ Temperatura: " + String.format("%.2f", temperatura) + " °C");
                        System.out.println("☢️ Radiação: " + String.format("%.2f", radiacao) + " RAD");
                        System.out.println("🛰️ Posição orbital: " + String.format("%.2f", posicao) + "°");
                        System.out.println("==============================\u001B[0m");
                    }
                }
            }
        }
    }
}

