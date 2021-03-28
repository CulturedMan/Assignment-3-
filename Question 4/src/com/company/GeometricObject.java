package com.company;

public abstract class GeometricObject {

    String Color;
    Boolean IsFilled;

    public GeometricObject() {
    }

    public GeometricObject(String color, Boolean isFilled) {
        Color = color;
        IsFilled = isFilled;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Boolean getFilled() {
        return IsFilled;
    }

    public void setFilled(Boolean filled) {
        IsFilled = filled;
    }


}
