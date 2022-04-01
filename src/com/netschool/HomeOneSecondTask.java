package com.netschool;

public class HomeOneSecondTask {
    public static void main(String[] args){
       /* int name=10;
        Rectangle rectangle= new Rectangle(5,6);
        Employee employee = new Employee(1,"Hector","Wiliams",100);
        System.out.println(rectangle);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(employee.getName());
        System.out.println(employee.raiseSalary(10));
        System.out.println(employee.getAnnualSalary());
        Books book = new Books("Harry Potter",new Author[]{new Author("J.Rouling","@gdgdg",'f'),new Author("TET","@ewge",'m')},100.0,5 );
        book.getAuthors();
        System.out.println(book.getAuthorsName());*/
        Books book = new Books("Harry",100,5,new Author("jr","@good",'f'),new Author("ted","@fag",'m'));
        System.out.println(book);
        Triangle triangle1= new Triangle(new MyPoint(4,5),new MyPoint(5,5),new MyPoint(6,6));
        Triangle triangle2= new Triangle(new MyPoint(4,5),new MyPoint(5,5),new MyPoint(6,6));
        System.out.println(triangle1.equals(triangle2));
        System.out.println(triangle1.hashCode());
        System.out.println(triangle2.hashCode());



    }
}
