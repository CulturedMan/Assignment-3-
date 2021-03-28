package com.company;

public class Triangle extends GeometricObject {

    double SideA;
    double SideB;
    double SideC;

    public Triangle(String color, Boolean isFilled, double sideA, double sideB, double sideC) {
        super(color, isFilled);
        SideA = sideA;
        SideB = sideB;
        SideC = sideC;
    }

    public double getSideA() {
        return SideA;
    }

    public void setSideA(double sideA) {
        SideA = sideA;
    }

    public double getSideB() {
        return SideB;
    }

    public void setSideB(double sideB) {
        SideB = sideB;
    }

    public double getSideC() {
        return SideC;
    }

    public void setSideC(double sideC) {
        SideC = sideC;
    }

    public double Area()
    {
        double P=SideA+SideB+SideC;
        double area= Math.sqrt(P*(P-SideA)*(P-SideB)*(P*SideC));
        return area;
    }

    public double Permiter()
    {
        double Permiter=SideA+SideB+SideC;
        return Permiter;
    }

    @Override
    public String toString()
    {
        double A= Area();
        double P= Permiter();
        return  "\nArea= " + A+
                "\nPermiter=" + P +
                "\nColor=" + getColor() +
                "\nIs it filled? " + getFilled();
    }


}
