package p1;

class EmptyNameException extends Exception{
	public String toString() {
		return "Please Enter Your Name!";
	}
}

class UnderageException extends Exception{
	public String toString() {
		return "Age is Below 17!";
	}
}

class InvalidPercentageException extends Exception{
	public String toString() {
		return "Plzz Check Percentage it must be between 0 and 1oo!";
	}
}

class NotFitForAdmissionException extends Exception{
	public String toString() {
		return "Sorry You are not able to take Admission! Percentage must be above 35";
	}
}

class FeesNotPaidException extends Exception{
	public String toString() {
		return "Plzz Pay your Fees!";
	}
}

class InsufficientFeesException extends Exception{
	public String toString() {
		return "Plzz Pay Fees atleast 30% of course";
	}
}
class AdmissionForm{
	String studentName;
	int age;
	double percentage,courseFees,feesPaid;
	public AdmissionForm(String studentName, int age, double percentage, double courseFees, double feesPaid) {
		this.studentName = studentName;
		this.age = age;
		this.percentage = percentage;
		this.courseFees = courseFees;
		this.feesPaid = feesPaid;
	}
	
	public void validateForm() throws EmptyNameException,UnderageException,InvalidPercentageException,NotFitForAdmissionException,FeesNotPaidException,InsufficientFeesException{
		if(this.studentName.length()==0) {
			throw new EmptyNameException();
		}
		
		if(this.age<17) {
			throw new UnderageException();
		}
		
		if(this.percentage<0 || this.percentage>100) {
			throw new InvalidPercentageException();
		}
		
		if(this.percentage<35) {
			throw new NotFitForAdmissionException();
		}
		
		if(this.feesPaid==0) {
			throw new FeesNotPaidException();
		}
		
		if(this.feesPaid<this.courseFees*0.30) {
			throw new InsufficientFeesException ();
		}
		
		System.out.println("Admission Successfull!");
	
	}
	
	 
	
}
public class UniversityAdmissionFormValidation {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		AdmissionForm a1 = new AdmissionForm("", 15, 20, 35000, 0);
		
		try {
			a1.validateForm();
		}
		catch(EmptyNameException ene) {
			System.out.println(ene);
		}
		
		catch(UnderageException uae) {
			System.out.println(uae);
		}
		
		catch(InvalidPercentageException ipe) {
			System.out.println(ipe);
		}
		
		catch(NotFitForAdmissionException nffa) {
			System.out.println(nffa);
		}
		
		catch(FeesNotPaidException fpe) {
			System.out.println(fpe);
		}
		
		catch(InsufficientFeesException ife) {
			System.out.println(ife);
		}
	}

}
