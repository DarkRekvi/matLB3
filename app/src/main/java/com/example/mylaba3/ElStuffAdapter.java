package com.example.mylaba3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ElStuffAdapter extends ArrayAdapter<ElStuff> {
    private LayoutInflater inflater;
    private int layout;
    private List<ElStuff> elStuffs;
    public ElStuffAdapter(Context context, int resource, List<ElStuff> elStuffs) {
        super(context, resource, elStuffs);
        this.elStuffs = elStuffs;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        TextView nameView = view.findViewById(R.id.name);
        TextView typeView = view.findViewById(R.id.type);
        TextView fromView = view.findViewById(R.id.countryFrom);

        ElStuff state = elStuffs.get(position);

        nameView.setText(state.getName());
        typeView.setText(state.getType());
        fromView.setText(state.getCountryFrom());

        return view;
    }
}
