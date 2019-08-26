package dicoding.com.pasiar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import dicoding.com.pasiar.adapter.TWListAdapter;

public class Main extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TWListAdapter twListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        recyclerView = (RecyclerView)findViewById(R.id.recyler_t4wisata);
        recyclerView.setHasFixedSize(true);

        InitTempat itw = new InitTempat();
        twListAdapter = new TWListAdapter(this, itw.getAllWisata());

        RecyclerView.LayoutManager mlayourManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mlayourManager);
        recyclerView.setAdapter(twListAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_about :
                startActivity(new Intent(Main.this, About.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
