import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Meta de faturamento do ano: ");
        Double revenueGoal = scanner.nextDouble();

        System.out.print("Faturamento anual da empresa: ");
        Double annualRevenue = scanner.nextDouble();

        System.out.print("Salário anual do funcionário: ");
        Double employeeYearlyIncome = scanner.nextDouble();

        Boolean hasBonus = (revenueGoal <= annualRevenue);
        Boolean minimumBonus = (annualRevenue >= (revenueGoal * 0.8));

        Double employeeBonus = 0.0;

        if(hasBonus) {
            employeeBonus = employeeYearlyIncome;
            System.out.println("Atingimos nossa meta esse ano, seu bonus é de " + employeeBonus);
        } else if (minimumBonus) {
            employeeBonus = employeeYearlyIncome * 0.8;
            System.out.print("Ficamos abaixo da meta, mas ainda sim, acima dos 80% mínimo, então o bonus é " + employeeBonus);
        } else {
            System.out.print("Infelizmente não atingimos nossa meta mínima para bonus esse ano :(");
        }

        scanner.close();
    }
}
