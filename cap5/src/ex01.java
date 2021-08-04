import java.util.Scanner;

public class ex01 {

    static Double MINIMUM_ADDED_GRADE = 150.0;
    static Double MINIMUM_INDIVIDUAL_GRADE = 60.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota de Portugês: ");
        Double portGrade = scanner.nextDouble();

        System.out.print("Nota de Matemática: ");
        Double mathGrade = scanner.nextDouble();

        Double finalGrade = portGrade + mathGrade;

        Boolean isApproved = (finalGrade >= MINIMUM_ADDED_GRADE)
                && (portGrade >= MINIMUM_INDIVIDUAL_GRADE && mathGrade >= MINIMUM_INDIVIDUAL_GRADE);

        if(isApproved) {
            System.out.println("Você passou, sua nota total foi " + finalGrade);
            System.out.println("Com " + portGrade + " em português e " + mathGrade + " em matemática");
        } else {
            System.out.println("Você não passou, sua nota total foi " + finalGrade);
            System.out.println("Suas notas individuais foram, português: " + portGrade + ", e matemática: " + mathGrade);
        }

        scanner.close();
    }
}
