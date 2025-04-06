import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        //solicitar informaçoes do usuario 

        System.out.println("Digite o numero da conta : ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a numero da agencia : ");
        String agencia = scanner.nextLine();
        

        System.out.println("Digite o nome do Cliente : ");
        String nomeCliente = scanner.nextLine();
        


        System.out.println("Digite saldo inicial : ");
        double Saldo = scanner.nextDouble();
        scanner.nextLine();



       System.out.println(" Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e seu saldo " + Saldo + " já esta disponivel para saque ");
       scanner.close();

    }
}
