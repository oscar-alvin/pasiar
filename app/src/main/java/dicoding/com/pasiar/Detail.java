package dicoding.com.pasiar;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import dicoding.com.pasiar.model.wisata;

public class Detail extends AppCompatActivity {
    TextView detaillok, jarak, fasilitas;
    TextView full_ket;
    ImageView gambarWisata;
    Button viewGambar;
    int idwisata;
    int[] allGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        detaillok = (TextView)findViewById(R.id.detailLokasi);
        jarak = (TextView)findViewById(R.id.jarak);
        fasilitas = (TextView)findViewById(R.id.fasilitas);
        full_ket = (TextView)findViewById(R.id.fullket);
        gambarWisata = (ImageView)findViewById(R.id.imageView2);
        viewGambar = (Button)findViewById(R.id.viewGbr);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                idwisata = extras.getInt("idw");
            }
        }
        wisata w = new InitTempat().getWisata(idwisata);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle(w.getNama_t4w());

        collapsingToolbarLayout.setCollapsedTitleTextColor(
                ContextCompat.getColor(this, R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(
                ContextCompat.getColor(this, R.color.white));

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Glide.with(this).load(w.getGambar()).into(gambarWisata);
        detaillok.setText(w.getLokasi());
        jarak.setText(w.getJarak()+" km");
        fasilitas.setText(w.getFasilitas());
        full_ket.setText(w.getKeterangan());
        allGambar = w.getAllImg();

        viewGambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detail = new Intent(getApplicationContext(), viewGambarW.class);
                detail.putExtra("gbrWst", allGambar);
                startActivity(detail);
            }
        });
    }
}
