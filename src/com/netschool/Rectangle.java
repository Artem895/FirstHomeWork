package com.netschool;

import java.util.Objects;

public class Rectangle {
    private float length= 1.0F;
    private float width= 1.0F;

    public Rectangle() {
    }

    public Rectangle(float length, float width){
        this.length=length;
        this.width=width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*length+2*width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Float.compare(rectangle.length, this.length) == 0 && Float.compare(rectangle.width, this.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.length, this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
