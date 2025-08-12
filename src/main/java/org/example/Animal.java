package org.example;

abstract class Animal {
    public void breathe() {
        System.out.println("Inhale... Exhale...");
    }

    abstract void makeSound();
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}
