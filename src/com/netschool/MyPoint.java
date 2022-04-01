package com.netschool;

import java.util.Objects;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] myarray = {x,y};
        return myarray;
    }
    public void  setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    public double distance(int x,int y){
        return Math.sqrt(Math.pow((x-this.x),2)+Math.pow((y-this.y),2));
    }
    public double distance(MyPoint p){
        return Math.sqrt(Math.pow((p.getX()-this.x),2)+Math.pow((p.getY()-this.y),2));
    }
    public double distance(){
        return Math.sqrt(Math.pow((0-this.x),2)+Math.pow((0-this.y),2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPoint point = (MyPoint) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
