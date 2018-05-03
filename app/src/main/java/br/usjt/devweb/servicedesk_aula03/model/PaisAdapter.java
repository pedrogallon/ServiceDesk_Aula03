package br.usjt.devweb.servicedesk_aula03.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import br.usjt.devweb.servicedesk_aula03.R;

public class PaisAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Pais> paises;

    public PaisAdapter(Context context, ArrayList<Pais> paises){
        this.context = context;
        this.paises = paises;
    }

    @Override
    public int getCount() {
        return paises.size();
    }

    @Override
    public Object getItem(int i) {
        return paises.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.adapter_pais, viewGroup, false );
        ImageView img = v.findViewById(R.id.adapter_pais_imagem);
        TextView nome = v.findViewById(R.id.adapter_pais_nome);
        TextView info = v.findViewById(R.id.adapter_pais_info);
        Pais pais = paises.get(i);

        Drawable drawable = Util.getDrawable(context, paises.get(i).getCodigo3().toLowerCase());
        img.setImageDrawable(drawable);
        nome.setText(pais.getNome());
        info.setText("Região: "+pais.getRegiao()+"  Capital: "+pais.getCapital());

        return v;
    }
}
