package com.company;

public class Main {

    public static void main(String[] args)
    {
        GroceryList x= new GroceryList();

        for ( int i=1;i<=5;i++)
        {
            String Name= "Item"+i;
            GroceryItemOrder y= new GroceryItemOrder(Name,i);
            y.setQuantity(i);
            x.add(y);

        }

        System.out.println("Total Costs of items= "+x.getTotalCost());
    }
}
