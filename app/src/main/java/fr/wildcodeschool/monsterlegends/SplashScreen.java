package fr.wildcodeschool.monsterlegends;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by perrine on 07/03/18.
 */

public class SplashScreen extends Activity {
    private final int SPLASH_TIME_OUT = 5000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView pandalf = findViewById(R.id.splashPandalf);
        Animation animation = AnimationUtils.loadAnimation((getApplicationContext()),R.anim.fade3);
        pandalf.startAnimation(animation);

        ImageView name = findViewById(R.id.wikiName);
        Animation animation2 = AnimationUtils.loadAnimation((getApplicationContext()),R.anim.fade2);
        name.startAnimation(animation2);

        ImageView monsterFond = findViewById(R.id.rabbishAnimnim);
        Animation animation3 = AnimationUtils.loadAnimation((getApplicationContext()),R.anim.fade);
        monsterFond.startAnimation(animation3);

        ImageView monsterFond2 = findViewById(R.id.tyrano);
        Animation animation4 = AnimationUtils.loadAnimation((getApplicationContext()),R.anim.fade);
        monsterFond2.startAnimation(animation4);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                SplashScreen.this.startActivity(intent);
                SplashScreen.this.finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
