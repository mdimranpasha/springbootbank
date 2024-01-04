package com.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {
	@Id
	private long account_number;
	private String name;
	private String password;

	private double amount;
	private long mobilenum;
	private String status;

	public Bank() {
		super();
	}

	public Bank(long account_number, String name, String password,   double amount,
			long mobilenum, String status) {
		super();
		this.account_number = account_number;
		this.name = name;
		this.password = password;

		this.amount = amount;
		this.mobilenum = mobilenum;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bank [account_number=" + account_number + ", name=" + name + ", password=" + password + ", amount="
				+ amount + ", mobilenum=" + mobilenum + ", status=" + status + "]";
	}

	public long getAccount_number() {
		return account_number;
	}

	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public long getMobilenum() {
		return mobilenum;
	}

	public void setMobilenum(long mobilenum) {
		this.mobilenum = mobilenum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;

	}

}
