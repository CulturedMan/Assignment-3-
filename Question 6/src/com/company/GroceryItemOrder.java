package com.company;

public class GroceryItemOrder {

    String  Name;
    int Quantity;
    double PricePerUnit;

    public GroceryItemOrder(String name, double pricePerUnit) {
        Name = name;
        PricePerUnit = pricePerUnit;
    }

    public double getCost()
    {
        double Cost= PricePerUnit*Quantity;
        return Cost;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
