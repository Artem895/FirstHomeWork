package com.netschool;

import java.util.Objects;

public class Triangle {
    private MyPoint vone;
    private MyPoint vtwo;
    private MyPoint vthree;

    public Triangle(MyPoint vone,MyPoint vtwo,MyPoint vthree) {
        this.vone =  vone;
        this.vtwo =  vtwo;
        this.vthree =  vthree;
    }

    public Triangle(int x1,int y1,int x2,int y2,int x3,int y3) {
        this.vone=new MyPoint(x1,y1);
        this.vtwo=new MyPoint(x2,y2);
        this.vthree=new MyPoint(x3,y3);
    }
    public double getPerimeter(){
        return vone.distance(vtwo)+vtwo.distance(vthree)+vthree.distance(vone);
    }
    public String getType(){
        String res="Type: ";
        if(vone.distance(vtwo)==vtwo.distance(vthree)||vone.distance(vtwo)==vthree.distance(vone)||vtwo.distance(vthree)==vthree.distance(vone)){
            res+="Равнобедренный";
        }
        else if(vone.distance(vtwo)==vtwo.distance(vthree)&&vone.distance(vtwo)==vthree.distance(vone)){
            res+="Равносторонний";
        }
        else {
            res+="Разносторонний";
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(vone, triangle.vone) && Objects.equals(vtwo, triangle.vtwo) && Objects.equals(vthree, triangle.vthree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vone, vtwo, vthree);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "vone=" + vone +
                ", vtwo=" + vtwo +
                ", vthree=" + vthree +
                '}';
    }
}
