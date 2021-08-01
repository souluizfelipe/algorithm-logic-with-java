import java.util.Scanner;

public class Constants {

    static final Integer MINIMUM_DRIVING_AGE = 18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a idade? ");
        Integer age = scanner.nextInt();

        Boolean isMinimumAge = age >= MINIMUM_DRIVING_AGE;

        if(isMinimumAge) {
            System.out.println("Já pode tirar a carteira de motora");
        } else {
            System.out.println("Ainda não pode tirar a carteira de motorista não, :(");
        }

        scanner.close();
    }
}
