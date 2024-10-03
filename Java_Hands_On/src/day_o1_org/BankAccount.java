package day_o1_org;

public class BankAccount {

	long accountnumber = 4201010397257900090l;
	String holdername = ("Ajmalkhan").concat(" ").concat("M");
	Integer accbalance = 500;

	private void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Acccount Balance is " + accbalance);
	}

	public void getAccName() {
		int count = 0;
		// TODO Auto-generated method stub
		for (int print = 2; print <= 25; print++) {

			System.out
					.println("Account holder Name is " + holdername + " " + "Account Number is " + " " + accountnumber);
			count++;
		}

		System.out.println("for loop is printing " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount balancecheck = new BankAccount();
		balancecheck.getBalance();
		balancecheck.getAccName();

	}

}
