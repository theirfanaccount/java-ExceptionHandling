// ATM PIN Verification with Custom Exception Handling
import java.util.Scanner;
class InvalidPinExceptiion extends Exception{   // custom exception
	@Override
	public String getMessage() {
		return "Invalid card Details! Try agaiin";
	}
}
class ATM{
	int currentPin = 1234;
	int enteredPin;
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the pin");
		enteredPin = scan.nextInt();
		
	}
	void verify() throws Exception{
		if(currentPin == enteredPin) {
			System.out.println("Collect your money");
			
		}
		else {
			InvalidPinExceptiion ipe =  new InvalidPinExceptiion();
			System.out.println(ipe.getMessage());
//			
			throw ipe;
		}
	}
	
}
class Bank{
	void init() {
		ATM atm = new ATM();
		try {
			atm.acceptInput();
			atm.verify();
		}
		catch(Exception e1) {
			try {
				atm.acceptInput();
				atm.verify();
			}
			catch(Exception e2) {
				try {
					atm.acceptInput();
					atm.verify();
				}
				catch(Exception e3) {
				
					System.out.println("Your card has been Blocked");
				}
			}
		}
	}
}

public class PinVerification {
    public static void main(String[] args){
        Bank sbi = new Bank();
		sbi.init();
    }
}
