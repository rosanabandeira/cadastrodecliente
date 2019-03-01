package c.digitalhouse.cadastrocliente;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


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
        buttonSave = findViewById( R.id.buttonSave );
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


                criaCliente();

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
}
