import java.util.Scanner;

public class multiplication{

    public static void main(String[] args) {
        multiplicationProgram2();
    }
    static void multiplicationProgram(){
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
    
        for (int index = 1; index <= 10; index++) {
            System.err.println("Table Of " + number + ":" + (index*number));
        }
    }
    static void multiplicationProgram2(){
        System.err.println("Enter the number:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
         
         int i=0;
         while (i<=10){
         System.out.println("Table of " + number + ":" + (i*number));
         i++;

        }
        
    }
}