import java.util.Scanner;

public class CalculoDoQuadradoDoNum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número para saber seu valor elevado ao quadrado: ");
    Integer num = scanner.nextInt();

    int res = num * num;

    System.out.println("O quadrado de " + num + " é " + res);

    scanner.close();
  }
}
