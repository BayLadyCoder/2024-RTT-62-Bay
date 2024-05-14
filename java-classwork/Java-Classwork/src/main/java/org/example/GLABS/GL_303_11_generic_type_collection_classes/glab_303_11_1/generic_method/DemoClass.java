package org.example.GLABS.GL_303_11_generic_type_collection_classes.glab_303_11_1.generic_method;

public class DemoClass {
    // create a generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }
}
