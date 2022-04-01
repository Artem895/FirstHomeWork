package com.netschool;

import java.util.Arrays;
import java.util.Objects;

public class Books {
    private String name;
    private Author[] authors=new Author[20];
    private double price;
    private int qty=0;

    public Books(String name, double price, int qty, Author... authors) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Double.compare(books.price, this.price) == 0 && this.qty == books.qty && Objects.equals(this.name, books.name) && Arrays.equals(this.authors, books.authors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(this.name, this.price, this.qty);
        result = 31 * result + Arrays.hashCode(this.authors);
        return result;
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
