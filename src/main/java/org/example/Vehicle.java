package org.example;

//Parent Class
class Vehicle {
    protected String brand = "Generic Vehicle";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

// Child class Car
class Car extends Vehicle {
    private String modelName = "Mustang";

    public void display() {
        System.out.println("I am a " + brand + " " + modelName);
    }
}

// Child Class Bike
class Bike extends Vehicle {
    public void ringBell() {
        System.out.println("Ring, ring!");
    }
}

