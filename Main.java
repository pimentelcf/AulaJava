import java.util.Scanner;

public static void main(String[] args)  {


    // criando o objeto para ler a entrada dos usuarios
    Scanner leitor = new Scanner(System.in);
FolhaSalarial minhaFolha = new FolhaSalarial();

    System.out.println("--- Sistema de Folha Salarial ---");
   //  O usuário entra com os dados
    System.out.print("Digite as horas normais: ");
    double hNormais = leitor.nextDouble();

    System.out.print("Digite as horas extras: ");
    double hExtras = leitor.nextDouble();

    System.out.print("Digite o valor da hora normal: ");
    double vNormal = leitor.nextDouble();

    System.out.print("Digite o valor da hora extra: ");
    double vExtra = leitor.nextDouble();

    // 4. Agora pegamos essas informações e continuamos o código
    double resultado = minhaFolha.calcularSalario(hNormais, hExtras, vNormal, vExtra);

    System.out.println("\nCálculo Concluído!");
    System.out.println("O total a pagar é: R$ " + resultado);

    leitor.close(); //  fechar o leitor no final tentando acostumar a usar essa função
}