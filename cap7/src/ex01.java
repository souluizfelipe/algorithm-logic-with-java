import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tasks = new String[5];

        System.out.println("Adicione as 5 tarefas mais importantes do dia");
        tasks[0] = scanner.nextLine();
        tasks[1] = scanner.nextLine();
        tasks[2] = scanner.nextLine();
        tasks[3] = scanner.nextLine();
        tasks[4] = scanner.nextLine();

        System.out.println("Suas tarefas do dia são");

        for(int i = 0; i < tasks.length; i++) {
            System.out.println((i + 1) + " - " + tasks[i]);
        }


        scanner.close();
    }
}
