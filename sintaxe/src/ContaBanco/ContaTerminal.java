import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
            System.out.println("Digite seu nome: ");
            String nomeCliente = scanner.next();

            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o número de sua conta:");
            int numero = scanner.nextInt();

            System.out.print("Por favor, digite o saldo desejado: ");;
            double saldo = scanner.nextDouble();

            // imprimindo os dados obtidos pelo usuário
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                    + ", conta " + numero + " e seu saldo " + saldo +" já está disponível para saque.");

    }
}