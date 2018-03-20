package fr.wildcodeschool.monsterlegends;

import android.widget.Filter;

import java.util.ArrayList;

public class CustomFilter extends Filter {
    private ArrayList<Monster> filterList;
    private GridAdapter adapter;

    public CustomFilter(ArrayList<Monster> filterList, GridAdapter adapter) {
        this.filterList = filterList;
        this.adapter = adapter;
    }

    /**
     * Création de la searchview qui va nous permettre de chercher un monstre par son nom
     * La searchview créait une nouvelle liste de monstres en les filtrant
     */

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results = new FilterResults();

        if (constraint != null && constraint.length() > 0) {
            constraint = constraint.toString().toUpperCase();
            ArrayList<Monster> filteredMonters = new ArrayList<>();

            for (int i = 0; i < filterList.size(); i++) {
                if (filterList.get(i).getName().toUpperCase().contains(constraint)) {
                    filteredMonters.add(filterList.get(i));
                }
            }

            results.count = filteredMonters.size();
            results.values = filteredMonters;
        } else {
            results.count = filterList.size();
            results.values = filterList;
        }
        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
        adapter.setMonsters((ArrayList<Monster>) results.values);
        adapter.notifyDataSetChanged();
    }
}
