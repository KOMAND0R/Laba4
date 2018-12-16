package com.company;

public class Planet implements Nameable
{
    private  String name;
    private int radius;

    Planet(String n, int r)
    {
        this.name = n;
        this.radius = r;
    }

    public String getName()
    {
        return name;
    }
    public int getRadius()
    {
        return radius;
    }
}
