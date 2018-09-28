package lab1_1;

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        int a;
        int b;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt())//就是这个东西了
        {
            a = in.nextInt();
            b = in.nextInt();
            if (a > 1000)
            {
                System.out.println("a<=1000");
            } else
            {
                System.out.println(a + b);
            }
        }
    }
}