package lab2_3;

import java.util.*;

public class test
{

    public static void main(String[] args)
    {
        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++)
        {
            students[i] = Student.randomStudent();
        }

//        Comparator<Student> com1 = (Student stu1, Student stu2) -> stu1.getTotal() - stu2.getTotal();

        Arrays.sort(students, (Student stu1, Student stu2) -> stu1.getTotal() - stu2.getTotal());
        for (Student x : students)
        {
            System.out.println(x);
        }
    }
}

class Student
{
    private String name;
    private int math;
    private int java;
    private int ds;
    private int avg;
    private int total;

    //构造器
    public Student(String name, int math, int java, int ds)
    {
        this.name = name;
        this.math = math;
        this.java = java;
        this.ds = ds;
        this.total = math + java + ds;
        this.avg = total / 3;
    }

    public Student(String name, int math, int java, int ds, int avg, int total)
    {
        this.name = name;
        this.math = math;
        this.java = java;
        this.ds = ds;
        this.avg = avg;
        this.total = total;
    }

    //Getter and Setter
    public void setName(String name)
    {
        this.name = name;
    }

    public void setMath(int math)
    {
        this.math = math;
        resetAvg();
        resetTotal();
    }

    public void setJava(int java)
    {
        this.java = java;
        resetAvg();
        resetTotal();
    }

    public void setDs(int ds)
    {
        this.ds = ds;
        resetAvg();
        resetTotal();
    }

    private void resetAvg()
    {
        this.avg = (math + java + ds) / 3;
    }

    private void resetTotal()
    {
        this.total = math + java + ds;
    }

    public String getName()
    {
        return name;
    }

    public int getMath()
    {
        return math;
    }

    public int getJava()
    {
        return java;
    }

    public int getDs()
    {
        return ds;
    }

    public double getAvg()
    {
        return avg;
    }

    public int getTotal()
    {
        return total;
    }

    @Override
    public String toString()
    {
        return String.format("%s %d %d %d %d %d", name, math, java, ds, avg, total);
    }

    //随机生成一个学生
    public static Student randomStudent()
    {
        return new Student("张三", getScore(), getScore(), getScore());
    }

    //获取0-100的随机数
    public static int getScore()
    {
        return (int) (Math.random() * 101);
    }


  



}