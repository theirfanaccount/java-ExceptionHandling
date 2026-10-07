import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args){
        System.out.println("connection established");
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter size of array");
            int size = scan.nextInt();
            int [] arr = new int[size];
            System.out.println("Enter Data");
            int data = scan.nextInt();
            System.out.println("Enter Index");
            int index = scan.nextInt();
            arr[index] = data;
            System.out.println(arr[index]);
        }
        catch(InputMismatchException e){
            System.out.println("please enter expexted input");
        }
        catch(NegativeArraySizeException n){
            System.out.println("please enter positive array size");
        }
        catch(IndexOutOfBoundsException i){
            System.out.println("please enter limited index [0-size-1]");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("connection is terminated");
    }
}
