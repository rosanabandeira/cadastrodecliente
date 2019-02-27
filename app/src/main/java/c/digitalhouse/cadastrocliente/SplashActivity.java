package c.digitalhouse.cadastrocliente;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash );

        textView = findViewById( R.id.hello );

        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent startIntent = new Intent( SplashActivity.this, CadastroActivity.class );

                startActivity( startIntent );


                finish();

            }
        }, 1000 * 4 );
    }


}
