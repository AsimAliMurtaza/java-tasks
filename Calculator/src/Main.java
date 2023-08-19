import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello to my simple calculator");
        int choice = 0;
        while(choice !=7){
            choice = calMenu();
            switch (choice){
                case 1:
                    System.out.print("Enter first number: ");
                    a = scan.nextInt();
                    System.out.print("Enter second number: ");
                    b = scan.nextInt();
                    System.out.println("Output is : " + addNumbers(a,b));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    a = scan.nextInt();
                    System.out.print("Enter second number: ");
                    b = scan.nextInt();
                    System.out.println("Output is : " + subNumbers(a,b));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    a = scan.nextInt();
                    System.out.print("Enter second number: ");
                    b = scan.nextInt();
                    System.out.println("Output is : " + divNumbers(a,b));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    a = scan.nextInt();
                    System.out.print("Enter second number: ");
                    b = scan.nextInt();
                    System.out.println("Output is : " + multNumbers(a,b));
                    break;
                case 5:
                    System.out.print("Enter your number: ");
                    a = scan.nextInt();
                    System.out.println("Output is : " + squareRoot(a));
                    break;
                case 6:
                    System.out.print("Enter your number: ");
                    a = scan.nextInt();
                    System.out.print("Enter power of the number: ");
                    b = scan.nextInt();
                    System.out.println("Output is : " + power(a,b));
                    break;
            }
        }
    }
    public static int calMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Add two numbers");
        System.out.println("2. Sub two numbers");
        System.out.println("3. Div two numbers");
        System.out.println("4. Mult two numbers");
        System.out.println("5. Square root of a number");
        System.out.println("6. Take power of a number");
        System.out.println("7. Exit");

        return scan.nextInt();
    }
    public static int addNumbers(int a, int b){
        return a+b;
    }
    public static int subNumbers(int a, int b){
        return a-b;
    }
    public static int divNumbers(int a, int b){
        return a/b;
    }
    public static int multNumbers(int a, int b){
        return a*b;
    }
    public static double squareRoot(int a){
        return Math.sqrt(a);
    }
    public static double power(int a, int b){
        return Math.pow(a, b);
    }
}