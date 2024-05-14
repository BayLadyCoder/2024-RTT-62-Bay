package org.example.practice_assignments.pa_303_10_1;

public abstract class Monster {
    String name;

    Monster(String name) {
        this.name = name;
    }
    public abstract String attack();
}
