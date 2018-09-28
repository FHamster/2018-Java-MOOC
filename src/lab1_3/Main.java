package lab1_3;

import java.util.Scanner;

class Main
{
    private static void f2(int n)
    {
        String strBin = Integer.toBinaryString(n);
        String strOct = Integer.toOctalString(n);
        String strHex = Integer.toHexString(n);
        System.out.printf("%s,%s,%s\n", strBin, strOct, strHex);
    }
    private static void f1(int n)
    {
        Integer num = Math.abs(n);
        String str = num.toString();
        char[] charArr = str.toCharArray();

        Integer sum = 0;

        for (char x : charArr)
        {
            System.out.printf("%c ",x);
            sum += Integer.valueOf(String.valueOf(x));
        }
        System.out.printf("%d\n",sum);

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num;
        while (scan.hasNextInt())
        {
            num = scan.nextInt();
            if (10000 <= num & num <= 20000)
            {
                f2(num);
            }else
            {
                f1(num);
            }
        }
    }
}
