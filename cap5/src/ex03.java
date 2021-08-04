import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da sameana: ");
        Integer weekDayNum = scanner.nextInt();

        String weekDay = "";

        switch (weekDayNum) {
            case 1: weekDay = "Domingo";
                break;
            case 2: weekDay = "Segunda-Feira";
                break;
            case 3: weekDay = "Terça-Feira";
                break;
            case 4: weekDay = "Quarta-Feira";
                break;
            case 5: weekDay = "Quinta-Feira";
                break;
            case 6: weekDay = "Sexta-Feira";
                break;
            case 7: weekDay = "Sábado";
                break;
            default: weekDay = "A semana tem 7 dias, adicione um número entre 1 e 7";
        }


        System.out.println("Hojé é " + weekDay);

        scanner.close();
    }
}
