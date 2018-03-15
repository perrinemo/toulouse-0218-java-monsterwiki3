package fr.wildcodeschool.monsterlegends;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Egg extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg);

        final Button egg =  findViewById(R.id.egg);
        final TextView scoreBoard = findViewById(R.id.score);

        egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random r = new Random();
                int i2 = r.nextInt(2000 - 100);

                Random t = new Random();
                int i1 = t.nextInt(800 - 100);
                egg.setX(i1);
                egg.setY(i2);

                score = score + 1 ;
                scoreBoard.setText("score: " + score);
            }
        });
    }
}

