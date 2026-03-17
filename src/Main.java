import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        //Listas
        ArrayList<Foguete> lista_foguetes = new ArrayList<>();
        ArrayList<Satelite> lista_satelites = new ArrayList<>();
        ArrayList<Missao> lista_missao = new ArrayList<>();

        Foguete foguete1 = new Foguete("vitor", 1000.0f, 500.0f, "Pronto para lançamento");
        Satelite satelite1 = new Satelite("pimentel",200f,"Lua",100f,"Lançado");

        Foguete foguete2 = new Foguete("vitor02", 0f, 500.0f, "Pronto para lançamento");
        Satelite satelite2 = new Satelite("pimentel02",200f,"Lua",100f,"Lançado");
        lista_satelites.add(satelite2);
        lista_satelites.add(satelite1);

        lista_foguetes.add(foguete1);
        lista_foguetes.add(foguete2);

        //Criacao.Mostrar(lista_satelites,lista_foguetes); //Vai mostrar pra criar

        Missao_geral.Missao_Enviar(lista_missao,lista_satelites,lista_foguetes); //Enviar a missão

        int ID = Relatorios_Geral.Relatorios(lista_missao,lista_satelites,lista_foguetes); //Relatorios

        Relatorios_Geral.Dados(lista_missao,lista_satelites,ID);
    }
}