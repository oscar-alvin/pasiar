package dicoding.com.pasiar;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dicoding.com.pasiar.adapter.WisataPagerAdapt;

public class viewGambarW extends AppCompatActivity {
    private ViewPager viewPager;
    private WisataPagerAdapt wPager;
    private int[] gambarResource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_gambar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent dataGbr = getIntent();
        gambarResource = dataGbr.getIntArrayExtra("gbrWst");

        wPager = new WisataPagerAdapt(this, gambarResource);
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(wPager);
    }
}
