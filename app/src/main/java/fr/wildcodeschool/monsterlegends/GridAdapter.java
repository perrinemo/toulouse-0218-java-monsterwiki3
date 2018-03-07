package fr.wildcodeschool.monsterlegends;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    private final Context mContext;
    private final Monster[] monsters;

    public static String EXTRA_AVATAR_0 = "EXTRA_AVATAR_0";
    public static String EXTRA_AVATAR_1 = "EXTRA_AVATAR_1";
    public static String EXTRA_AVATAR_4 = "EXTRA_AVATAR_4";
    public static String EXTRA_AVATAR_25 = "EXTRA_AVATAR_25";
    public static String EXTRA_ELT_1 = "EXTRA_ELT_1";
    public static String EXTRA_ELT_2 = "EXTRA_ELT_2";
    public static String EXTRA_ELT_3 = "EXTRA_ELT_3";
    public static String EXTRA_MONSTER_NAME = "EXTRA_MONSTER_NAME";
    public static String EXTRA_LIFE_0 = "EXTRA_LIFE_0";
    public static String EXTRA_LIFE_1 = "EXTRA_LIFE_1";
    public static String EXTRA_LIFE_4 = "EXTRA_LIFE_4";
    public static String EXTRA_LIFE_25 = "EXTRA_LIFE_25";
    public static String EXTRA_SPEED_0 = "EXTRA_SPEED_0";
    public static String EXTRA_SPEED_1 = "EXTRA_SPEED_1";
    public static String EXTRA_SPEED_4 = "EXTRA_SPEED_4";
    public static String EXTRA_SPEED_25 = "EXTRA_SPEED_25";
    public static String EXTRA_POWER_0 = "EXTRA_POWER_0";
    public static String EXTRA_POWER_1 = "EXTRA_POWER_1";
    public static String EXTRA_POWER_4 = "EXTRA_POWER_4";
    public static String EXTRA_POWER_25 = "EXTRA_POWER_25";
    public static String EXTRA_STAMINA = "EXTRA_STAMINA";

    /** Constructeur de la class GridAdapter */

    public GridAdapter (Context context, Monster[] monsters) {
        this.mContext = context;
        this.monsters = monsters;
    }

    /** Methodes de la classe BaseAdapter */

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

    /** Méthode qui va afficher le gridview */

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        final Monster monster = monsters[position];

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.grid_layout, null);
        }

        /** On récupère les id du grid_layout pour les mettre dans des variables */

        final ImageView gridMonsterImg = convertView.findViewById(R.id.imgLv1);
        final TextView gridMonsterName = convertView.findViewById(R.id.monster_name);
        final ImageView gridElementLeft = convertView.findViewById(R.id.element_Left);
        final ImageView gridElementCenter= convertView.findViewById(R.id.element_Center);
        final ImageView gridElementRight = convertView.findViewById(R.id.element_Right);



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

        final String life0 = String.valueOf(monster.getLife0());
        final String power0 = String.valueOf(monster.getPower0());
        final String speed0 = String.valueOf(monster.getSpeed0());

        final String life1 = String.valueOf(monster.getLife1());
        final String power1 = String.valueOf(monster.getPower1());
        final String speed1 = String.valueOf(monster.getSpeed1());

        final String life4 = String.valueOf(monster.getLife4());
        final String power4 = String.valueOf(monster.getPower4());
        final String speed4 = String.valueOf(monster.getSpeed4());

        final String life25 = String.valueOf(monster.getLife25());
        final String power25 = String.valueOf(monster.getPower25());
        final String speed25 = String.valueOf(monster.getSpeed25());

        final String stamina = String.valueOf(monster.getStamina());

        /** On envoie les données du Monster construit dans le layout
         * grâce aux getters de la classs Monster
         * */

        gridMonsterName.setText(monsterImage);
        gridMonsterImg.setImageResource(monsterImage);
        gridElementCenter.setImageResource(eltCenter);
        gridElementLeft.setImageResource(eltLeft);
        gridElementRight.setImageResource(eltRight);

        /** on créait les Bundle qui vont servir à stocker les images
         * pour pouvoir les passer dans le intent par la suite
         * */

        final Bundle bundleImg0 = new Bundle();
        final Bundle bundleImg1 = new Bundle();
        final Bundle bundleImg4 = new Bundle();
        final Bundle bundleImg25 = new Bundle();
        final Bundle bundleElt1 = new Bundle();
        final Bundle bundleElt2 = new Bundle();
        final Bundle bundleElt3 = new Bundle();

        /** On stocke les images dans les bundle */

        bundleImg0.putInt(EXTRA_AVATAR_0, monsterImage);
        bundleImg1.putInt(EXTRA_AVATAR_1, monsterImage1);
        bundleImg4.putInt(EXTRA_AVATAR_4, monsterImage4);
        bundleImg25.putInt(EXTRA_AVATAR_25, monsterImage25);
        bundleElt1.putInt(EXTRA_ELT_1, eltLeft);
        bundleElt2.putInt(EXTRA_ELT_2, eltCenter);
        bundleElt3.putInt(EXTRA_ELT_3, eltRight);


        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MonsterActivity.class);

                /** On envoie les images via putExtras
                 * et les String via putExtra */

                intent.putExtras(bundleImg0);
                intent.putExtras(bundleImg1);
                intent.putExtras(bundleImg4);
                intent.putExtras(bundleImg25);
                intent.putExtras(bundleElt1);
                intent.putExtras(bundleElt2);
                intent.putExtras(bundleElt3);

                intent.putExtra(EXTRA_MONSTER_NAME, monster_name);
                intent.putExtra(EXTRA_LIFE_0, life0);
                intent.putExtra(EXTRA_POWER_0, power0);
                intent.putExtra(EXTRA_SPEED_0, speed0);

                intent.putExtra(EXTRA_LIFE_1, life1);
                intent.putExtra(EXTRA_POWER_1, power1);
                intent.putExtra(EXTRA_SPEED_1, speed1);

                intent.putExtra(EXTRA_LIFE_4, life4);
                intent.putExtra(EXTRA_POWER_4, power4);
                intent.putExtra(EXTRA_SPEED_4, speed4);

                intent.putExtra(EXTRA_LIFE_25, life25);
                intent.putExtra(EXTRA_POWER_25, power25);
                intent.putExtra(EXTRA_SPEED_25, speed25);

                intent.putExtra(EXTRA_STAMINA, stamina);


                mContext.startActivity(intent);
            }
        });
        return convertView;
    }

}
