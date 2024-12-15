public class CleanCoding {
    public static void main(String[] args){
        greetUser("Mosh"); // calling a method with passing argument
    }
    public static void greetUser(String name){
        /* public is access modifier
            static means that this method belongs to class and not to an object
            void is return type here
            inside parantheses we are specifying an input variable called parameter
        */
        System.out.println("Hi "+name);
    }
}
