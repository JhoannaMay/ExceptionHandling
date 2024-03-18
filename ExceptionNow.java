import java.util.*;
import java.util.Scanner;

public class ExceptionNow {

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        while(true) {

            try {
                int num1 = 0;
                int num2 = 0;
                double result = 0;

                System.out.print("Enter num1: ");
                num1 = input.nextInt();

                System.out.print("Enter num2: ");
                num2 = input.nextInt();

                if (num2 == 0)
                    throw new DivZeroException("Zero division is not allowed");

                result = (double) num1 / num2;

                System.out.println("Result is " + result);


            } catch (InputMismatchException e) {
                System.out.println("Only integers are allowed for input");
            }
            catch(DivZeroException e){
                System.out.println(e.getMessage());
            }
          finally{
                input.close();
                System.out.println("Program is terminated");
                System.exit(0);
            }
        }
    }
}