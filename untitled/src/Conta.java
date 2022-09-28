public class Conta {
    static int agencia;
    private int numeroConta;
    private int senha;
    private Cliente cliente;
    private double saldo;

    Conta(Cliente cliente,int agencia, int numeroConta,int senha ){
        this.cliente = cliente;
        this.agencia= agencia;
        this.numeroConta = numeroConta;
        this.senha = senha;
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso!");
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void sacar(double valor1){
        this.saldo -= valor1;
        System.out.println("Saque realizado com sucesso!");
    }


}
