package Abstract;

public class PessoaJuridica extends Pessoa{
    private Double cnpj;


    public Double getCnpj() {
        return cnpj;
    }

    public void setCnpj(Double cnpj) {
        this.cnpj = cnpj;
    }

    public void imprime() {
        System.out.println("Nome: " + getNome() + " " + getSobrenome());
        System.out.println("CNPJ: " + getCnpj());
    }
}
