package com.company;

public class Animal implements Nameable
{
    private String name;
    private int weight;

    Animal(String n, int w)
    {
        this.name = n;
        this.weight = w;
    }

    public String getName()
    {
        return name;
    }
    public int getWeight()
    {
        return weight;
    }
}
