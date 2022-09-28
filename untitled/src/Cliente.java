public class Cliente {
    private String nome;
    private String cpf;

    Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        System.out.println("Cliente Cadastrado com sucesso! \n");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
