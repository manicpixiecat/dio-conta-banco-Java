public class Scanner {
  Scanner scanner = new Scanner (System.in).useLocale (Locale.US);
  System.out.println ("Digite seu nome completo");
  String nomeCliente = scanner.next();
  System.out.println ("Digite sua Agencia");
  String numeroAgencia = scanner.next ();
  System.out.println ("Digite o número da Conta");
  int numeroConta = scanner.next ();
  
}
