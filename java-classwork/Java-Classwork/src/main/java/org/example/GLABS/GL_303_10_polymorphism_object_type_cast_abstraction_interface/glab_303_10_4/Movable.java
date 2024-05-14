package org.example.GLABS.GL_303_10_polymorphism_object_type_cast_abstraction_interface.glab_303_10_4;

public interface Movable {
    // An interface defines a list of public abstract methods to be implemented by the subclasses

    void moveUp();    // "public" and "abstract" by default

    void moveDown();

    void moveLeft();

    void moveRight();

    String getCoordinate();
}
