import java.util.*;

class palindrome;
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number, reverseNumber = 0, originNumber;

        System.out.print("enter the number: ");
        number = sc.nextInt();
        originNumber = number;

        while(number != 0)
        {
            number = number % 10;
            reverseNumber = reverseNumber * 10 + number;
            number = number / 10;
        }

        if(originNumber == reverseNumber)
        {
            System.out.println("the number is a palindrome.");
        }
        else
        {
            System.out.println("the number is not a palindrome.");
        }
    }
}