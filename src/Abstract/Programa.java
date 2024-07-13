package Abstract;

public class Programa {
    public static void main(String[] args) {
        PessoaFisica pessoafisica = new PessoaFisica();
        pessoafisica.setNome("Joaquim");
        pessoafisica.setSobrenome("Ferreira");
        pessoafisica.setCpf(444D);
        pessoafisica.imprime();

        PessoaJuridica pessoajuridica = new PessoaJuridica();
        pessoajuridica.setNome("José");
        pessoajuridica.setSobrenome("Martinez");
        pessoajuridica.setCnpj(555D);
        pessoajuridica.imprime();

    }
}
