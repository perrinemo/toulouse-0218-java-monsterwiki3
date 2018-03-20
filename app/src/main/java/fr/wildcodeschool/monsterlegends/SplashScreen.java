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
    private final int SPLASH_TIME_OUT = 3500;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView ivPandalf = findViewById(R.id.splash_pandalf);
        Animation animation = AnimationUtils.loadAnimation((getApplicationContext()), R.anim.fade3);
        ivPandalf.startAnimation(animation);

        ImageView ivName = findViewById(R.id.wiki_name);
        Animation animation2 = AnimationUtils.loadAnimation((getApplicationContext()), R.anim.fade3);
        ivName.startAnimation(animation2);

        ImageView ivMonsterBackground = findViewById(R.id.splash_rabish);
        Animation animation3 = AnimationUtils.loadAnimation((getApplicationContext()), R.anim.fade);
        ivMonsterBackground.startAnimation(animation3);

        ImageView ivMonsterBackground2 = findViewById(R.id.splash_tyrano);
        Animation animation4 = AnimationUtils.loadAnimation((getApplicationContext()), R.anim.fade);
        ivMonsterBackground2.startAnimation(animation4);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                SplashScreen.this.startActivity(intent);
            }
        }, SPLASH_TIME_OUT);
    }
}
