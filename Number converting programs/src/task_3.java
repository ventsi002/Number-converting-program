public class task_3
{
    public static void main(String[] args)
    {
        char asciiSymbol;

        for(int i = 0; i <= 0xffff; i++)
        {
            asciiSymbol = (char) i;
            System.out.println(asciiSymbol + " " + Integer.toBinaryString(i));
        }
    }
}