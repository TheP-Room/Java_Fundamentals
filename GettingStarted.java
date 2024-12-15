// packages are container for related classes
        /*  to specify a package use
            package com.packageName;
        */
/* we can create classes with same name under different packages it creates namespace
    we can import classes from other packages using import
    import package.className;
    */
// classes are container for related functions
// functions that are part of class are methods

/* for naming class we use PascalNamingConvention and
    for naming methods or variable identifiers we use camelCaseConvention
*/
public class GettingStarted {
    public static void main(String[] args) {
        /* public is access modifier, it states that whether the class or
            method is accessible outside

           main method is always static

           void is return type

           main is the method which will be executed first when a program runs
        */
        System.out.println("Getting Started");
        /* system is the class, out is the field inside PrintStream class
            println is the function/method inside PrintStream
        */
    }
}
/* .java file is compiled by compiler and converted into byte code .class file
    this compiler is included in java development kit (jdk)
    javac -> compiler

    .class is then converted into native code for operating system using java
    runtime environment (jre) also java virtual machine (jvm) which makes it
    os/machine independent language

    java has 4 editions
    java se (standard edition) - core java platform
    java ee (enterprise edition) - built on se for very complex applications building
    java me (micro edition) - for mobile devices, have selected libraries
    java card - for smart card
*/