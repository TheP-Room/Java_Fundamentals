import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public class MortrageCalculatorCleanCoding {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int principal = (int)prompt("Principal",1000,1000000);
        float intrest = (float)prompt("Annual Intrest Rate",0,30)/1200;
        int time = (int)prompt("Period (Years)",1,30)*12;
        System.out.println("Mortgage: "+NumberFormat.getCurrencyInstance().format(mortgage(principal,intrest,time)));
        System.out.println("---------------------");
        balance(principal,intrest,time);
    }
    public static double mortgage(int principal, float intrest, int time){
        double numerator = Math.pow(1+intrest,time) * intrest;
        double denomerator = Math.pow(1+intrest,time) - 1;
        return principal*(numerator/denomerator);
    }
    public static double prompt(String value,int min, int max){
        System.out.print(value+": ");
        double val = sc.nextDouble();
        if (val < min || val > max){
            System.out.println("Enter value between "+min+" and "+max);
            System.out.print(value+": ");
            val = sc.nextDouble();
        }
        return val;
    }
    public static void balance(int principal, float intrest, int time){
        int paid = 1;
        System.out.println("Balance : ");
        while( paid > 0){
            double numerator = (Math.pow((1+intrest),time)-Math.pow((1+intrest),paid));
            double denominator = (Math.pow((1+intrest),time) - 1);
            double balance = principal * (numerator/denominator);
            if (balance < 0)
                break;
            System.out.println(paid+". "+NumberFormat.getCurrencyInstance().format(balance));
            paid += 1;
        }
    }
}
