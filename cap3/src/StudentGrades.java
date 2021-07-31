import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        Double finalGrade = scanner.nextDouble();

        if(finalGrade < 7) {
            System.out.println("O aluno(a) não passou com a nota: " + finalGrade);
        } else {
            System.out.println("O aluno(a) passou com a nota: " + finalGrade);
        }

    }
}
