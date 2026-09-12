import java.util.*;

class PrimeNumber
{
    public static void main(String[] args)
    {
        int n,i;
        boolean isPrime;

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number: ");
        n = sc.nextInt();

        for(i = 2; i < n; i++)
        {
            if(n%i != 0)
            {
                isPrime = true;
                System.out.println(" the number is prime. ");
            }
            else
            {
                isPrime = false;
                System.out.println("the number is not prime.");
            }
        }
    }
}