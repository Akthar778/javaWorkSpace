package E8Programes;

import java.util.Scanner;

import clasAssignment.scannerProblem;

public class palindrom {
    static int f, s, t, input, rem, sum, temp = input;

    void mname() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the user number");
        input = sc.nextInt();
        palindromm(input);
    }

    void palindromm(int a) {
        while (a > 0) {
            rem = a % 10;
            sum = (sum * 10) + a;
            input = input / 10;
        }
        if (temp == sum) {
            System.out.println("this is palindrom number" + sum);

        } else {
            System.out.println("this is not a plindrom number sum is " + sum);
        }
    }

    public static void main(String[] args) {
        palindrom obj = new palindrom();
        obj.mname();
    }
}
