import java.text.DecimalFormat;
import java.util.Scanner;

public class ProductPlusShipping {

    static final Double SHIPPING_PRICE = 15.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        System.out.print("Digite o valor do produto: ");
        Double productValue = scanner.nextDouble();

        Boolean hasShipping = productValue >= 100.0;

        Double finalPrice = productValue;

        if (!hasShipping){
            finalPrice = productValue + SHIPPING_PRICE;
        }

        System.out.println("Valor final da compra R$" + decimalFormat.format(finalPrice));
        scanner.close();
    }
}
