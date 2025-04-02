/**
 * <h1>Contador<h1>
 * <p>
 * O contador permite imprimir em forma sequencial a quantidade de números que há entre dois números inteiros positivos.
 * </p>
 * 
 * @author José Gildo da Silva
 * @version 1.0
 * @since 02/04/2025
 */

import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        String continuar = "c";

        while(continuar.equalsIgnoreCase("c")) {
            System.out.print("Entre com o primeiro número: ");
            int parametroUm = entrada.nextInt();

           System.out.print("Entre com o segundo número: ");
            int parametroDois = entrada.nextInt();

            System.out.println();

             try {
                contar(parametroUm, parametroDois);
                System.out.println("Digite s para \"SAIR\" ou c para \"CONTINUAR\"");
                continuar = entrada.next();
            } catch (ParametrosInvalidosException e) {
                System.err.println("O segundo parâmetro deve ser maior que o primeiro\n");
                System.out.println("Digite s para \"SAIR\" ou c para \"CONTINUAR\"");
                continuar = entrada.next();
        }

        
    }
    
    System.out.println();
    System.out.println("Programa Finalizado!");
    entrada.close();

    }


    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    /**
    * Este método é utilizado para imprimir em forma sequencial a quantidade de números que há entre dois números inteiros
    * @param numeroUm este é o primeiro parâmetro do método
    * @param numeroDois este é o segundo parâmetro do método
    */
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i + 1));
            }

            System.out.println();
        }
    }
}
