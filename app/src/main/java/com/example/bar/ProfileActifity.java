package com.example.bar;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bar.model.Masakan;

public class ProfileActifity extends AppCompatActivity {
    Masakan masakan;
    TextView txJudul, txName, txbahan, txCaraMebuat;
    ImageView photodrawableMas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent = getIntent();
        masakan = (Masakan) intent.getSerializableExtra(DaftarMasakanActivity.MASAKAN_TERPILIH);
        inisialisasiView();
        tampilProfile(masakan);
    }
    private void inisialisasiView(){
        txJudul = findViewById(R.id.txJudul);
        txName = findViewById(R.id.txName);
        txbahan = findViewById(R.id.txBahan);
        txCaraMebuat = findViewById(R.id.txCaraMembuat);
        photodrawableMas = findViewById(R.id.gambarMasakan);
    }
    private void tampilProfile(Masakan masakan){
        Log.d("Profile", "Menampilkan" + masakan.getMasakan());
        txJudul.setText(masakan.getMasakan());
        txName.setText(masakan.getNama());
        txbahan.setText(masakan.getBahan());
        txCaraMebuat.setText(masakan.getCaraMebuat());
        photodrawableMas.setImageDrawable(this.getDrawable(masakan.getDrawableRes()));

    }
}
