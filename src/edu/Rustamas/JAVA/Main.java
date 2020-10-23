package edu.Rustamas.JAVA;

public class Main {

    public static void main(String[] args) {
        Eyes eyes = new Eyes();
        Mouth mouth = new Mouth();
        Head head = new Head(eyes, mouth);
        Arms arms = new Arms();
        Legs legs = new Legs();
        Human man = new Human("Adam", "None", 33, 1.90D, 90D, "Male", "European", "Luxembourger", "Green", "Brown", "White", false, head, legs, arms, true, 1);
        System.out.println(man);
        man.getArms().takeThings();
        man.getLegs().walkAround();
        man.getHead().getEyes().look();
        man.getHead().getMouth().speak();
    }
}