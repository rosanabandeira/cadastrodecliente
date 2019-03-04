package c.digitalhouse.cadastrocliente.model;


import android.text.Editable;

public class Cliente {

    private String nomeCompleto;
    private String dataDeNascimento;
    private String cpf;
    private Endereco endereco;


    public Cliente() {

        endereco = new Endereco();

        endereco.setCep( endereco.getCep() );
        endereco.setRua( endereco.getRua() );
        endereco.setNumero( endereco.getNumero() );
        endereco.setBairro( endereco.getBairro() );
        endereco.setCidade( endereco.getCidade() );
        endereco.setComplemento( endereco.getComplemento() );
        endereco.setEstado( endereco.getEstado() );
        endereco.setUf( endereco.getUf() );
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


}

