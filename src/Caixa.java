import java.util.Scanner;
import java.util.Random;

public class Caixa {

    // Declaração do Main
    public static void main(String[] args) {

        // Declaração das variáveis, Scanner e Random
        String nome;
        double inicial;
        Scanner entrada = new Scanner(System.in);

        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);

        // Através do comando: 1 + numero.nextInt(9999) nós sorteamos um número
        // de conta de até 4 dígitos (nextInt(9999) gera números de 0 até 9998,
        // somando 1 gera de 1 até 9999).

        // Obtendo os dados iniciais do Cliente

        System.out.println("Cadastrando novo cliente.");
        System.out.print("Entre com seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Entre com o valor inicial depositado na conta: ");
        inicial = entrada.nextDouble();

        // Criando a conta de um cliente

        Conta minhaConta = new Conta(nome, conta, inicial);
        minhaConta.iniciar(); // Chama o menu
        entrada.close(); // Fechando o Scanner

    }
}
