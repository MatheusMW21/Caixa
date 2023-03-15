import java.util.Scanner;
public class Conta {
    private String nome;
    private int conta, saques;
    private double saldo;
    Scanner entrada = new Scanner(System.in);

    public Conta(String nome, int conta, double saldo_inicial) {
        this.nome = nome;
        this.conta = conta;
        saldo = saldo_inicial;
        saques = 0;
    }
    // Essa função é similar ao Get, entao vamos pegar os dados

    public void extrato (double valor){
        System.out.println("\nExtrato");
        System.out.println("Nome: " + this.nome);
        System.out.println("Número da conta: " + this.conta);
        System.out.println("Saldo atual: \n" + this.saldo);
        System.out.println("Saques realizados hoje: " + this.saques + "\n");
    }

    // Essa função é similar ao Set, pois, "estamos alterando valores"

    public void sacar (double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            saques++; // conta a qntd de saldos realizados
            System.out.println("Sacado: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito \n");
        }
    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
    }
    public void iniciar (){
        int opcao;

        do {
            exibeMenu();
            opcao = entrada.nextInt();
            escolheOpcao(opcao);
        } while (opcao != 4);
    }

    public void exibeMenu() {
        System.out.println("\t Escolha a opção desejada");
        System.out.println("1 - Consultar Extrato");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sair \n");
        System.out.println("Opção: ");
    }

    public void escolheOpcao(int opcao) {
        double valor;

        switch (opcao){
            case 1:
                extrato(0.0);
                break;

            case 2:
                if (saques < 3) {
                    System.out.println("Quanto deseja sacar: ");
                    valor = entrada.nextDouble();
                    sacar(valor);
                } else {
                    System.out.println("Limite de saques diários atingido.");
                }
                break;

            case 3:
                System.out.println("Quanto deseja depositar: ");
                valor = entrada.nextDouble();
                depositar(valor);
                break;

            case 4:
                System.out.println("Sistema encerrado.");

            default:
                System.out.println("Opção Inválida!");

        }
    }
}
