import java.util.Scanner;
// Prapogation of Exception 
//Note ;-  It is better to handle the Exception Where it occurs (For try-catch Block)
class Demo1{
    void fun1(){
        System.out.println("Connnextion 4 is established");
        
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number");
            int a = scan.nextInt();
            System.out.println("Enter 2nd number");
            int  b = scan.nextInt();
            int c = a/b;
            System.out.println(c);
        
        
            System.out.println("connection 4 is terminated");
    }
}
class Demo2{
    void fun2(){
        System.out.println("Connection 3 is established");
        Demo1 d1 = new Demo1();
        d1.fun1();
        System.out.println("connection 3 is terminated");
    }
}
class Demo3{
    void fun3(){
        System.out.println("Connection 2 is established");
        try{
            Demo2 d2 = new Demo2();
            d2.fun2();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("connection 2 is terminated");
    }
}
public class propogationOfException {
    public static void main(String[] args){
        System.out.println("Connection 1 is established");
        Demo3 d3 = new Demo3();
        d3.fun3();
        System.out.println("Connection 1 is terminated");
    }
}
