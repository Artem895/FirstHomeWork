package com.netschool;

import java.util.Arrays;

public class Books {
    private String name;
    private Author[] authors=new Author[20];
    private double price;
    private int qty=0;

    public Books(String name , Author[] authors, double price, int qty) {
        this.name=name;
        this.price=price;
        this.qty=qty;
        this.authors=authors;
    }

    public void getAuthors() {
        for (Author a:authors){
            System.out.println(a);
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getAuthorsName(){
        String res="AuthorsNames: ";
        for (Author a: authors){
            res+=(a.getName()+" ");
        }
        return res;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
