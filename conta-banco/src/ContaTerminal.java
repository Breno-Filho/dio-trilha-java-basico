import java.util.Scanner;

public class ContaTerminal {

    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;
      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o seu número:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o neu nome:");
        String nomeCliente = scanner.next();
        
        System.out.println("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
