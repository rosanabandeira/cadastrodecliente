package c.digitalhouse.cadastrocliente.remote;

import c.digitalhouse.cadastrocliente.model.Cep;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIService {

    @GET("ws/{CEP}/json")
    Observable<Cep> getRemoteCep(@Path("CEP") String Cep);
}
