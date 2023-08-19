import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.print("Enter a Number: ");
            int number = sc.nextInt();
    
            if(number % 5 == 0 && number % 3 != 0){
                System.out.println("Fizz");
            }
            else if(number % 3 == 0 && number % 5 != 0){
                System.out.println("Buzz");
            }
            else if(number % 3 == 0 && number % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(number);
            }
        }
    }
}
