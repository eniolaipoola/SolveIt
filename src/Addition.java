import java.util.Scanner;

public class Addition {

    public static void main(String [] args){
        int x,y;
        System.out.println("Enter the first number");

        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        System.out.println("Enter the second number");
        y = input.nextInt();

        while (y != 0){
            int operate = x & y;
            x = x ^ y;
            y = operate << 1;
        }

        System.out.println("Result is " + x);
    }
}
