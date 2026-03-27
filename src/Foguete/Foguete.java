package Foguete;

public class Foguete {

    private String nome;
    private float combustivel;
    private float carga;
    private String status;

    public Foguete(String nome, float combustivel, float carga, String status){
        this.nome = nome;
        this.combustivel = combustivel;
        this.carga = carga;
        this.status = status;
    }

    public void setStatus(String status ){
        this.status=status;
    }

    public String getFog(){
        return nome;
    }
    public void abastecer(float abastecimento){
        this.combustivel += abastecimento;
    }

    public boolean lancar(){
        if(this.combustivel>50){
            this.status = "Lançado";
            return true;
        }
        else{
            this.status="Falha";
            return false;
        }
    }

    public String toString(){
        return ("\nNome: " + nome + "\nCombustivel: " + combustivel + "\nCarga: " + carga + "\nStatus: " + status);
    }
}