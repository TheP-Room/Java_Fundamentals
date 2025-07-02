import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;
public class MortrageCalculatorTypes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal  = sc.nextInt();
        System.out.print("Annual Intrest Rate: ");
        float intrest  = sc.nextFloat()/1200;
        System.out.print("Period (Years): ");
        int time  = sc.nextInt()*12;
        double numerator = Math.pow(1+intrest,time) * intrest;
        double denomerator = Math.pow(1+intrest,time) - 1;
        double mortgage = principal*(numerator/denomerator);
        System.out.print("Mortgage: "+NumberFormat.getCurrencyInstance().format(mortgage));
        //472.81 with p = 100000 , i = 3.92 , y = 30
    }
}
