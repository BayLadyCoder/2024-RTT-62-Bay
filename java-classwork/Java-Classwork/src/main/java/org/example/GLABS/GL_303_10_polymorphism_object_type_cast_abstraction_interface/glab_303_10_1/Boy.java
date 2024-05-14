package org.example.GLABS.GL_303_10_polymorphism_object_type_cast_abstraction_interface.glab_303_10_1;

public class Boy extends Person {
    static double   ageFactor = 1.1;

    public String talk() {
        return(super.talk() + " ... but I love Java class.");
    }
    public String walk() {
        return("I am now walking");
    }
}
