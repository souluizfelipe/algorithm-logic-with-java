import java.text.DecimalFormat;
import java.util.Scanner;

public class ChangingVariableValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        System.out.print("Valor do produto: ");
        Double productValue = scanner.nextDouble();

        System.out.print("Forma de pagamento [1 - à vista | 2 - à prazo] :");
        Integer paymentType = scanner.nextInt();

        Boolean noInterest = paymentType.equals(1);
        Double interest = 10.0;

        if(noInterest) {
            interest = 0.0;
        }

        Double finalPrice =  productValue + (interest * productValue / 100);

        System.out.println("O valor total do produto é de R$ " + finalPrice);

        if(!noInterest) {
            System.out.print("Número de parcelas: ");
            Integer installments = scanner.nextInt();

            Double monthlyPay = finalPrice / installments;

            System.out.println("O valor do produto em " + installments + " é de R$ " +  decimalFormat.format(monthlyPay));
        }

//


        scanner.close();
    }
}
