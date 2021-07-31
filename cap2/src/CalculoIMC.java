import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        System.out.print("Digite sua altura em metros: ");
        Double height = scanner.nextDouble();

        System.out.print("Digite seu peso em kg: ");
        Double weight = scanner.nextDouble();

        double resIMC = weight / (height * height);

        System.out.println("Seu IMC é: " + numberFormat.format(resIMC));

        scanner.close();
    }
}
