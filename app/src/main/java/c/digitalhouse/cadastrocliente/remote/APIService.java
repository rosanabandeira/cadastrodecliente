package c.digitalhouse.cadastrocliente.remote;

import android.support.design.widget.TextInputEditText;
import android.widget.ImageButton;


import c.digitalhouse.cadastrocliente.model.Endereco;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIService {

    @GET("ws/01001000/json/")
    Call<Endereco> getRemoteEndereco();


}
