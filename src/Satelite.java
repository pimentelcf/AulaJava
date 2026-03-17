public class Satelite {

    private String nome;
    private float massa;
    private String orbita;
    private float energia;
    private String status;
    private boolean statusBO = true;

    public Satelite(String nome, float massa, String orbita, float energia, String status){
        this.nome=nome;
        this.massa=massa;
        this.orbita=orbita;
        this.energia=energia; //O maximo que aqui tem de energia vai até 100
        this.status=status;
    }

    public void setStatus(String status ){
        this.status=status;
    }
    public String getSat(){
        return nome;
    }

    public boolean ativar_paineis(){
        this.energia -= 20;
        if(this.energia<=0){
            System.out.println("\u001B[31mSatelite " + nome + " energia passou do limite MAX \nConsumo: " + energia +"\u001B[0m" );
            this.status="Desativado";
            return false;
        }
        else{
            System.out.println("\u001B[32mOs paineis do satelite " + nome + " foram ativado  \nConsumo: " + energia + "\u001B[0m" );
            return true;
        }
    }

    public void enviar_dados(String mensagem){
        if(statusBO){
            System.out.println("Satélite: " + nome + "\nEnviado: "+ mensagem);
        }
        else{
            System.out.println("Satélite desativado");
        }
    }

    @Override //So colocar um "...println(foguete)" ele vai imprimir bem tranquilo
    public String toString(){
        return ("\nNome: " + nome + "\nMassa: " + massa + "\nOrbita: " + orbita +"\nEnergia: " + energia + "\nStatus: " + status);
    }
}
