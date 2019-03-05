package c.digitalhouse.cadastrocliente.database;

import android.content.ContentValues;
import android.content.Context;

import c.digitalhouse.cadastrocliente.model.Endereco;

public class ClienteDAO {

    private final String TABLE_CLIENTES = "Clientes";
    private DbGateway gw;

    public ClienteDAO(Context ctx) {
        gw = DbGateway.getInstance( ctx );
    }

    public boolean salvar(String nomeCompleto, String dataDeNascimento, String cpf, String endereco) {
        ContentValues cv = new ContentValues();
        cv.put( "Nome Completo", nomeCompleto );
        cv.put( "Data de Nascimento", dataDeNascimento );
        cv.put( "CPF", cpf );
        cv.put( "Endereço", endereco );
        return gw.getDatabase().insert( TABLE_CLIENTES, null, cv ) > 0;
    }
}