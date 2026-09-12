import java.util.*;

class GCD
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number1, number2, remainder, gcd;

        System.out.print("Enter first number: ");
        number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        number2 = sc.nextInt();

        while (number2 != 0)
        {
            remainder = number1 % number2;
            number1 = number2;
            number2 = remainder;
        }
        number1 = gcd;
    }

    System.out.println("GCD is: " + gcd);
}