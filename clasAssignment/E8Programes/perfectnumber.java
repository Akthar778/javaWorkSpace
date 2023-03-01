package E8Programes;

import java.util.Scanner;

public class perfectnumber {
    static int sum=0,input =0,temp=input;
    public void userinput( ){
        Scanner sc = new Scanner(System.in);
        input=sc.nextInt();
        perfect(input);
    }
    public void perfect(int input){
        for (int i = 1; i <= input; i++) {
            if (input%i ==0) {
                sum+=i;
            }
        }
        equal();
    }
    public void equal (){
        if (sum==temp){
            System.out.println("this is perfect number");
        }else{
            System.out.println(" this is not perfect number");
        }
    }
    public static void main(String[] args) {
        perfectnumber obj = new perfectnumber();
        obj.userinput();
    }

}
