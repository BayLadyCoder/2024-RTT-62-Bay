package org.example.GLABS.GL_303_10_polymorphism_object_type_cast_abstraction_interface.glab_303_10_1;

public class Person {
    String name;
    static int lifeSpan = 60;
    static double ageFactor = 1.0;

    public Person() {

        name = "";
    }

    public Person(String aName) {
        name = aName;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public String toString() {
        return ("Hello, my name is " + name);
    }

    public String talk() {
        return ("I have nothing to say.");
    }

    public String walk() {
        return ("I have nowhere to go.");
    }

    public static double lifeSpan() {
        return (lifeSpan * ageFactor);
    }

}
