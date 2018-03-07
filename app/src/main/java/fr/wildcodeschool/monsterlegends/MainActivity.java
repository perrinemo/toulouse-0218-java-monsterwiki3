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
            new Monster("Arch Knight", R.drawable.archknight0, R.drawable.archknight1, R.drawable.archknight2, R.drawable.archknight3, 200, 56, 200, 140, R.drawable.dark, R.drawable.magic),
            new Monster("Bonbon", R.drawable.bonbon0, R.drawable.bonbon1, R.drawable.bonbon2, R.drawable.bonbon3, 175, 63, 200, 120, 231, 123, 264, 294, 158, 336, 735, 1546, 840, R.drawable.thunder, R.drawable.earth),
            new Monster("Fire Lion", R.drawable.firelion0, 220, 50, 175, 100, R.drawable.fire),
            new Monster("Genie", R.drawable.genie0, R.drawable.genie1, R.drawable.genie2, R.drawable.genie3, 190, 50, 250, 100,209, 81, 275, 266, 104, 350, 665, 1017, 875, R.drawable.magic),
            new Monster("Giragast", R.drawable.giragast0, 223, 63, 160, 110, R.drawable.dark, R.drawable.magic),
            new Monster("Gravoid", R.drawable.gravoid0, R.drawable.gravoid1, R.drawable.gravoid2, R.drawable.gravoid3, 220, 53, 185, 120,290,104,244,369,133,310,924,1302,777, R.drawable.earth, R.drawable.metal),
            new Monster("Light Sphinx", R.drawable.lightsphinx0, 175, 77, 160, 110, R.drawable.earth, R.drawable.light),
            new Monster("Panda", R.drawable.panda0,R.drawable.panda1,R.drawable.panda2,R.drawable.panda3, 190, 56, 200, 100,209,91,220,266,116,280,665,1139,700, R.drawable.nature),
            new Monster("Rockilla", R.drawable.rockilla0, 175, 71, 175, 100, R.drawable.earth),
            new Monster("Thunder Eagle", R.drawable.thundereagle0,R.drawable.thundereagle1,R.drawable.thundereagle2,R.drawable.thundereagle3, 175, 50, 250, 100,192,81,275,244,104,350,612,1017,875, R.drawable.thunder),
            new Monster("Turtle", R.drawable.turtle0, 200, 56, 200, 100, R.drawable.water),
            new Monster("Tyrannoking", R.drawable.tyrannoking0,R.drawable.tyrannoking1,R.drawable.tyrannoking2,R.drawable.tyrannoking3, 230, 50, 175, 100,253,81,192,322,104,244,805,1017,612, R.drawable.dark),
    };
}
