package fr.wildcodeschool.monsterlegends;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    private final Context mContext;
    private final Monster[] monsters;

    //Constructeur de la class GridAdapter

    public GridAdapter (Context context, Monster[] monsters) {
        this.mContext = context;
        this.monsters = monsters;
    }

    //Methode obligatoire qui sont dans la classe BaseAdapter
    @Override
    public int getCount(){
        return monsters.length;
    }

    @Override
    public long getItemId (int position) {
        return 0;
    }

    @Override
    public Object getItem (int position) {
        return null;
    }

    //Partie sur laquelle on agit
    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        final Monster monster = monsters[position];

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.grid_layout, null);
        }

        // different elements dans le miniature.
        final ImageView monsterImg = convertView.findViewById(R.id.imgLv1);
        final TextView monsterName = convertView.findViewById(R.id.monster_name);
        final ImageView elementLeft = convertView.findViewById(R.id.element_Left);
        final ImageView elementCenter= convertView.findViewById(R.id.element_Center);
        final ImageView elementRight = convertView.findViewById(R.id.element_Right);

        //Appel du contructeur pour realiser le miniature.
        monsterName.setText(monster.getName());
        monsterImg.setImageResource(monster.getImage1());
        elementCenter.setImageResource(monster.getElement2());
        elementLeft.setImageResource(monster.getElement1());
        elementRight.setImageResource(monster.getElement3());

        //On stock les données get dans une variable.
        final String monster_name = monster.getName();

        final int monsterImage = monster.getImage0();
        final int monsterImage1 = monster.getImage1();
        final int monsterImage4 = monster.getImage4();
        final int monsterImage25 = monster.getImage25();


        final int eltLeft = monster.getElement1();
        final int eltCenter = monster.getElement2();
        final int eltRight = monster.getElement3();

        /** On convertit les int en string */

        final String life = String.valueOf(monster.getLife());
        final String power = String.valueOf(monster.getPower());
        final String speed = String.valueOf(monster.getSpeed());
        final String stamina = String.valueOf(monster.getStamina());

        //on cre le Bundle qui sert à stocker une image, car image ne se put-extra pas.
        final Bundle bundleImg0 = new Bundle();

        final Bundle bundleImg1 = new Bundle();
        final Bundle bundleImg4 = new Bundle();
        final Bundle bundleImg25 = new Bundle();
        final Bundle bundle2 = new Bundle();
        final Bundle bundle3 = new Bundle();
        final Bundle bundle4 = new Bundle();

        //le set on click quand on clic sur l'image.
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MonsterActivity.class);

                bundleImg0.putInt("monsterImg0", monsterImage);
                bundleImg1.putInt("monsterImg1", monsterImage1);
                bundleImg4.putInt("monsterImg4", monsterImage4);
                bundleImg25.putInt("monsterImg25", monsterImage25);
                bundle2.putInt("elt1", eltLeft);
                bundle3.putInt("elt2", eltCenter);
                bundle4.putInt("elt3", eltRight);

                intent.putExtras(bundleImg0);
                intent.putExtras(bundleImg1);
                intent.putExtras(bundleImg4);
                intent.putExtras(bundleImg25);
                intent.putExtras(bundle2);
                intent.putExtras(bundle3);
                intent.putExtras(bundle4);

                intent.putExtra("monsterName", monster_name);
                intent.putExtra("monsterLife", life);
                intent.putExtra("monsterPower", power);
                intent.putExtra("monsterSpeed", speed);
                intent.putExtra("monsterStamina", stamina);


                mContext.startActivity(intent);
            }
        });
        return convertView;
    }
}
