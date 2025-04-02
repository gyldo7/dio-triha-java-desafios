/**
 * <h1>ContaTerminal<h1>
 * <p>
 * O ContaTerminal permite que o cliente consulte os dados de sua conta no banco.
 * </p>
 * <p> 
 * O cliente deverá inserir os dados bancários: número da agência, número da conta e o nome do cliente seguidos da tecla Enter.
 * </p>
 * 
 * @author José Gildo da Silca
 * @version 1.0
 * @since 21/03/2025
 */

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String numeroAgencia;
        int numeroConta;
        String nomeCliente;
        double saldo = 237.38;

        System.out.println("Seja Bem vindo ao banco Dio!\n");

        System.out.print("Digite o número da Agência: ");
        numeroAgencia = entrada.nextLine();
        
        System.out.print("Digite o número da Conta: ");
        numeroConta = entrada.nextInt();
        
        entrada.nextLine();

        System.out.print("Digite o nome do Cliente: ");
        nomeCliente = entrada.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível.");
        
        entrada.close();
   
    }
}
