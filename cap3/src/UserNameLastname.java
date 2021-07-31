import java.util.Scanner;

public class UserNameLastname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.print("E seu sobrenome também: ");
        String lastname = scanner.nextLine();

        System.out.println("Olá, " + name + " " + lastname + ", seja bem vindo(a)!!! Feliz em te ver!" );

        scanner.close();
    }
}
