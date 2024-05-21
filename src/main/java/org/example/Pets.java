package org.example;

public class Pets {
    public String animal;
    public String name;
    public int age;

    public Pets(String animal, String name, int age) {
        this.animal = animal;
        this.name = name;
        this.age = age;
    }
    public String getAnimal() {
        return animal;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}