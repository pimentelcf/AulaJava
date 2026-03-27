package Foguete;

import java.util.ArrayList;
import java.util.Scanner;

class Missao{

    private String satelite;
    private String foguete;
    private int id;
    private static int contador=1;

    public Missao(String satelite,String foguete){
        this.satelite= satelite;
        this.foguete = foguete;
        this.id= contador++; //Ter um id pro cara escolher qual quiser ter o relatorio
    }

    public int getID(){
        return id;
    }

    public String getSat(){
        return satelite;
    }

    public String getFog(){
        return foguete;
    }

    @Override // e para sobre escrever  o objeto
    public String toString(){
        return "\n-----------\n" + "\nID: " + id + "\nFoguete.Satelite: " + satelite + "\nFoguete.Foguete: " + foguete;
    }
}
public class Missao_geral {
    public static Scanner input = new Scanner(System.in);

    public static void Missao_Enviar(ArrayList<Missao> lista_missao, ArrayList<Satelite> lista_satelites, ArrayList<Foguete> lista_foguetes) {

        System.out.println("-----------------------------");
        System.out.println("Sim=1");
        System.out.println("Não=2");
        System.out.println("-----------------------------");

        while (true) {
            System.out.print("\nDeseja iniciar a missão?\n");
            int resposta = input.nextInt();
            input.nextLine();
            if (resposta == 2) {
                System.out.println("Protocolo de envio de missão cancelado");
                break;
            } else {
                System.out.println("Coloque o nome do foguete: ");
                String nome_foguete = input.nextLine().toLowerCase();

                System.out.println("Coloque o nome do satelite: ");
                String nome_satelite = input.nextLine().toLowerCase();

                for (Foguete f : lista_foguetes) { //Lançar o foguete
                    if (f.getFog().equals(nome_foguete)) {
                        if (f.lancar()) {
                            System.out.println("Foguete.Foguete Lançado");
                            Missao missao = new Missao(nome_satelite, nome_foguete);
                            lista_missao.add(missao);
                            System.out.println("\u001B[32mMissão enviada!\u001B[0m" + "\n\u001B[33mID: " + missao.getID() + "\u001B[0m");
                            f.setStatus("Lançado");

                            for (Satelite s : lista_satelites) { //Setar o satelite em orbita
                                if (s.getSat().equals(nome_satelite)) {
                                    s.setStatus("Em orbita");
                                    s.ativar_paineis();
                                }
                            }
                        } else {
                            System.out.println("Missão falhou! \nPor conta da falta de combustivel");
                        }
                    }
                }
            }
        }
    }
}