public class hello{
    public static void main(String[] args) {
        // System.out.println("Hello World");
        // add();
        
        hello h=new hello();
        h.num1=12;
        
        h.add();
    }

      void add(){
        int sum=num1+num2;
        System.out.println("sum of these:" + sum);
        System.err.println(num1);
    }

    int num1;
    int num2;
}

// make hello world program
class world{
    public static void main(String[] args) {
        System.err.println("hello world");
    }
}