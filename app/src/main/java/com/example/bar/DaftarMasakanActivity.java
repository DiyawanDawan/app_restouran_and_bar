package com.example.bar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bar.model.Masakan;

import java.util.List;

public class DaftarMasakanActivity extends AppCompatActivity {
    public final static String MASAKAN_TERPILIH = "masakan_obj_key";
    List<Masakan> masakans;
    ListView listView;
    String jenisMasakan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_masakan);
        Intent intent = getIntent();
        jenisMasakan = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        TextView txJudul = findViewById(R.id.text_title_daftar_masakan);
        txJudul.setText("MENU " + jenisMasakan.toUpperCase());
        masakans = DataProvider.getMasakansByTipe(this, jenisMasakan);
        setupListView();
    }
    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_hewan);
        DaftarMasakanAdapter adapter = new DaftarMasakanAdapter(this, masakans);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Masakan terpilih = masakans.get(position);
            bukaProfileMasakan(terpilih);
        }
    };
    public void bukaProfileMasakan(Masakan masakanterpilih) {
        Log.d("MAIN","Buka activity galeria");
        Intent intent = new Intent(this, ProfileActifity.class);
        intent.putExtra(MASAKAN_TERPILIH, masakanterpilih);
        startActivity(intent);
    }
}
