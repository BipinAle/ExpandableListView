package com.expandablelist.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.expandablelist.R;

import java.util.ArrayList;

/**
 * Created by dellxps on 2/17/2017.
 */

public class ExpandableListAdapter extends BaseExpandableListAdapter {

    private final ArrayList<String> titles;
    ArrayList<ArrayList<String>> data = new ArrayList<>();
    Context context;

    public ExpandableListAdapter(ArrayList<ArrayList<String>> data, ArrayList<String> titles, Context context) {
        this.data = data;
        this.context = context;
        this.titles = titles;
    }



    @Override
    public int getGroupCount() {
        return titles.size();
    }

    //i=group position
    //i1=child position
    //b=is last child view(child)
    //b=is expanded(parent)
    @Override
    public int getChildrenCount(int i) {
        ArrayList<String> item = data.get(i);
        return item.size();

    }

    @Override
    public Object getGroup(int i) {
         return titles.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        ArrayList<String> item = data.get(i);
        return item.get(i1);

    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String title = (String) getGroup(i);

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.exp_list_group, null);
        TextView textView = (TextView) view.findViewById(R.id.group_title);
        textView.setText(title);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {

        String items = (String) getChild(i, i1);
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.exp_list_item, null);
        TextView textView = (TextView) view.findViewById(R.id.expanded_list_item);
        textView.setText(items);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }

}
