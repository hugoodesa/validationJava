package entities;

import exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws DomainException {
		if (number < 0) {
			throw new DomainException("The number account must be valid!");
		}
		if (holder.isBlank()) {
			throw new DomainException("The holder must to have a name !");
		}
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	public void withDraw(Double amount) throws Exception {
		if (balance < amount) {
			throw new DomainException("not balance enough");
		}
		if (amount > withdrawLimit) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit ");
		}
		balance -= amount;
	}

	@Override
	public String toString() {
		return "New balance : " + balance;
	}

}
