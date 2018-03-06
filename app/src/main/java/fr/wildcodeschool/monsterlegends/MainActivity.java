package fr.wildcodeschool.monsterlegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String monsterName = "monsterName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private Monster[] monsters = {
            new Monster("Arch Knight", R.drawable.archknight0, 200, 56, 200, 140, R.drawable.dark, R.drawable.magic),
            new Monster("Bonbon", R.drawable.bonbon0, 175, 63, 200, 120, R.drawable.thunder, R.drawable.earth),
            new Monster("Fire Lion", R.drawable.firelion0, 220, 50, 175, 100, R.drawable.fire),
            new Monster("Genie", R.drawable.genie0, 190, 50, 250, 100, R.drawable.magic),
            new Monster("Giragast", R.drawable.giragast0, 223, 63, 160, 110, R.drawable.dark, R.drawable.magic),
            new Monster("Gravoid", R.drawable.gravoid0, 220, 53, 185, 120, R.drawable.earth, R.drawable.metal),
            new Monster("Light Sphinx", R.drawable.lightsphinx0, 175, 77, 160, 110, R.drawable.earth, R.drawable.light),
            new Monster("Panda", R.drawable.panda0, 190, 56, 200, 100, R.drawable.nature),
            new Monster("Rockilla", R.drawable.rockilla0, 175, 71, 175, 100, R.drawable.earth),
            new Monster("Thunder Eagle", R.drawable.thundereagle0, 175, 50, 250, 100, R.drawable.thunder),
            new Monster("Turtle", R.drawable.turtle0, 200, 56, 200, 100, R.drawable.water),
            new Monster("Tyrannoking", R.drawable.tyrannoking0, 230, 50, 175, 100, R.drawable.dark),
    };
}
