package fr.wildcodeschool.monsterlegends;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static fr.wildcodeschool.monsterlegends.GridAdapter.EXTRA_MONSTER;
import static fr.wildcodeschool.monsterlegends.GridAdapter.EXTRA_MONSTER_2;

public class MonsterLevel4 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.monster_page, container, false);

        Monster monster = getActivity().getIntent().getExtras().getParcelable(EXTRA_MONSTER);
        Monster monster2 = getActivity().getIntent().getExtras().getParcelable(EXTRA_MONSTER_2);

        /** Récupère les id du xml */
        TextView name = view.findViewById(R.id.monster_name);
        TextView lvl = view.findViewById(R.id.level);
        TextView life = view.findViewById(R.id.text_life);
        TextView power = view.findViewById(R.id.text_force);
        TextView speed = view.findViewById(R.id.text_speed);
        TextView stamina = view.findViewById(R.id.text_stamina);
        ImageView avatar = view.findViewById(R.id.monster_avatar);
        ImageView eltLeft = view.findViewById(R.id.element_left);
        ImageView eltCenter = view.findViewById(R.id.element_center);
        ImageView eltRight = view.findViewById(R.id.element_right);

        ImageView imgLife = view.findViewById(R.id.img_life);
        ImageView imgSpeed = view.findViewById(R.id.img_speed);
        ImageView imgStamina = view.findViewById(R.id.img_stamina);
        ImageView imgPower = view.findViewById(R.id.img_force);

        imgLife.setImageResource(R.drawable.life);
        imgSpeed.setImageResource(R.drawable.speed);
        imgStamina.setImageResource(R.drawable.stamina);
        imgPower.setImageResource(R.drawable.power);

        name.setText(monster.getName());
        lvl.setText(R.string.level4);
        life.setText(String.valueOf(monster.getLife0() * 2 + 57));
        speed.setText(String.valueOf(monster.getSpeed0() * 3 - 42));
        power.setText(String.valueOf(monster.getPower0() * 2 + 62));
        stamina.setText(String.valueOf(monster.getStamina()));
        eltLeft.setImageResource(monster.getElement1());
        eltCenter.setImageResource(monster2.getElement2());
        eltRight.setImageResource(monster.getElement3());
        avatar.setImageResource(monster.getImage4());

        Helper.setFont(name, "GROBOLD.ttf");

        return view;
    }
}

