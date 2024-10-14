
import java.util.Scanner;

public class ifelse{
    public static void main(String[] args) {
        
        elseStatement();
    }


    static void elseStatement(){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number:");
        int a=sc.nextInt();

        if (a%2==0) {
            System.err.println("this is even number");
        }
        else{
            System.err.println("this is odd number");
        }
    }
}