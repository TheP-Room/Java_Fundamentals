import java.util.Scanner;
import java.lang.Math;
public class MortrageCalculatorTypes {
    public static void main(String[] args){
        Scanner principal = new Scanner(System.in);
        Scanner intrest = new Scanner(System.in);
        Scanner period = new Scanner(System.in);
        System.out.print("Principal : ");
        long p = principal.nextLong();
        System.out.print("Annual Intrest Rate : ");
        double i = intrest.nextDouble()/1200;
        System.out.print("Period (Years) : ");
        int y = period.nextInt()*12;
        double num = p*i*(Math.pow((1+i),y));
        double den = Math.pow((1+i), y) - 1;
        double m = (num/den)*100;
        float mortrage = (int)m;
        System.out.println("Mortrage : $"+mortrage/100);
        //472.81 with p = 100000 , i = 3.92 , y = 30
    }
}
