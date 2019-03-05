package c.digitalhouse.cadastrocliente.model;


public class Cliente {

    private int id;
    private String nomeCompleto;
    private String dataDeNascimento;
    private String cpf;
    private Endereco endereco;


    public Cliente() {

        endereco = new Endereco();

    }

    public Cliente(int id, String nomeCompleto, String dataDeNascimento, String cpf, Endereco endereco) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        return this.id == ((Cliente) o).id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

}

