package c.digitalhouse.cadastrocliente.remote;

import c.digitalhouse.cadastrocliente.model.Endereco;
import c.digitalhouse.cadastrocliente.model.EnderecoResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIService {

    @GET("ws/{CEP}/json/")
    Call<EnderecoResponse> getRemoteEndereco(@Path("CEP") String CEP);


}
