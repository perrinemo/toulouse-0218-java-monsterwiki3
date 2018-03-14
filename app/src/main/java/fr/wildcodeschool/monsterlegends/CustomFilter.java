package fr.wildcodeschool.monsterlegends;

import android.widget.Filter;

import java.util.ArrayList;

/**
 * Created by perrine on 14/03/18.
 */

public class CustomFilter extends Filter {
    private ArrayList<Monster> filterList;
    private GridAdapter adapter;

    public CustomFilter(ArrayList<Monster> filterList, GridAdapter adapter) {
        this.filterList = filterList;
        this.adapter = adapter;
    }

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
        adapter.monsters = (ArrayList<Monster>) results.values;
        adapter.notifyDataSetChanged();
    }
}
