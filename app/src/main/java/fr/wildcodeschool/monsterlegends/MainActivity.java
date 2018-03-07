package fr.wildcodeschool.monsterlegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    public static final String monsterName = "monsterName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GridView gridView = findViewById(R.id.gridview);
        GridAdapter gridAdapter = new GridAdapter(this, monsters);
        gridView.setAdapter(gridAdapter);

    }

    private Monster[] monsters = {
            new Monster("Arch Knight", R.drawable.archknight0, R.drawable.archknight1, R.drawable.archknight2, R.drawable.archknight3, 200, 56, 200, 140, 308, 127, 308, 392, 162, 392, 980, 1587, 980, R.drawable.dark, R.drawable.magic),
            new Monster("Bonbon", R.drawable.bonbon0, 175, 63, 200, 120, R.drawable.thunder, R.drawable.earth),
            new Monster("Fire Lion", R.drawable.firelion0, R.drawable.firelion1, R.drawable.firelion2, R.drawable.firelion3, 220, 50, 175, 100, 242, 81, 192,308, 104, 244, 770, 1017,612,  R.drawable.fire),
            new Monster("Genie", R.drawable.genie0, 190, 50, 250, 100, R.drawable.magic),
            new Monster("Giragast", R.drawable.giragast0, R.drawable.giragast1, R.drawable.giragast2, R.drawable.giragast2, R.drawable.giragast3, 223, 63, 160, 110, 269, 112, 193, 343, 143, 857, 1404, 616,R.drawable.dark, R.drawable.magic),
            new Monster("Gravoid", R.drawable.gravoid0, 220, 53, 185, 120, R.drawable.earth, R.drawable.metal),
            new Monster("Light Sphinx", R.drawable.lightsphinx0,R.drawable.lightsphinx1, R.drawable.lightsphinx2,R.drawable.lightsphinx3, 175, 77, 160, 110, 212, 138,193, 270, 176, 246, 675, 1729, 616, R.drawable.earth, R.drawable.light),
            new Monster("Panda", R.drawable.panda0, 190, 56, 200, 100, R.drawable.nature),
            new Monster("Rockilla", R.drawable.rockilla0, R.drawable.rockilla1, R.drawable.rockilla2,R.drawable.rockilla3, 175, 71, 175, 100, 192, 115, 192, 244, 147, 244, 616,1444, 612, R.drawable.earth),
            new Monster("Thunder Eagle", R.drawable.thundereagle0, 175, 50, 250, 100, R.drawable.thunder),
            new Monster("Turtle", R.drawable.turtle0, R.drawable.turtle1, R.drawable.turtle2,R.drawable.turtle3, 200, 56, 200, 100, 220, 91, 220, 280, 116, 280, 700, 1139, 700, R.drawable.water),
            new Monster("Tyrannoking", R.drawable.tyrannoking0, 230, 50, 175, 100, R.drawable.dark),*/
    };
}
