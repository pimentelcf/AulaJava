public class satelite {
    private String nome;
    private Float massa;
    private String orbitaalvo;
    private Float energia;
    private String status;

    //método construtor

    public satelite(String nome, Float massa, String orbitaalvo) {
        this.nome = nome;
        this.massa = massa;
        this.orbitaalvo = orbitaalvo;
        this.energia = 100.0F;
        this.status = "solo";
    }
    /*

    }
    public void (String mensagem) {
        if(status.equals("em orbita")|| energia < 10) {
            System.out.printf("%s não pode enviar dados(status: status %s, energia, %1,f%%)%n", nome, status, energia);
            */
    public void ativarpaineis () {
        this.energia = this.energia -= 20;
    }
    public void ativarmensagem () {
        if(!status.equals("em orbita")|| energia < 10) {
            System.out.printf("%s não pode enviar dados(status:status %s, energia, ", nome, status, energia);
        }

    }
     else{
        System.out.println("\u001B[32mOs paineis do satelite " + nome + " foram ativado  \nConsumo: " + energia + "\u001B[0m" );
        return true;
    }
}

public void enviar_dados(String mensagem){
    if(status){
        System.out.println("Satélite: " + nome + "\nEnviado: "+ mensagem);
    }
    else{
        System.out.println("Satélite desativado");
    }
}

@Override //So colocar um "...println(foguete)" ele vai imprimir bonito
public String toString(){
    return ("\nNome: " + nome + "\nMassa: " + massa + "\nOrbita: " + orbita +"\nEnergia: " + energia + "\nStatus: " + status);
}
}
}


// teste