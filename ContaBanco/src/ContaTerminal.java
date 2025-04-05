import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 237.48;
        
    System.out.println("Digite seu nome completo");
    String nomeCliente = scanner.next();
    System.out.println("Digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.next();
        
        System.out.println("Digite sua Agência");
        String numeroAgencia = scanner.next();
        
        System.out.print("Olá " + nomeCliente);
        System.out.print(", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia);
        System.out.print(", conta " + numeroConta);
        System.out.print(" e seu saldo " + saldo);
        System.out.println(" já está disponível para saque.");
        
    }
}