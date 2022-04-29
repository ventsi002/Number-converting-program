import java.util.InputMismatchException;
import java.util.Scanner;

public class task_2
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = "yes";
        System.out.print("Do you want to start: ");
        while (!scan.nextLine().equalsIgnoreCase("no"))
        {
            try
            {
                System.out.print("Enter a binary number: ");
                long num = scan.nextInt();
                int decimal = BinaryToDecimal(num);
                System.out.println("Decimal: " + decimal);
                System.out.print("Do you want to continue: ");
                if (scan.nextLine().equalsIgnoreCase(word))
                {
                    System.out.print("Enter a number: ");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Can't resolve this symbol try again");
            }
        }
    }

    public static int BinaryToDecimal(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;

        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }

        return decimalNumber;
    }
}
