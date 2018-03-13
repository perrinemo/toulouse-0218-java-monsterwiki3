package fr.wildcodeschool.monsterlegends;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static fr.wildcodeschool.monsterlegends.GridAdapter.EXTRA_MONSTER;
import static fr.wildcodeschool.monsterlegends.GridAdapter.EXTRA_MONSTER_2;

public class MonsterLevel0 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.monster_page, container, false);

        Monster monster = getActivity().getIntent().getExtras().getParcelable(EXTRA_MONSTER);
        Monster monster2 = getActivity().getIntent().getExtras().getParcelable(EXTRA_MONSTER_2);


        /** Récupère les id du xml */
        TextView name = view.findViewById(R.id.monsterName);
        TextView lvl = view.findViewById(R.id.level);
        TextView life = view.findViewById(R.id.textLife);
        TextView power = view.findViewById(R.id.textForce);
        TextView speed = view.findViewById(R.id.textSpeed);
        TextView stamina = view.findViewById(R.id.textStamina);
        ImageView avatar = view.findViewById(R.id.monsterAvatar);
        final ImageView eltLeft = view.findViewById(R.id.elementLeft);
        ImageView eltCenter = view.findViewById(R.id.elementCenter);
        ImageView eltRight = view.findViewById(R.id.elementRight);

        ImageView imgLife = view.findViewById(R.id.imgLife);
        ImageView imgSpeed = view.findViewById(R.id.imgSpeed);
        ImageView imgStamina = view.findViewById(R.id.imgStamina);
        ImageView imgPower = view.findViewById(R.id.imgForce);

        imgLife.setImageResource(R.drawable.life);
        imgSpeed.setImageResource(R.drawable.speed);
        imgStamina.setImageResource(R.drawable.stamina);
        imgPower.setImageResource(R.drawable.power);

        name.setText(monster.getName());
        lvl.setText(R.string.level0);
        life.setText(String.valueOf(monster.getLife0()));
        speed.setText(String.valueOf(monster.getSpeed0()));
        power.setText(String.valueOf(monster.getPower0()));
        stamina.setText(String.valueOf(monster.getStamina()));
        eltLeft.setImageResource(monster.getElement1());
        eltCenter.setImageResource(monster2.getElement2());
        eltRight.setImageResource(monster.getElement3());
        avatar.setImageResource(monster.getImage0());

        setFont(name, "GROBOLD.ttf");

        return view;
    }

    public void setFont(TextView textView, String fontName) {
        if (fontName != null) {
            try {
                Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/" + fontName);
                textView.setTypeface(typeface);
            } catch (Exception e) {
                Log.e("FONT", fontName + " not found", e);
            }
        }
    }
}
