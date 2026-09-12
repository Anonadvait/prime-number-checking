import java.util.*;

class Armtrong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number, originNum, t, prod;

        System.out.print("Enter a number: ");
        number = sc.nextInt();
        originNum = number;

        while (number != 0)
        {
            t = number % 10;
            prod = t * t * t;
            number /= 10;
            originNum -= prod;
        }

        if (originNum == 0)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}