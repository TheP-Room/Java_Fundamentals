import java.util.Scanner;

public class MortrageCalculatorCleanCoding {
    public static void main(String[] args){
        long p = (long)readNumber("Principal (1k to 10L) : ",1000, 1000000);
        double i = readNumber("Annual Intrest : ",0,30);
        i /= 1200;
        int y = (int)readNumber("Period (Years) : ",1, 30);
        y *= 12;
        float mortrage = (float)calculatorMortrage(p,i,y)/100;
        System.out.println("Mortrage : $"+mortrage);
        leftOver(mortrage,p);
    }
    public static int calculatorMortrage(long p, double i, int y){
        double num = p*i*(Math.pow((1+i),y));
        double den = Math.pow((1+i), y) - 1;
        double m = (num/den)*100;
        return (int)m;
    }
    public static double readNumber(String prompt, int min, long max){
        Scanner sc = new Scanner(System.in);
        double value;
        while(true){
            System.out.print(prompt);
            value = sc.nextDouble();
            if( value < min || value > max)
                System.out.println("Enter a number between "+min+" and "+max);
            else {
                break;
            }
        }
        return value;
    }
    public static void leftOver(float mortrage, double p){
        double leftOver;
        int i = 1;
        leftOver = p-mortrage;
        while (leftOver > 0){
            System.out.println("Balance after Month "+i+" -> "+leftOver);
            p = leftOver;
            leftOver = p - mortrage;
            i++;
        }
    }
}
