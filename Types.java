public class Types {
    public static void main(String[] args){
        /* Variables - containers for data/value
            variable name is called identifier
        */

        /* Primitive types for storing simple values (number,char,boolean)
            Primitive types of variables -- total 8
            byte -- 1 byte
            short -- 2 bytes
            int -- 4 bytes
            long -- 8 bytes
            float -- 4 bytes
            double -- 8 bytes
            char -- 2 bytes
            boolean -- 1 byte True/False
        */

        /* You can put underscore for representing "," in number system
            10_244_134 -- international number system

           for using long data type use "L" or "l" in the last of number
           same with float use "F" or "f" at the last
        */

        /* Refrence types for storing complex data (date,mail message)
            all types other than 8 primitive such as objects for classes or
            strings

           refrence types are declared with new keyword and have to provide
            memory space for them

           refrence types are copied by their refrences while primitive are
            copied by their value means primitive variables are independent of
            each other and change made in one will not be visible in other
            while in refrence type the change made through any means is
            universal
        */

        String n1 = new String("Conventional");
        String n2 = "Also Accepted"; // shorter way for easy use
        System.out.println(n1);
        System.out.println(n2);
        // here we can initialize string as primitives but they are refrence
        /* as String is a class and n1 is an object it will have members
            which can be accessed using dot operator

            strings are immutable in java, applying any method to string will
            not change the original string

            methods such as
            startsWith()
            endsWith()
            length()
            indexOf()
            replace()
            toLowerCase()
            toUpperCase()
            trim() -- remove useless whitespaces

            escape sequences are used in string for multi purpose
            "\\" for \
            "\"" for "
            "\n" for new line
            "\t" for tab space
        */

        /* Arrays is list of items and is refrence type
            int[] name = new int[size];
            int[] name1 = {0,1,3,4};

            to print array we use toString method under Arrays class in
            java.util package
            Arrays.toString(name);

            2D arrays
            int[][] name = new int[row_size][col_size];
            int[][] name 1 = { {1,2,3}, {3,4,6} };

            to print 2D array we use deepToString method under Arrays class in
            java.util package
            Arrays.deepToString(name);
        */

        /* Constants are used for variables to disable any changes to them
            final keyword is used to make a variable constant

            final int PI = 3.14;

            convention used for naming identifier of constant is all uppercase
            for naming a boolean we use prefix such as is, has
        */

        /* Arithmetic Expressions are simply +,-,*,/,%, x++, ++x, +=, etc

            if y = x++;
            then x is copied to y first and then x is incremented
            if y = ++x;
            then first x is incremented and then copied to y
        */

        /* Casting is done to perform operation on two different data types
            implicit casting is automatic casting and has a pattern
            byte < short < int < long < float < double

            to get int or other number type from a string we use parseInt()
            method inside Integer class of java.lang package

            Integer.parseInt()
            Float.parseFloat()
            Byte.parseByte()
            Short.parseShort()
            Long.parseLong()
            Double.parseDouble()

            or for numeric types we can add (int) or (float) or (double) before
            the value of variable
        */

        /* we can use Math class under java.lang package for various math functions
            pow() - power
            ceil() - round off to greatest
            floor() - round off to smallest
            random() - random number generate
            round() - round off
            max() - maximum among
        */

        /* for getting input from user we use Scanner class from java.util package
            scanner name = new scanner(System.in);
            System.in specifies that input is taken from terminal
            instead of this we can also take input from any file

            name.nextInt();
            nextByte
            nextLong
            nextDouble
            next -- take only 1 token as input "The Input" results in "The"
            nextLine -- take all tokens
        */

    }
}
