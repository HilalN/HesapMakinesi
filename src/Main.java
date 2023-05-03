import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //defien variables
        int num1, num2, choice;

        //get numbers and operation from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.println("1-Addition \n2-Subtraction \n3-Division \n4-Multiplication");
        System.out.print("Your choice: ");
        choice = input.nextInt();

        //calculations
        switch(choice){
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                if(num2 != 0){
                    System.out.println("Result: " + ((double)num1 / (double)num2));
                }else{
                    System.out.println("A number can not divisible by zero");
                }
                break;
            case 4:
                System.out.println("Result: " + (num1 * num2));
                break;
            default:
                System.out.println("Your choice is not valid!");
        }
    }
}