package fr.wildcodeschool.monsterlegends;

        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

public class MonsterLevel4 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.monster_page, container, false);

        /** Récupère les id du xml */
        TextView name = view.findViewById(R.id.monsterName);
        TextView lvl = view.findViewById(R.id.level);
        TextView life = view.findViewById(R.id.textLife);
        TextView power = view.findViewById(R.id.textForce);
        TextView speed = view.findViewById(R.id.textSpeed);
        TextView stamina = view.findViewById(R.id.textStamina);
        ImageView avatar = view.findViewById(R.id.monsterAvatar);
        ImageView eltLeft = view.findViewById(R.id.elementLeft);
        ImageView eltCenter = view.findViewById(R.id.elementCenter);
        ImageView eltRigth = view.findViewById(R.id.elementRight);

        ImageView imgLife = view.findViewById(R.id.imgLife);
        ImageView imgSpeed = view.findViewById(R.id.imgSpeed);
        ImageView imgStamina = view.findViewById(R.id.imgStamina);
        ImageView imgPower = view.findViewById(R.id.imgForce);


        /** On créait les bundle qui contiennent les images à venir */

        Bundle bundle1 = this.getActivity().getIntent().getExtras();
        Bundle bundle2 = this.getActivity().getIntent().getExtras();
        Bundle bundle3 = this.getActivity().getIntent().getExtras();
        Bundle bundle4 = this.getActivity().getIntent().getExtras();

        /** On récupère les images et les textes envoyés depuis GridAdapter */

        int monsterAvatar = bundle1.getInt("monsterImg4");
        int monsterElt1 = bundle2.getInt("elt1");
        int monsterElt2 = bundle3.getInt("elt2");
        int monsterElt3 = bundle4.getInt("elt3");

        String monsterName = getActivity().getIntent().getStringExtra("monsterName");
        String monsterLife = getActivity().getIntent().getStringExtra("monsterLife");
        String monsterSpeed = getActivity().getIntent().getStringExtra("monsterSpeed");
        String monsterPower = getActivity().getIntent().getStringExtra("monsterPower");
        String monsterStamina = getActivity().getIntent().getStringExtra("monsterStamina");

        /** On envoie les images et les textes récupérés dans nos id du xml */

        name.setText(monsterName);
        lvl.setText(R.string.level4);
        life.setText(monsterLife);
        power.setText(monsterPower);
        speed.setText(monsterSpeed);
        stamina.setText(monsterStamina);

        avatar.setImageResource(monsterAvatar);
        eltLeft.setImageResource(monsterElt1);
        eltCenter.setImageResource(monsterElt2);
        eltRigth.setImageResource(monsterElt3);

        imgLife.setImageResource(R.drawable.life);
        imgSpeed.setImageResource(R.drawable.speed);
        imgStamina.setImageResource(R.drawable.stamina);
        imgPower.setImageResource(R.drawable.power);


        return view;
    }

}

