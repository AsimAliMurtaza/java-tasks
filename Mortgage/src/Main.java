import java.text.NumberFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        while(true){
            final int MONTHS = 12;
            final int percent = 100;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Principal ($1000-$1000000): ");
            int principal = scan.nextInt();
            if(principal>=1000 && principal<=1000000){
                System.out.print("Enter interest rate(1%-30%): ");
                float interest = scan.nextFloat();
                if(interest>=1 && interest <=30){
                    System.out.print("Enter Period(years): ");
                    int years = scan.nextInt();
                    if(years>=1 && years<=30){
                        double result = principal * (((interest/percent)*Math.pow(1+(interest/percent),(MONTHS*years)))/(Math.pow(1+(interest/percent),(MONTHS*years)) - 1));
                        NumberFormat cur = NumberFormat.getCurrencyInstance();
                        System.out.print(cur.format(result));
                        break;
                    }
                    else {
                        System.out.println("Enter valid years");
                    }
                }
                else {
                    System.out.println("Enter valid interest rate");
                }
            }
            else {
                System.out.println("Enter valid principal");
            }
        }
    }
}