import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta");
        int accountNumber = scanner.nextInt();

        System.out.println("Digite a agencia");
        String accountAgency = scanner.next();

        System.out.println("Digite o seu nome");
        String userName = scanner.next();

        System.out.println("Digite o saldo inicial");
        double userBalance = scanner.nextDouble();

        System.out.println("Sua conta foi criada com sucesso!");
        System.out.println("Numero da conta: " + accountNumber);
        System.out.println("Agencia: " + accountAgency);
        System.out.println("Cliente: " + userName);
        System.out.println("Saldo: " + userBalance);
    }
}