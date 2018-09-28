package lab2_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        Birth[] births = new Birth[n];
        for (int i = 0; i < n; i++)
        {
            births[i] = new Birth(scan.nextLine());
        }

        Arrays.sort(births, (Birth o1, Birth o2) -> o1.getYearmonday() - o2.getYearmonday());

        Scanner scanner = new Scanner(System.in);
        String str;
        out:
        while (true)
        {
            str = scanner.nextLine();
            switch (str)
            {
                case "sort1":
                {
                    for (Birth x : births)
                    {
                        System.out.println(x);
                    }
                    break;
                }
                case "sort2":
                {
                    for (Birth x : births)
                    {
                        System.out.println(x.getID());
                    }
                    break;
                }
                case "e":
                {
                    System.out.println("exit");
                    break out;
                }
            }
        }
    }

    private static Birth[] readBirth()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        Birth[] arr = new Birth[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = new Birth(scan.nextLine());
        }
        return arr;
    }
}

class Birth
{
    private String ID;
    private int yearmonday;
    private int year;
    private int mon;
    private int day;

    public String getID()
    {
        return ID;
    }

    public int getYearmonday()
    {
        return yearmonday;
    }

    Birth(String ID)
    {
        this.ID = ID;
        this.yearmonday = Integer.parseInt(ID.substring(6, 14));
        this.year = Integer.parseInt(ID.substring(6, 10));
        this.mon = Integer.parseInt(ID.substring(10, 12));
        this.day = Integer.parseInt(ID.substring(12, 14));
    }

    @Override
    public String toString()
    {
        return String.format("%04d-%02d-%02d", year, mon, day);
    }
}