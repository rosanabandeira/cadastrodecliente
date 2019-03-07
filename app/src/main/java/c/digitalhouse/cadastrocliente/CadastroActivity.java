package c.digitalhouse.cadastrocliente;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import c.digitalhouse.cadastrocliente.model.Cliente;
import c.digitalhouse.cadastrocliente.model.Endereco;
import c.digitalhouse.cadastrocliente.model.EnderecoResponse;
import c.digitalhouse.cadastrocliente.remote.APIService;
import c.digitalhouse.cadastrocliente.remote.RetrofitService;
import c.digitalhouse.cadastrocliente.validarCpf.ValidaCpf;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class CadastroActivity extends AppCompatActivity {

    private TextInputLayout inputFullName;
    private TextInputLayout inputCpf;
    private TextInputEditText addressCep;
    private ImageButton addressSearch;
    private TextInputEditText addressStreet;
    private TextInputEditText addressNumber;
    private TextInputEditText addressComplement;
    private TextInputEditText addressNeighbor;
    private TextInputEditText addressCity;
    private TextInputEditText addressUf;
    private TextInputEditText addressEstado;
    private EditText born;
    private ImageButton buttonSave;
    Cliente cliente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cadastro );

        inputFullName = findViewById( R.id.inputFullName );
        buttonSave = findViewById( R.id.btnSalvar );
        inputCpf = findViewById( R.id.inputCpf );
        addressCep = findViewById( R.id.addressCep );
        addressSearch = findViewById( R.id.addressSearch );
        addressStreet = findViewById( R.id.addressStreet );
        addressNumber = findViewById( R.id.addressNumber );
        addressComplement = findViewById( R.id.addressComplement );
        addressNeighbor = findViewById( R.id.addressNeighbor );
        addressCity = findViewById( R.id.addressCity );
        addressUf = findViewById( R.id.addressUf );
        addressEstado = findViewById( R.id.addressEstado );
        born = findViewById( R.id.born );


        buttonSave.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validaNome();
                validaCpf();
                criaCliente();
                validaBorn();

            }
        } );

    }

    private void criaCliente() {
        cliente = new Cliente();
        cliente.setNomeCompleto( inputFullName.getEditText().getText().toString() );
        cliente.setCpf( inputCpf.getEditText().getText().toString() );
        cliente.setDataDeNascimento( born.getText().toString() );

        Endereco endereco = new Endereco();

        endereco.setCep( addressCep.getEditableText().getFilters().toString() );
        endereco.setRua( addressStreet.getEditableText().toString() );
        endereco.setNumero( addressNumber.getEditableText().toString() );
        endereco.setComplemento( addressComplement.getEditableText().toString() );
        endereco.setBairro( addressNeighbor.getEditableText().toString() );
        endereco.setCidade( addressCity.getEditableText().toString() );
        endereco.setUf( addressUf.getEditableText().toString() );
        endereco.setEstado( addressEstado.getEditableText().toString() );

        cliente.setEndereco( endereco );


    }


    public void searchCep(View view) {

        final APIService retrofit = RetrofitService.getApiService();

        retrofit.getRemoteEndereco( addressCep.getEditableText().toString() ).enqueue( new Callback<EnderecoResponse>() {


            @Override
            public void onResponse(Call<EnderecoResponse> call, Response<EnderecoResponse> enderecoResponse) {

                addressStreet.setText( enderecoResponse.body().getLogradouro() );
                addressNeighbor.setText( enderecoResponse.body().getBairro() );
                addressCity.setText( enderecoResponse.body().getLocalidade() );
                addressEstado.setText( enderecoResponse.body().getUnidade() );
                addressUf.setText( enderecoResponse.body().getUf() );

            }


            @Override
            public void onFailure(Call<EnderecoResponse> call, Throwable t) {
                Log.e( "retrofit", "falhou " + t.getMessage() );

            }
        } );
    }

    public void validaNome() {

        if (inputFullName.getEditText().length() < 10) {
            inputFullName.setError( "Minimo 10 letras" );
        } else {
            inputFullName.setError( "" );
        }
    }

    public void validaCpf() {


        if (ValidaCpf.isCPF( inputCpf.getEditText().getText().toString() ) == true) {
            inputCpf.setError( "" );
        } else {
            inputCpf.setError( "CPF inválido" );
        }
    }

    public void validaBorn() {

        String pattern = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat( pattern );

        sdf.setLenient( false );

        String data = born.getText().toString();

        try {
            Date date = sdf.parse( data );
            // Data formatada corretamente
        } catch (ParseException e) {
            // Erro de parsing!!
            e.printStackTrace();
        }
    }
}
