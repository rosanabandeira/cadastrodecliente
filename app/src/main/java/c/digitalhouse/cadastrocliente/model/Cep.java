
package c.digitalhouse.cadastrocliente.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Cep {

    @SerializedName("cep")

    private List<Cep> newListCep;

    @SerializedName("bairro")
    @Expose
    private String bairro;
    @Expose
    private String cep;
    @SerializedName( "complemento" )
    @Expose
    private String complemento;
    @Expose
    private String gia;
    @Expose
    private String ibge;
    @SerializedName( "localidade" )
    @Expose
    private String localidade;
    @SerializedName( "logradouro" )
    @Expose
    private String logradouro;
    @SerializedName( "uf" )
    @Expose
    private String uf;
    @SerializedName( "unidade" )
    @Expose
    private String unidade;

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getGia() {
        return gia;
    }

    public String getIbge() {
        return ibge;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getUf() {
        return uf;
    }

    public String getUnidade() {
        return unidade;
    }

    public static class Builder {

        private String bairro;
        private String cep;
        private String complemento;
        private String gia;
        private String ibge;
        private String localidade;
        private String logradouro;
        private String uf;
        private String unidade;

        public Cep.Builder withBairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public Cep.Builder withCep(String cep) {
            this.cep = cep;
            return this;
        }

        public Cep.Builder withComplemento(String complemento) {
            this.complemento = complemento;
            return this;
        }

        public Cep.Builder withGia(String gia) {
            this.gia = gia;
            return this;
        }

        public Cep.Builder withIbge(String ibge) {
            this.ibge = ibge;
            return this;
        }

        public Cep.Builder withLocalidade(String localidade) {
            this.localidade = localidade;
            return this;
        }

        public Cep.Builder withLogradouro(String logradouro) {
            this.logradouro = logradouro;
            return this;
        }

        public Cep.Builder withUf(String uf) {
            this.uf = uf;
            return this;
        }

        public Cep.Builder withUnidade(String unidade) {
            this.unidade = unidade;
            return this;
        }

        public Cep build() {
            Cep cep = new Cep();
            cep.bairro = bairro;
            cep.complemento = complemento;
            cep.gia = gia;
            cep.ibge = ibge;
            cep.localidade = localidade;
            cep.logradouro = logradouro;
            cep.uf = uf;
            cep.unidade = unidade;
            return cep;
        }

    }

}
