package com.bridgelabz.inheritance;

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Dog dog=new Dog();
        Cat cat=new Cat();
        Bird bird=new Bird();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
