package org.example;

public class FirstJavaClass {

    public static void main (String[] args) {
        System.out.println("Hello World!");

        byte num;   // This can hold whole number between -128 and 127.
        num = 113;
        System.out.println(num);

        short snum;
        snum = 150;
        System.out.println(snum);

        long lnum = -12332252626L;
        System.out.println(lnum);

        double dnum = -42937737.9d;
        System.out.println(dnum);

        float fnum = 19.98f;
        System.out.println(fnum);

        boolean b = false;
        System.out.println(b);

        char ch = 'Z';
        System.out.println(ch);


        // Character (char) literals are enclosed in single quotation mark. Any printable character, except for the backslash (\), can be specified this way.
        char a = 'A', nine = '9', plus = '+', tilde = '~';
        System.out.println(a);
        System.out.println(nine);
        System.out.println(plus);
        System.out.println(tilde);
        // Alternatively, we can specify a char literal as an integer literal. This code is identical to the code above:
        char aAlt = 0101, nineAlt = 57, plusAlt = 0x2b, tildeAlt = 126;
        // The integer can be specified using either decimal, octal, or hexadecimal forms.
        // The allowed range is 0 to 65535.
        System.out.println(aAlt);
        System.out.println(nineAlt);
        System.out.println(plusAlt);
        System.out.println(tildeAlt);

        // Floating point literals can be written using scientific notation
        // The ‘e’ may be either lower- or upper-case.
        double avogadrosNumber = 6.022e23;
        double plancksConstant = 6.626e-34;
        System.out.println(avogadrosNumber);
        System.out.println(plancksConstant);

        // Integer myNum = new Integer((45))
        Integer intObj = 145;
        int primitiveInt = 145;
        System.out.println(intObj.compareTo(primitiveInt));

    }
}
