import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora simples");
        System.out.print("Digite o primeiro valor: ");
        Double fistNum = scanner.nextDouble();

        System.out.print("Qual a operação você que fazer? ");
        String operator = scanner.next();

        System.out.print("Digite o segundo valor: ");
        Double secondNum = scanner.nextDouble();

        Double res = 0.0;

        if(operator.equals("+")) res = fistNum + secondNum;
        else if (operator.equals("-")) res = fistNum - secondNum;
        else if (operator.equals("*")) res = fistNum * secondNum;
        else if (operator.equals("/")) res = fistNum / secondNum;

        System.out.println("Resultado: " + res);

        scanner.close();
    }
}
