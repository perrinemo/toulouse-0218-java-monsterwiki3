package fr.wildcodeschool.monsterlegends;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.List;
import java.util.Vector;

public class MonsterActivity extends FragmentActivity {

    private PagerAdapter scrollAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster);

        List fragments = new Vector();

        /** Ajout des fragments dans le scrollview */

        fragments.add(Fragment.instantiate(this, MonsterLevel0.class.getName()));
        fragments.add(Fragment.instantiate(this, MonsterLevel1.class.getName()));
        fragments.add(Fragment.instantiate(this, MonsterLevel4.class.getName()));
        fragments.add(Fragment.instantiate(this, MonsterLevel25.class.getName()));

        this.scrollAdapter = new ScrollAdapter(super.getSupportFragmentManager(), fragments);

        ViewPager pager = super.findViewById(R.id.viewpager);
        pager.setAdapter(this.scrollAdapter);
    }
}
