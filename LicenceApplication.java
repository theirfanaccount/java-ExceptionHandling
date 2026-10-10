import java.util.Scanner;
class underAgeException extends Throwable{
	@Override
	public String getMessage() {
		
		return "Not applicable! Have Patience";
	}
}
class overAgeException extends Exception{
	@Override
	public String getMessage() {
		return "You are too old! cool down";
		
	}
}
class Applicant{
	int enteredAge;
	void inputAge(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		enteredAge = scan.nextInt();
	}
	void checkAge() throws Throwable {
		if(enteredAge>=18&&enteredAge<=70) {
			System.out.println("Application submited");
		}
		else if(enteredAge<18) {
			underAgeException uae = new underAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else {
			overAgeException oae = new overAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
	}
}
class RTO{
	void init() {
		Applicant a = new Applicant();
		try {
			a.inputAge();
			a.checkAge();
			
		}
		catch(Throwable e1) {
			try {
				a.inputAge();
				a.checkAge();
			}
			catch(Throwable e2) {
				System.out.println("Try after 15 Days");
			}
		}
	}
	
}
public class LicenceApplication {
    public static void main(String[] args){
        RTO rto = new RTO();
        rto.init();
    }
}
