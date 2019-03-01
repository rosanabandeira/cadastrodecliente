package c.digitalhouse.cadastrocliente.remote;

import android.widget.ImageButton;


import c.digitalhouse.cadastrocliente.model.Endereco;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIService {

    @GET("ws/{CEP}/json")
    Observable<Endereco> getRemoteEndereco(@Path("CEP") String Cep);

}
