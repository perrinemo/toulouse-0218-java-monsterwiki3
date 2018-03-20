package fr.wildcodeschool.monsterlegends;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter implements Filterable {

    public static String EXTRA_MONSTER = "EXTRA_MONSTER";
    public static String EXTRA_MONSTER_2 = "EXTRA_MONSTER_2";
    private final Context mContext;
    private ArrayList<Monster> monsters;
    private ArrayList<Monster> filterList;
    private CustomFilter filter;

    /**
     * Constructeur de la class GridAdapter
     */

    public GridAdapter(Context context, ArrayList<Monster> monsters) {
        this.mContext = context;
        this.monsters = monsters;
        this.filterList = monsters;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }

    /**
     * Methodes de la classe BaseAdapter
     */

    @Override
    public int getCount() {
        return monsters.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return monsters.get(position);
    }

    /**
     * Méthode qui va afficher le gridview
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Monster monster = monsters.get(position);

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.grid_layout, null);
        }

        /** On récupère les id du grid_layout pour les mettre dans des variables */

        final ImageView gridMonsterImg = convertView.findViewById(R.id.img_lv1);
        final TextView gridMonsterName = convertView.findViewById(R.id.monster_name);
        final ImageView gridElementLeft = convertView.findViewById(R.id.element_left);
        final ImageView gridElementCenter = convertView.findViewById(R.id.element_center);
        final ImageView gridElementRight = convertView.findViewById(R.id.element_right);

        /** On stocke les données du Monster construit dans des variables
         * Et on convertit les données de type int (les stats) en type String
         * */

        final String monster_name = monster.getName();

        final int monsterImage = monster.getImage0();
        final int monsterImage1 = monster.getImage1();
        final int monsterImage4 = monster.getImage4();
        final int monsterImage25 = monster.getImage25();

        final int eltLeft = monster.getElement1();
        final int eltCenter = monster.getElement2();
        final int eltRight = monster.getElement3();

        final int life0 = monster.getLife0();
        final int power0 = monster.getPower0();
        final int speed0 = monster.getSpeed0();

        final int stamina = monster.getStamina();

        /** On envoie les données du Monster construit dans le layout
         * grâce aux getters de la classs Monster
         * */

        gridMonsterName.setText(monster_name);
        gridMonsterImg.setImageResource(monsterImage1);
        gridElementCenter.setImageResource(eltCenter);
        gridElementLeft.setImageResource(eltLeft);
        gridElementRight.setImageResource(eltRight);


        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /** On créait 2 modèles de monstre (un avec un élément, et un avec deux éléments) */

                Monster monster = new Monster(monster_name, monsterImage, monsterImage1, monsterImage4, monsterImage25, power0, life0, speed0, stamina, eltLeft, eltRight);
                Monster monster2 = new Monster(monster_name, monsterImage, monsterImage1, monsterImage4, monsterImage25, power0, life0, speed0, stamina, eltCenter);

                Intent intent = new Intent(mContext, MonsterActivity.class);

                /** On envoie les deux modèles de monstre */

                intent.putExtra(EXTRA_MONSTER, monster);
                intent.putExtra(EXTRA_MONSTER_2, monster2);

                mContext.startActivity(intent);
            }
        });


        return convertView;
    }

    @Override
    public Filter getFilter() {
        if (filter == null) {
            filter = new CustomFilter(filterList, this);
        }
        return filter;
    }
}
