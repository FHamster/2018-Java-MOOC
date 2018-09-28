package lab2_2;

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine())
        {
            StringBuilder builder = new StringBuilder();
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (b < n)
            {
                n = b;
            }
            for (int i = 0; i < n; i++)
            {
                builder.append(i);
            }
            System.out.println(builder.substring(a, b));
        }
    }
}
