import java.text.DecimalFormat;
import java.util.Scanner;

public class FamilyExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        Double totalExpenses = 0.0;

        System.out.print("Total CONTA DE LUZ: ");
        Double energyBill = scanner.nextDouble();
        totalExpenses += energyBill;

        System.out.print("Total CONTA DE ÁGUA: ");
        Double waterBill = scanner.nextDouble();
        totalExpenses += waterBill;

        System.out.print("Total CONTA DE TELEFONE: ");
        Double telephoneBill = scanner.nextDouble();
        totalExpenses += telephoneBill;

        System.out.print("Mensalidade ESCOLA: ");
        Double schoolBill = scanner.nextDouble();
        totalExpenses += schoolBill;

        System.out.print("fatura CARTÃO DE CRÉDITO: ");
        Double creditCardBill = scanner.nextDouble();
        totalExpenses += creditCardBill;

        System.out.print("gastos SUPERMERCADO: ");
        Double supermarketTotalBill = scanner.nextDouble();
        totalExpenses += supermarketTotalBill;

        System.out.println("O total de gastos da familia esse mês foi de R$" + decimalFormat.format(totalExpenses));

        scanner.close();
    }
}
