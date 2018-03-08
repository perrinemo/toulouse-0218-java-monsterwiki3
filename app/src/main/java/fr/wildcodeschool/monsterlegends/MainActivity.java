package fr.wildcodeschool.monsterlegends;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GridView gridView = findViewById(R.id.gridview);
        GridAdapter gridAdapter = new GridAdapter(this, monsters);
        gridView.setAdapter(gridAdapter);

    }

    /** Création et remplissage du tableau de Monster */

    private Monster[] monsters = {
            new Monster("Arch Knight", R.drawable.archknight0, R.drawable.archknight1, R.drawable.archknight2, R.drawable.archknight3, 200, 56, 200, 140, R.drawable.legend, R.drawable.light),
            new Monster("Bonbon", R.drawable.bonbon0, R.drawable.bonbon1, R.drawable.bonbon2, R.drawable.bonbon3, 175, 63, 200, 120, R.drawable.thunder, R.drawable.earth),
            new Monster("Electrex", R.drawable.electrex0,R.drawable.electrex1,R.drawable.electrex2,R.drawable.electrex3,170,63,225,110,R.drawable.earth,R.drawable.thunder),
            new Monster("Fire Lion", R.drawable.firelion0, R.drawable.firelion1, R.drawable.firelion2, R.drawable.firelion3, 220, 50, 175, 100, R.drawable.fire),
            new Monster("Genie", R.drawable.genie0, R.drawable.genie1, R.drawable.genie2, R.drawable.genie3, 190, 50, 250, 100, R.drawable.magic),
            new Monster("Giragast", R.drawable.giragast0, R.drawable.giragast1, R.drawable.giragast2, R.drawable.giragast3, 223, 63, 160, 110, R.drawable.dark, R.drawable.magic),
            new Monster("Gravoid", R.drawable.gravoid0, R.drawable.gravoid1, R.drawable.gravoid2, R.drawable.gravoid3, 220, 53, 185, 120, R.drawable.earth, R.drawable.metal),
            new Monster("Light Sphinx", R.drawable.lightsphinx0,R.drawable.lightsphinx1, R.drawable.lightsphinx2,R.drawable.lightsphinx3, 175, 77, 160, 110, R.drawable.earth, R.drawable.light),
            new Monster("Panda", R.drawable.panda0,R.drawable.panda1,R.drawable.panda2,R.drawable.panda3, 190, 56, 200, 100, R.drawable.nature),
            new Monster("Rabish", R.drawable.rabbish0, R.drawable.rabbish1,R.drawable.rabbish2,R.drawable.rabbish3,212,71,227,146, R.drawable.legend,R.drawable.light),
            new Monster("Rockilla", R.drawable.rockilla0, R.drawable.rockilla1, R.drawable.rockilla2,R.drawable.rockilla3, 175, 71, 175, 100, R.drawable.earth),
            new Monster("Scorchpeg", R.drawable.scorchpeg0,R.drawable.scorchpeg1,R.drawable.scorchpeg2,R.drawable.scorchpeg3,200,56,200,130, R.drawable.fire,R.drawable.light),
            new Monster("Thunder Eagle", R.drawable.thundereagle0,R.drawable.thundereagle1,R.drawable.thundereagle2,R.drawable.thundereagle3, 175, 50, 250, 100, R.drawable.thunder),
            new Monster("Turtle", R.drawable.turtle0, R.drawable.turtle1, R.drawable.turtle2,R.drawable.turtle3, 200, 56, 200, 100, R.drawable.water),
            new Monster("Tyrannoking", R.drawable.tyrannoking0,R.drawable.tyrannoking1,R.drawable.tyrannoking2,R.drawable.tyrannoking3, 230, 50, 175, 100, R.drawable.dark),

    };


}
