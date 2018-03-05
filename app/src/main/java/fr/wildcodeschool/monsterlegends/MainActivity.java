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

        Button mbtn = findViewById(R.id.button);

        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MonsterActivity.class);

                intent.putExtra(MainActivity.monsterName, "Arch Knight");

                startActivity(intent);
            }
        });
    }
}
