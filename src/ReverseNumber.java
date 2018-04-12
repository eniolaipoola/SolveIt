import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String [] args){

        try{
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a valid integer number");
            int enteredNumber = input.nextInt();

            String value = Integer.toString(enteredNumber);
            System.out.println(value);

            int length = value.length();

            for(int i = length - 1; i >= 0; i--){
                int j = Character.digit(value.charAt(i), 10);
                System.out.print(j);
            }

        }catch (InputMismatchException e){
           System.out.println("Please enter a valid integer number");
        }
    }
}
