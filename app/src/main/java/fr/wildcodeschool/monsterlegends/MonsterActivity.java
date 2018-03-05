package fr.wildcodeschool.monsterlegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MonsterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster);

        TextView mMonsterName = findViewById(R.id.monsterName);

        Intent intent = getIntent();
        String monsterName = intent.getStringExtra(MainActivity.monsterName);

        mMonsterName.setText(monsterName);
    }
}
