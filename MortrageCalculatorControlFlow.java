import java.util.Scanner;
import java.lang.Math;

public class MortrageCalculatorControlFlow {
    public static void main(String[] args) {
        Scanner principal = new Scanner(System.in);
        Scanner intrest = new Scanner(System.in);
        Scanner period = new Scanner(System.in);
        int y;
        long p;
        double i;
        while(true){
            System.out.print("Principal (1K to 10L) : ");
            p = principal.nextLong();
            if( p < 1000 || p > 1000000) {
                System.out.println("Enter a number between 1000 and 1000000");
                continue;
            }
            else
                break;
        }
        while(true){
            System.out.print("Annual Intrest Rate : ");
            i = intrest.nextDouble();
            if (i < 0 || i > 30){
                System.out.println("Enter a value between 0 and 30");
                continue;
            }
            else
                break;
        }
        i /= 1200;
        while(true){
            System.out.print("Period (Years) : ");
            y = period.nextInt();
            if( y < 1 || y > 30){
                System.out.println("Enter a value between 1 and 30");
                continue;
            }
            else
                break;
        }
        y *= 12;
        double num = p*i*(Math.pow((1+i),y));
        double den = Math.pow((1+i), y) - 1;
        double m = (num/den)*100;
        float mortrage = (int)m;
        System.out.println("Mortrage : $"+mortrage/100);
    }
}