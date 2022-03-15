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
        Triangle triangle=new Triangle(new MyPoint(4,3),new MyPoint(3,4),new MyPoint(0,0));
        Triangle triangle1=new Triangle(2,3,4,5,6,5);
        System.out.println(triangle.getType());
        System.out.println(triangle1.getType());



    }
}
