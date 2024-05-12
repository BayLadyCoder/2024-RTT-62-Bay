package org.example.glab_303_11_1.generic_class;

public class GenericMultipleDatatype<Datatypeone, DatatypeTwo> {
    Datatypeone valueOne;
    DatatypeTwo valueTwo;

    public GenericMultipleDatatype(Datatypeone v1, DatatypeTwo v2) {
        this.valueOne = v1;
        this.valueTwo = v2;
    }

    public Datatypeone getValueOne() {
        return valueOne;
    }

    public void setValueOne(Datatypeone valueOne) {
        this.valueOne = valueOne;
    }

    public DatatypeTwo getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(DatatypeTwo valueTwo) {
        this.valueTwo = valueTwo;
    }
}
