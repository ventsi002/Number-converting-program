import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class task_1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word = "yes";
        System.out.print("Do you want to start: ");
        while (!scan.nextLine().equalsIgnoreCase("no"))
        {
            try
            {
                System.out.print("Enter a number: ");
                System.out.println("Binary: " + Integer.toBinaryString(scan.nextInt()));
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
}
