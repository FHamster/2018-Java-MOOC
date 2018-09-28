package lab1_4;

import java.util.Scanner;

class Main
{
    private static int sum(String str)
    {
        char[] chArr = str.toCharArray();
        int sum = 0;
        for (char x : chArr)
        {
            if (Character.isDigit(x))
            {
                sum += Integer.valueOf(String.valueOf(x));
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str;
        int sumOUT;
        while (scan.hasNextLine())
        {
            sumOUT = sum(scan.nextLine());
            System.out.println(sumOUT);
        }
    }
}
