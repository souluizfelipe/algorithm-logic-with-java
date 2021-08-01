import java.text.DecimalFormat;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        System.out.print("Valor do Produto: ");
        Double productValue = scanner.nextDouble();

        System.out.print("Quantidade do Produto: ");
        Integer productAmount = scanner.nextInt();

        Double discount = 0.0;

        if(productAmount >= 10) {
            discount = 10.0;
        }

        Double totalProductValue = productAmount * productValue;
        Double finalPrice = totalProductValue - ((totalProductValue * discount) / 100);

        System.out.println("O valor total é de R$ " + finalPrice + " com desconto de: " + discount + "%");

        scanner.close();
    }
}
