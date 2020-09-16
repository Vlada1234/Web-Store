package webstore.com;

import java.util.List;

public class User {
	private String firstName;
	private String lastName;
	private double moneyBalance;
	
	
	public User(String firstName, String lastName, double moneyBalance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.moneyBalance = moneyBalance;
	}


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public double getMoneyBalance() {
		return moneyBalance;
	}

    public void setMoneyBalance(double moneyBalance) {
		this.moneyBalance = moneyBalance;
	}
	
	

	

	
	

}

