import java.util.Scanner;

public class StudentGradesConst {

    static final Integer MINIMUM_GRADE_TO_APPROVE = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno(0 a 10): ");
        Double studentGrade = scanner.nextDouble();

        Boolean hasApproved = studentGrade >= MINIMUM_GRADE_TO_APPROVE;

        if(hasApproved) {
            System.out.println("O Aluno com nota " + studentGrade + " foi aprovado");
        } else {
            System.out.println("O Aluno com nota " + studentGrade + " não foi aprovado");
        }

    }
}
