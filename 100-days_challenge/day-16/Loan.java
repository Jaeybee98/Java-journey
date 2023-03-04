//import Date
import java.util.Date;

class Loan {

	 private double annualInterestRate;
	 private int numberOfYears;
	 private double loanAmount;
	 private Date loanDate;

	 //default constructor
	 public Loan() {
		 this(2.5, 1, 1000);
	}

	//loan with specifics
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new Date();
	}

	//return annual interest rate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	//set annual interest rate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	//return number of years
	public int getNumberOfYears() {
		return numberOfYears;
	}

	//set new number of years
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	//return loan amount
	public double getLoanAmount() {
		return loanAmount;
	}

	//set new loan amount
	 public void setLoanAmount(double loanAmount) {
		 this.loanAmount = loanAmount;
	 }

	 //find monthly payment
	 public double getMonthlyPayment() {
		 double monthlyInterestRate = annualInterestRate / 1200;
		 double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		 return monthlyPayment;
	 }

	 //find total payment
	 public double getTotalPayment() {
		 double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		 return totalPayment;
	 }

	 //return loan date
	 public Date getLoanDate() {
		 return loanDate;
	}
}
