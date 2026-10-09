/*
    It is done by five keyword
    1. try
    2. catch
    3. throw
    4. throws
    5. finally
 */

import java.util.Scanner;

class Calculator {
    void division () throws Exception{
        int num;
        int dem;
        System.out.println("Connection 2 Established");
        try{
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the numerator");
            num = scan.nextInt();
            System.out.println(" Enter the denominator");
            dem = scan.nextInt();
            int result = num/dem;
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println("Exception handle in method division and it throws Exception");
            throw e;
        }
        finally{
            System.out.println("Connection 2 teminated");
        }
    }
}
public class RethrowingAnException {
    public static void main(String[] args){
        System.out.println("Connection 1 Established");
        Calculator c = new Calculator();
        try{
            c.division();
        }
        catch(Exception e){
            System.out.println("Exception handled in main() Method");
           
        }
        System.out.println("Connection 1 teminated");
    }
}
