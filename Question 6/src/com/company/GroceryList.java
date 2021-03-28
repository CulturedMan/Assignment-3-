package com.company;

import java.util.ArrayList;

public class GroceryList {

    ArrayList<GroceryItemOrder> list ;

    public GroceryList() {
        this.list= new ArrayList<>();
    }

    public void add(GroceryItemOrder x)
    {
        if(list.size() < 10)
            list.add(x);
    }

    public double getTotalCost()
    {
        double Cost= 0;
        for (GroceryItemOrder x : list) {
            Cost += x.getCost();
        }
        return Cost;
    }

}
