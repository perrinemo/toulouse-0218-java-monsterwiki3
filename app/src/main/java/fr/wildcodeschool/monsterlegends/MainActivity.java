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
            new Monster("Arch Knight", R.drawable.archknight0, 200, 56, 200, 110, R.drawable.dark, R.drawable.magic),

    };
}
