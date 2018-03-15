package fr.wildcodeschool.monsterlegends;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class EggActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg);

        final ImageButton egg =  findViewById(R.id.egg);
        final TextView scoreBoard = findViewById(R.id.score);

        egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DisplayMetrics displayMetrics = egg.getResources().getDisplayMetrics();
                float dpHeight = displayMetrics.heightPixels / displayMetrics.density;
                float dpWidth = displayMetrics.widthPixels / displayMetrics.density;

                int y = (int) dpHeight;
                int x = (int) dpWidth;

                Random r = new Random();
                int i2 = r.nextInt( y - (y * (-1)) );

                Random t = new Random();
                int i1 = t.nextInt(x - (x * (-1)) );
                egg.setX(i1);
                egg.setY(i2);

                score = score + 1 ;
                scoreBoard.setText("score: " + score );
            }
        });
    }
}

