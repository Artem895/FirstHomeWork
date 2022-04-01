package com.netschool;

import java.util.Objects;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id,String firstName,String lastName,int salary) {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        //return ("FirstName: "+firstName+" LastName: "+lastName);
        return String.format("FirstName: %s ,LastName: %s",firstName,lastName);

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percant){
        this.salary+=(this.salary/100)*percant;
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return this.id == employee.id && this.salary == employee.salary && Objects.equals(this.firstName, employee.firstName) && Objects.equals(this.lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName, this.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
