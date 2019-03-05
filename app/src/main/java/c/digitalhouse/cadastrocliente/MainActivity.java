package c.digitalhouse.cadastrocliente;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton btnIncluir;
    private Button btnCancelar;
    private ImageButton btnSalvar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cadastro );

        btnIncluir = findViewById( R.id.floatingActionButton );
        btnCancelar = findViewById( R.id.btnCancelar );
        btnSalvar = findViewById( R.id.btnSalvar );

        btnIncluir.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        } );
    }

}
