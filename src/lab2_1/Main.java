package lab2_1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

class Main
{

    private static void fib(int n)
    {
        int[] fibArr = new int[100];
        fibArr[0] = 1;
        fibArr[1] = 1;
        for (int i = 2; i < n; i++)
        {
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
        }

        for (int i = 0; i < n; i++)
        {
            if (i == n - 1)
            {
                System.out.printf("%d\n", fibArr[i]);
            } else
            {
                System.out.printf("%d ", fibArr[i]);
            }
        }
    }

    private static void sort(int[] num)
    {
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }

    private static void search(int[] num, int index)
    {
        Arrays.sort(num);
        int find = Arrays.binarySearch(num, index);
        if (find < 0)
        {
            find = -1;
        }
        System.out.println(find);
    }

    private static void getBirthDate(String id)
    {
        String year = id.substring(6, 10);
        String mon = id.substring(10, 12);
        String dayInMon = id.substring(12, 14);
        System.out.printf("%s-%s-%s\n", year, mon, dayInMon);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] num = {1};
        while (scan.hasNextLine())
        {
            switch (scan.nextLine())
            {
                case "fib":
                {
                    fib(scan.nextInt());
                    scan.nextLine();
                    break;
                }
                case "sort":
                {
                    String string = scan.nextLine();
                    String[] numStr = string.split(" ");
                    num = new int[numStr.length];
                    for (int i = 0; i < numStr.length; i++)
                    {
                        num[i] = Integer.parseInt(numStr[i]);
                    }
                    sort(num);
                    break;
                }
                case "search":
                {
                    search(num, scan.nextInt());
                    scan.nextLine();
                    break;
                }
                case "getBirthDate":
                {
                    int n = scan.nextInt();
                    scan.nextLine();
                    for (int i = 0; i < n; i++)
                    {
                        getBirthDate(scan.nextLine());
                    }
                    break;
                }
                default:
                {
                    System.out.println("exit");
                    break;
                }
            }
        }
    }
}
