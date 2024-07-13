package Abstract;

public class PessoaFisica extends Pessoa {
    private Double cpf;


    public Double getCpf() {
        return cpf;
    }

    public void setCpf(Double cpf) {
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println("Nome: " + getNome() + " " + getSobrenome());
        System.out.println("CPF: " + getCpf());
    }
}
