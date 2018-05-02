package br.usjt.devweb.servicedesk_aula03.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import br.usjt.devweb.servicedesk_aula03.R;
import br.usjt.devweb.servicedesk_aula03.model.Pais;

import static br.usjt.devweb.servicedesk_aula03.controller.ListarPaisesActivity.PAIS;

public class VisualizarPaisActivity extends Activity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_pais);
        txt = findViewById(R.id.detalhes_pais);
        Intent intent = getIntent();
        Pais pais = (Pais) intent.getSerializableExtra(PAIS);
        txt.setText(pais.toString());
    }
}
