package OOPConcept.Encapsulation;

public class Bank {

	private int accountNo = 123456;
	private int pinNo = 1234;
	private double balanceAmount = 100000;

	public void withdrawAmount(int accNo, int pin, int amount) {
		if (accNo == accountNo && pin == pinNo) {
			if (amount <= balanceAmount) {
				balanceAmount = balanceAmount - amount;
				System.out.println("Amount widrawal sussessfull and remaining balance is: " + balanceAmount );
			} else {
				System.out.println("Insufficient Balance !!!");
			}
			
		} else {
			System.out.println("Invalid Credentials !!!");
		}
	}
	public void updatePin(int accNo, int oldPin, int newPin) {
		if(accNo== accountNo && oldPin==pinNo) {
			pinNo=newPin;
			System.out.println("Pin changed successfully !!!");
		}
		else {
			System.out.println("Invalid Credentials");
		}
	}
	
	public void dipositeMoney(int accNo, int pin, int addAmount) {
		if(accNo==accountNo && pinNo==pin) {
			balanceAmount = balanceAmount+addAmount;
			System.out.println("The amount has been successfully added and the updated balance is" + balanceAmount);
		}
		else {
			System.out.println("Incorrect credential !!!");
		}
	}

}
