package part1;

import java.util.Scanner;

public class input {
    Scanner sc = new Scanner(System.in);
    public int totalNumber()
    {
        System.out.print("How many number do you want to enter ? : ");

        return sc.nextInt();
    }
    public float inputNumber()
    {
        System.out.print("Enter your number: ");

        return sc.nextFloat();
    }
}