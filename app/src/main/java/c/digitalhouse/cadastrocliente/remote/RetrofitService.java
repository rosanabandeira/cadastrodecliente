package c.digitalhouse.cadastrocliente.remote;

import c.digitalhouse.cadastrocliente.model.Endereco;
import c.digitalhouse.cadastrocliente.remote.APIService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.Result;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;


public class RetrofitService {

    private static final String BASE_URL = "https://viacep.com.br/";

    private static Retrofit retrofit;

    private static Retrofit getRetrofit() {

        retrofit = new Retrofit.Builder()
                .baseUrl( BASE_URL )
                .addCallAdapterFactory( RxJava2CallAdapterFactory.create() )
                .addConverterFactory( GsonConverterFactory.create() )
                .build();

        return retrofit;
    }

    public static APIService getApiService() {
        return getRetrofit().create( APIService.class );
    }

}
