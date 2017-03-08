package com.expandablelist.model;

import java.util.ArrayList;

/**
 * Created by dellxps on 2/20/2017.
 */

public class GetData {

    private ArrayList<ArrayList<String>> finalItem = new ArrayList<>();

    private ArrayList<String> football = new ArrayList<>();
    private ArrayList<String> volleyball = new ArrayList<>();
    private ArrayList<String> cricket = new ArrayList<>();
    private ArrayList<String> Basketball = new ArrayList<>();
    private ArrayList<String> Hockey = new ArrayList<>();


    private ArrayList<String> titles = new ArrayList<>();

    public ArrayList<String> getTitle() {

        titles.add("Football");
        titles.add("Volleyball");
        titles.add("Cricket");
        titles.add("Basketball");
        titles.add("Hockey");
        return titles;

    }

    public ArrayList<ArrayList<String>> getData() {
        football.add("Football 1");
        football.add("Football 2");
        football.add("Football 3");
        football.add("Football 4");

        volleyball.add("Volleyball 1");
        volleyball.add("Volleyball 2");
        volleyball.add("Volleyball 3");
        volleyball.add("Volleyball 4");

        cricket.add("Cricket 1");
        cricket.add("Cricket 2");
        cricket.add("Cricket 3");
        cricket.add("Cricket 4");

        Basketball.add("Basketball 1");
        Basketball.add("Basketball 2");
        Basketball.add("Basketball 3");
        Basketball.add("Basketball 4");


//        Toast.makeText(this, "items" + football, Toast.LENGTH_SHORT).show();//football ko data sabai huncha


        finalItem.add(football);
        finalItem.add(volleyball);
        finalItem.add(cricket);
        finalItem.add(Basketball);
        finalItem.add(Hockey);


        return finalItem;


    }
}
