package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Pets mops = new Pets("Mops", "Basya", 5);
        System.out.println(String.format("animal: %s, name: %s, age: %s", mops.getAnimal(),mops.getName(), mops.getAge()));
        System.out.println("~~~"+mops.getAnimal()+mops.getName()+mops.getAge()+"~~~");
    }
}
