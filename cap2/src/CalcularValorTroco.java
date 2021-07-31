import java.util.Scanner;

public class CalcularValorTroco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor do produto: ");
        Double valorProdudo = scanner.nextDouble();

        System.out.print("Valor Recebido: ");
        Double valorRecebido = scanner.nextDouble();

        var valorTroco = valorRecebido - valorProdudo;

        System.out.println("Troco: " + valorTroco);

        scanner.close();
    };
};
