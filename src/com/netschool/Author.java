package com.netschool;

import java.util.Objects;

public class Author {
    private String name;
    private String email;
    private char gender ;

    public Author(String name,String email, char gender) {
        this.name=name;
        this.email=email;
        this.gender=gender;

    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return gender == author.gender && Objects.equals(this.name, author.name) && Objects.equals(this.email, author.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.email, this.gender);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
