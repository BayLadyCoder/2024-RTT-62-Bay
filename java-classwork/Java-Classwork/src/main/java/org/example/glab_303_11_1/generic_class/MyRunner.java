package org.example.glab_303_11_1.generic_class;

public class MyRunner {
    public static void main(String[] args) {
        // initialize generic class
        // with String and Integer data

        GenericMultipleDatatype<String, Integer> mobj = new GenericMultipleDatatype("Per Scholas", 11025);

        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        // initialize generic class
        // with String and String data
        GenericMultipleDatatype<String, String> mobj2 = new GenericMultipleDatatype("Per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());
    }
}
