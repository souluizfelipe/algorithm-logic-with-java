import java.util.Scanner;

public class RetirementRequirements {
    static final Integer MINIMUM_RETIREMENT_AGE = 55;
    static final Integer MINIMUM_RETIREMENT_WORK_TIME = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua Idade: ");
        Integer userAge = scanner.nextInt();

        System.out.print("Quantos anos você já trabalhou? ");
        Integer userWorkTime = scanner.nextInt();

        Boolean ageRequirement = userAge >= MINIMUM_RETIREMENT_AGE;
        Boolean workTimeRequirement = userWorkTime >= MINIMUM_RETIREMENT_WORK_TIME;

        if(ageRequirement && workTimeRequirement) {
            System.out.println("Você já pode se aposentar :)");
        } else {

            System.out.println("Você ainda não pode se aposentar :(");
            System.out.println("Para se aposentar é necessario trabalhar " + MINIMUM_RETIREMENT_WORK_TIME + " anos e ter no mínimo " + MINIMUM_RETIREMENT_AGE + " anos");
        }
        scanner.close();
    }
}
