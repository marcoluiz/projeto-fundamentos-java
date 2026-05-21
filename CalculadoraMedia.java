
import java.util.Scanner;

public class CalculadoraMedia{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String nome;
    double nota;
    double nota2;

    System.out.println("Digite Seu Nome:");
    nome = sc.nextLine();

    System.out.println("Digite a primeira nota:");
    nota = sc.nextDouble();

    System.out.println("Digite a segunda nota:");
    nota2 = sc.nextDouble();

    System.out.println("\n nome:" + nome);
    System.out.println("primeira nota: "+ nota);
    System.out.println("segunda nota: "+ nota2);

  }  
} 