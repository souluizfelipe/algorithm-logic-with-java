import java.util.Scanner;

public class CalcularValorTroco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor do produto: ");
        Double productValue = scanner.nextDouble();

        System.out.print("Valor Recebido: ");
        Double recivedValue = scanner.nextDouble();

        double changeValue = recivedValue - productValue;

        System.out.println("Troco: " + changeValue);

        scanner.close();
    };
};
