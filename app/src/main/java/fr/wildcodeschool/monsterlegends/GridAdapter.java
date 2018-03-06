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
        final ImageView monster1 = convertView.findViewById(R.id.imgLv1);
        final TextView monsterName = convertView.findViewById(R.id.monster_name);
        final ImageView elementLeft = convertView.findViewById(R.id.element_Left);
        final ImageView elementCenter= convertView.findViewById(R.id.element_Center);
        final ImageView elementRight = convertView.findViewById(R.id.element_Right);

        //Appel du contructeur pour realiser le miniature.
        monsterName.setText(monster.getName());
        monster1.setImageResource(monster.getImage());
        elementCenter.setImageResource(monster.getElement1());
        elementLeft.setImageResource(monster.getElement1());
        elementRight.setImageResource(monster.getElement2());

        //On stock les données get dans une variable.
        String monster_name = monster.getName();
        int monsterImage = monster.getImage();
        int eltLeft = monster.getElement1();
        int eltCenter = monster.getElement1();
        int eltRight = monster.getElement2();

        //on cre le Bundle qui sert à stocker une image, car image ne se put-extra pas.
        final Bundle bundle = new Bundle();

        //le set on click quand on clic sur l'image.
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MonsterActivity.class);
                mContext.startActivity(intent);
            }
        });
        return convertView;
    }
}
