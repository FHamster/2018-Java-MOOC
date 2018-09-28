package lab1_2;

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

            System.out.println(a + b);

        }
    }
}