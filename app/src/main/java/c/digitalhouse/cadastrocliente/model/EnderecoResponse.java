
package c.digitalhouse.cadastrocliente.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class EnderecoResponse {

    @SerializedName("bairro")
    @Expose
    private String bairro;
    @SerializedName("cep")
    @Expose
    private String cep;
    @SerializedName("complemento")
    @Expose
    private String complemento;
    @SerializedName("localidade")
    @Expose
    private String localidade;
    @SerializedName("logradouro")
    @Expose
    private String logradouro;
    @SerializedName("uf")
    @Expose
    private String uf;
    @SerializedName("unidade")
    @Expose
    private String unidade;


    public EnderecoResponse() {
        this.bairro = bairro;
        this.cep = cep;
        this.complemento = complemento;
        this.localidade = localidade;
        this.logradouro = logradouro;
        this.uf = uf;
        this.unidade = unidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
}
