import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String output = (input % 5 == 0 && input % 3 == 0) ? "FizzBuzz" : (input % 3 == 0) ? "Buzz" : (input % 5 == 0) ? "Fizz" : ""+input;
        System.out.println(output);
    }
}
