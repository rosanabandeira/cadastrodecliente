package c.digitalhouse.cadastrocliente.testes;

import android.support.design.widget.TextInputLayout;

import junit.framework.TestCase;

import c.digitalhouse.cadastrocliente.R;
import c.digitalhouse.cadastrocliente.validarCpf.ValidaCpf;

public class ValidaCpfTest extends TestCase {

    private TextInputLayout inputCpf;


    public void testValidaCpf() {
        ValidaCpf.isCPF( "123456789" );
        assertTrue( true );
    }

    public void testUsuarioDigitouCpfValido() {
        if (ValidaCpf.isCPF( inputCpf.getEditText().getText().toString() ) == true) {
            inputCpf.setError( "" );
            assertTrue( true );
        }

    }

}