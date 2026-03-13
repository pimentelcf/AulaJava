public class MissaoEspacial {
    public static void main(String[] args){

        centrocontrole controle = new centrocontrole();

        //Criando Foguetes
        Foguete falcon = new Foguete("Falcon Cascavel", 80.0, 20000);
        Foguete atlas = new Foguete("Atlas-PR", 120.0, 15000);

        //Criando Satelites
        satelite sentinel = new satelite("Sentinel-1", 850, "LEO");
        satelite comms = new satelite("Comms-BR", 1200, "GEO");
        satelite lunar = new satelite("Lunar_Probe", 450, "Orbita Lunar");

        //Adicionando ao centro de controle
        controle.adicionarFoguete(falcon);
        controle.adicionarFoguete(atlas);
        controle.adicionarSatelite(sentinel);
        controle.adicionarSatelite(comms);
        controle.adicionarSatelite(lunar);

        //Status inicial
        controle.statusMissao();

        System.out.println();

        //Abastecendo e iniciando a missão
        falcon.abastecer(50.0);
        controle.iniciarMissao("Falcon Cascavel", "Sentinel-1");

        //Satelite em órbita enviando dados
        sentinel.ativarpaineis();
        sentinel.enviarDados("Dados de temperatura da Amazônia: 28.5°C");

        //Status final
        controle.statusMissao();
    }
}


// finalizando
