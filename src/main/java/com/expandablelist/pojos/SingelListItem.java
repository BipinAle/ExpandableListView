package com.expandablelist.pojos;

import java.util.ArrayList;

/**
 * Created by dellxps on 2/17/2017.
 */

public class SingelListItem {

    String titles;
    ArrayList<String> items;

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    public String getTitle() {
        return titles;
    }

    public void setTitle(String titles) {
        this.titles = titles;
    }


}
