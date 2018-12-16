package com.company;

public class Main
{
    public static void main(String[] args)
    {
	    Planet planet = new Planet("Земля", 6400);
	    Animal animal = new Animal("Собака", 43);

	    System.out.println("Название планеты: " + planet.getName());
        System.out.println("Название животного: " + animal.getName());
    }
}
