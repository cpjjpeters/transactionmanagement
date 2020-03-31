package be.ipeters.home.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class BankAccount {
	@Id
	private int accno;
	@Column(name="firstName")
	private String firstName;
//	@Column(name="lastName")
	private String lastName;
	private int bal;
	
	public BankAccount(int accno, String firstName, String lastName, int bal) {
		super();
		this.accno = accno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bal = bal;
	}

	public BankAccount() {
		super();
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", firstName=" + firstName + ", lastName=" + lastName + ", bal=" + bal
				+ "]";
	}
	
	
	

}
