package dicoding.com.pasiar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;
    private ImageView splashImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash);
        splashImg = (ImageView)findViewById(R.id.splash_img);
        Glide.with(this).load(R.drawable.splash).into(splashImg);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), Main.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
