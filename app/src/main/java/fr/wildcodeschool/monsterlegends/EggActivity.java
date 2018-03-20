package fr.wildcodeschool.monsterlegends;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class EggActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg);

        final ImageButton ibEgg = findViewById(R.id.egg);
        final TextView tvScoreBoard = findViewById(R.id.score);

        ibEgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayMetrics displayMetrics = ibEgg.getResources().getDisplayMetrics();
                float dpHeight = displayMetrics.heightPixels / displayMetrics.density;
                float dpWidth = displayMetrics.widthPixels / displayMetrics.density;

                int y = (int) dpHeight;
                int x = (int) dpWidth;

                Random r = new Random();
                int i2 = r.nextInt(y - (y * (-1)));

                Random t = new Random();
                int i1 = t.nextInt(x - (x * (-1)));
                ibEgg.setX(i1);
                ibEgg.setY(i2);

                score = score + 1;
                tvScoreBoard.setText("score: " + score);
            }
        });
    }
}

