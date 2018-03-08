package br.usjt.devweb.servicedesk_aula03;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetalheChamadoActivity extends Activity {
    TextView txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_chamado);
        txtNome = findViewById(R.id.chamado_nome);
        Intent intent = getIntent();
        String nome = intent.getStringExtra(ListarChamadosActivity.CHAMADO);
        txtNome.setText(nome);
    }
}
