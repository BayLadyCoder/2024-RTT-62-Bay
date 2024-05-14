package org.example.GLABS.GL_303_10_polymorphism_object_type_cast_abstraction_interface.glab_303_10_2;

public class Cylinder extends Circle {
    private final double PI = Math.PI  ;

    public Cylinder(double radius, double height) {
        super(radius, height);
        // TODO Auto-generated constructor stub
    }

    public Cylinder(double radius) {
        super(radius);
    }

    /** Returns the volume of this cylinder */
    public double getVolumne() {
        return  (PI*Math.pow(super.radius, 2)) * super.height;
    }

    public double getSurfaceArea() {
        return 2.0 * Math.PI*super.radius*super.height;
    }
    @Override
    public void displayshapName() {
        System.out.println("Drawing a Cylinder for radius " + super.radius);
    }
    public String toString()
    {
        return "radius is: " + super.radius +"height is : " + super.height;

    }
}
