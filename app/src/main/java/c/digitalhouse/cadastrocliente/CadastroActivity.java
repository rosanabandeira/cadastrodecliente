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

                Log.i( "teste", inputFullName.getEditText().getText().toString() );
                Log.i( "teste", inputCpf.getEditText().getText().toString());

            }
        } );


    }
}