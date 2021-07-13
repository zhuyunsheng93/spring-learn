package com.example.springlearn.demo4;

public class Employee {
    private String name;
    private Car car;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", car2=" + car + "]";
    }
}
