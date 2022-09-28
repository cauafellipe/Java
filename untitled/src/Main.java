import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        String cpf;
        int opcao = 99;
        int agencia = 123;
        Cliente cliente = new Cliente("nome", "cpf");
        Conta conta = new Conta(cliente,agencia,0,0);

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do cliente");
        nome = scan.nextLine();

        System.out.println("Informe o nome do cpf");
        cpf = scan.nextLine();

        do {
            System.out.println("Escolha uma opção abaixo");
            System.out.println("1 - Cadadastrar Cliente");
            System.out.println("2 - Cadastrar Conta");
            System.out.println("3 - Efetuar deposito");
            System.out.println("4 - Efetuar saque");
            System.out.println("5 - Mostrar saldo");
            opcao = scan.nextInt();

            switch(opcao){
                case 0:
                    break;
                case 1:
                    Cliente cliente1 = new Cliente(nome, cpf);
                    break;
                case 2:
                    System.out.println("Informe o numero da conta");
                    int numeroConta = scan.nextInt();
                    System.out.println("Informe a senha");
                    int senha = scan.nextInt();

                    Conta conta2 = new Conta(new Cliente("",""),agencia, numeroConta, senha);
                break;
                case 3:
                    System.out.println("Informe o valor que será depositado na conta");
                    double valor = scan.nextDouble();
                    conta.depositar(valor);
                    break;
                case 4:
                    System.out.println("Informe o valor que será sacado");
                    double saque = scan.nextDouble();
                    conta.sacar(saque);
                    break;
                case 5:
                    System.out.println("Seu saldo é: " + conta.getSaldo());
            }

        }while(opcao != 0);

    }
}