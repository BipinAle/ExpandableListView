package com.expandablelist.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ExpandableListView;

import com.expandablelist.R;
import com.expandablelist.adapters.ExpandableListAdapter;
import com.expandablelist.model.GetData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> titles;

    ArrayList<ArrayList<String>> data;
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    GetData getData;
    int previous = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData = new GetData();

        titles = getData.getTitle();
        data = getData.getData();

        expandableListView = (ExpandableListView) findViewById(R.id.expandable_listview);
        expandableListAdapter = new ExpandableListAdapter(data, titles, this);
        expandableListView.setAdapter(expandableListAdapter);

        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int width = displaymetrics.widthPixels;

        expandableListView.setIndicatorBounds(width - GetDipsFromPixel(45), width - GetDipsFromPixel(15));

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
                return false;
            }
        });

        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long l) {
                return false;
            }
        });

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {
                if (previous != i) {
                    expandableListView.collapseGroup(previous);
                    previous = i;
                }

            }
        });
    }

    //Convert pixel to dip
    public int GetDipsFromPixel(float pixels) {
        // Get the screen's density scale
        final float scale = getResources().getDisplayMetrics().density;
        // Convert the dps to pixels, based on density scale
        return (int) (pixels * scale + 0.5f);
    }
}
