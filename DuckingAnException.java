/*
 1. if both  and  are postive. So, the power function returns the answer correctly.
 2. if both  and  are zero. So, the exception, "n and p should not be zero.", is printed.
 3. if at least one out of  and  is negative. So, the exception, "n or p should not be negative.", is printed for these two cases.
 */

import java.util.Scanner;

class MyCalculator{
	long calcPow(int n,int p) throws Exception {
		if(n<0||p<0) {
			throw new Exception("n or p should not be negative.");
		}
		if(n==0 && p==0) {
			throw new Exception("n and p should not be zero.");
		}
		else {
			return (long)Math.pow(n, p);
		}
	}
}
public class DuckingAnException {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
		MyCalculator mc = new MyCalculator();
		System.out.println("Enter the numarator");
		int n = scan.nextInt();
		System.out.println("Enter the denumanator");
		int p = scan.nextInt();
		try {
			System.out.println(mc.calcPow(n,p));
			
		}
		catch(Exception e){
			System.out.println(e);
		} 
    }
}
