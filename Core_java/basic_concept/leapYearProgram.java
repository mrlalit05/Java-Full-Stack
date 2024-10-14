
import java.util.Scanner;

public class leapYearProgram{

// int a=12;
// int b=12;
// // int e;
// int c=a+b;
    public static void main(String[] args) {
        // leapYearProgram sc=new leapYearProgram();
        // leapYear();
        // int d=10;
        // System.err.println(sc.c);
        leapYearProgram2();
    }

    static  void leapYear(){

        Scanner sc=new Scanner(System.in);
      int  year=sc.nextInt();
        if(year%4==0){
            System.err.println("Leap Year");
        }
        else{
            System.err.println("Not Leap Year");
        }
        
    }
    static void leapYearProgram2(){
        // leapYear();
        // if()
        // Scanner sc= new Scanner(System.in);
        // int year=sc.nextInt();
        for (int i = 1995; i < 2024; i++) {
            if(i%4==0 && i%100 !=0){
                System.err.println("Leap Year:" + i);
            }
            else{
                System.err.println("Not Leap Year:" + i);
            }
        }

    
    }
   
}

