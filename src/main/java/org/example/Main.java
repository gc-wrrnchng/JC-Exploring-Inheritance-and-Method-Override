package org.example;

public class Main {
    public static void main(String[] args) {

//        // 1. BASIC INHERITANCE: THE EXTENDS KEYWORD
//        Car myCar = new Car();
//        myCar.honk();
//        myCar.display();
//
//        // 1.1 MINI CHALLENGE
//        Bike myBike = new Bike();
//        System.out.print("Bicycle says: ");
//        myBike.honk();
//        System.out.print("Bicycle says: ");
//        myBike.ringBell();

//        // 2. ABSTRACT CLASSES: DEFINING A TEMPLATE
//        // Shape myShape = new Shape(); // Error since abstracts cannot be instantiated
//
//        Circle myCircle = new Circle();
//        System.out.println(myCircle.display());
//
//        Rectangle myRectangle = new Rectangle();
//        System.out.println(myRectangle.display());
//
//        // 2.1 MINI CHALLENGE
//        Dog myDog = new Dog();
//        myDog.breathe();
//        myDog.makeSound();

//        // 3. METHOD OVERRIDING: PROVIDING A NEW IMPLEMENTATION
//        Editor myEditor = new Editor();
//        CodeEditor myCodeEditor = new CodeEditor();
//        Editor polyEditor = new CodeEditor();
//
//        System.out.println("--- Regular Editor ---");
//        myEditor.openFile();
//
//        System.out.println("\n--- Code Editor ---");
//        myCodeEditor.openFile();
//
//        System.out.println("\n--- Polymorphic Editor ---");
//        polyEditor.openFile();

//        // 3.1 MINI CHALLENGE
//        GameCharacter myGameCharacter = new GameCharacter(100);
//        GameCharacter myArmoredCharacter = new ArmoredCharacter(100);
//
//        myGameCharacter.takeDamage(100);
//        System.out.println("Regular character takes 100 damage. New health: " + myGameCharacter.getHealth());
//        myArmoredCharacter.takeDamage(100);
//        System.out.println("Regular character takes 50 damage. New health: " + myArmoredCharacter.getHealth());

        // 4. INHERITING VARIABLES & ACCESS RULES + MINI CHALLENGE
        CheckingAccount myChecking = new CheckingAccount(100.0);
        myChecking.deductMonthlyFee();
    }
}