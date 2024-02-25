import java.util.*;
public class HarmonicSequence
{
    public void printHarmonicSequence(int numberOfTerms)
    {
        for(int i = 1; i <= numberOfTerms; i++)
        {
            if(i == 1)
            {
                System.out.print("The first term of the harmonic sequence: ");
            }
            else
            {
                System.out.print("The first " + i + " terms of the harmonic sequence: ");
            }
            for(int j = 1; j <= i; j++)
            {
                if(j == i)
                {
                    System.out.println("1/" + j);
                }
                else
                {
                    System.out.print("1/" + j + ", ");
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many terms of the harmonic sequence would you like to see?");
        int numberOfTerms = scanner.nextInt();
        HarmonicSequence harmonicSequence = new HarmonicSequence();
        harmonicSequence.printHarmonicSequence(numberOfTerms);
    }
}
